package com.day02;

public class SellTicket7Test {

	public static void main(String[] args) {
		//Ʊ�Ķ���
		Ticket ticket = new Ticket();
		
		//�����߳�
		SellTicket7 t1 = new SellTicket7(ticket, "����A");
		SellTicket7 t2 = new SellTicket7(ticket, "����B");
		SellTicket7 t3 = new SellTicket7(ticket, "����C");
		
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}
}
