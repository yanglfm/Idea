package com.day02;

public class SellTicket2Test {

	public static void main(String[] args) {
		//�ѽӿڶ�����ΪĿ���ŵ��̹߳��췽����
		SellTicket2 target = new SellTicket2();
	
		Thread s1 = new Thread(target);
		Thread s2 = new Thread(target);
		Thread s3 = new Thread(target);
		
		
		s1.setName("����1");
		s2.setName("����2");
		s3.setName("����3");
		
		s1.start();
		s2.start();
		s3.start();
	}
}
