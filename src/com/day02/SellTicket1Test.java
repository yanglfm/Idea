package com.day02;

public class SellTicket1Test {

	//��Ʊ������������ ׼����Ʊ  ��Ҫע�����Ʊ��Ӧ�÷��ʵ���ͬһ������
	public static void main(String[] args) {
		
		SellTicket1 s1 = new SellTicket1();
		SellTicket1 s2 = new SellTicket1();
		SellTicket1 s3 = new SellTicket1();
		
		s1.setName("����1");
		s2.setName("����2");
		s3.setName("����3");
		
		s1.start();
		s2.start();
		s3.start();
		
	}
}
