package com.day02;

public class SellTicket6 implements Runnable{
	
	private static int tickets=50;
	
	private boolean flag=true;
	@Override
	public void run() {
		while(true) {
			
			sellTickets();
			if(tickets==0) {
				break;
			}
			
		}
	}

	//ͬ������ķ���
	private synchronized void sellTickets() {
		if(tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
			
		}
	}
}
