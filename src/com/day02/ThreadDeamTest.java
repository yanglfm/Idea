package com.day02;

public class ThreadDeamTest {

	public static void main(String[] args) {
		
		//创建守护线程对象
		ThreadDeam t1 = new ThreadDeam();
		ThreadDeam t2 = new ThreadDeam();
		
		//给线程设置名称
		t1.setName("张飞");
		t2.setName("关羽");
		
		//设置守护线程
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		//主线程
		Thread.currentThread().setName("刘备");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(i+1));
		}
		
	}
}
