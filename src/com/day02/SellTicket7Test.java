package com.day02;

public class SellTicket7Test {

	public static void main(String[] args) {
		//票的对象
		Ticket ticket = new Ticket();
		
		//创建线程
		SellTicket7 t1 = new SellTicket7(ticket, "窗口A");
		SellTicket7 t2 = new SellTicket7(ticket, "窗口B");
		SellTicket7 t3 = new SellTicket7(ticket, "窗口C");
		
		//开启线程
		t1.start();
		t2.start();
		t3.start();
		
	}
}
