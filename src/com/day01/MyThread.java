package com.day01;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("好好学习 天天向上！");
	}
	
	public static void main(String[] args) {
		//创建实例
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		//启动线程
	/*	my.run();
		//为什么是单线程？run方法仅仅是封装线程的代码，直接调用只是普通对象.方法名的调用方式
		my.run();*/
		
		/*my.start();
		my.start();*/
		my1.start();
		my2.start();
		
	}
}
