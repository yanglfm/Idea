package com.day02;

public class SellTicket5 implements Runnable{
	
	private static int tickets=50;
	
	private boolean flag=true;
	@Override
	public void run() {
		while(flag) {
			
			sellTickets();
			
		}
	}

	//ͬ������ķ���
	private synchronized boolean sellTickets() {
		if(tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
			return flag;
		}else {
			flag = false;
			return flag;
		}
	}
}
