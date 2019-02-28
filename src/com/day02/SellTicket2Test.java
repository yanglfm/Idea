package com.day02;

public class SellTicket2Test {

	public static void main(String[] args) {
		//把接口对象作为目标存放到线程构造方法中
		SellTicket2 target = new SellTicket2();
	
		Thread s1 = new Thread(target);
		Thread s2 = new Thread(target);
		Thread s3 = new Thread(target);
		
		
		s1.setName("窗口1");
		s2.setName("窗口2");
		s3.setName("窗口3");
		
		s1.start();
		s2.start();
		s3.start();
	}
}
