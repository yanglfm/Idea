package com.day01;

import java.util.Date;

public class MyThread6 extends Thread{

	public void run() {
		System.out.println("开始时间："+new Date());
		//我要休息5秒时间 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("我被强制中断了");
		}
		System.out.println("结束时间："+new Date());
	}
	
	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		t.setName("t1");
		t.start();
		
		//给你3秒 当前的线程就要终止
		try {
			Thread.sleep(3000);
//			t.stop();
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
