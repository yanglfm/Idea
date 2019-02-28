package com.day02;

public class SellTicket1Test {

	//售票创建三个窗口 准备售票  需要注意的事票是应该访问的是同一本数据
	public static void main(String[] args) {
		
		SellTicket1 s1 = new SellTicket1();
		SellTicket1 s2 = new SellTicket1();
		SellTicket1 s3 = new SellTicket1();
		
		s1.setName("窗口1");
		s2.setName("窗口2");
		s3.setName("窗口3");
		
		s1.start();
		s2.start();
		s3.start();
		
	}
}
