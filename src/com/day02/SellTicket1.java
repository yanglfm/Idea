package com.day02;

public class SellTicket1 extends Thread{

	private static int tickets=50;

	@Override
	public void run() {
		while(true) {
			//有票可售
			if(tickets>0) {
				System.out.println(getName()+"正在售出第"+(tickets--)+"张票");
			}else {
				break;
			}
		}
	}
	
}
