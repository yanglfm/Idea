package com.day02;

public class SellTicket2 implements Runnable{
	
	private static int tickets=50;

	@Override
	public void run() {
		while(true) {
			//��Ʊ����
			if(tickets>0) {
				//ģ������
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
			}else {
				break;
			}
		}
	}

}
