package com.day02;

public class SellTicket1 extends Thread{

	private static int tickets=50;

	@Override
	public void run() {
		while(true) {
			//��Ʊ����
			if(tickets>0) {
				System.out.println(getName()+"�����۳���"+(tickets--)+"��Ʊ");
			}else {
				break;
			}
		}
	}
	
}
