package com.day01;

public class MyThread8 implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根  
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(i+1));
		}
	}
	
	public static void main(String[] args) {
		//创建接口对象
		MyThread8 runnable = new MyThread8();
		
//		Thread t1 = new Thread(runnable);
//		Thread t2 = new Thread(runnable);
		
		Thread t1 = new Thread(runnable,"t1");
		Thread t2 = new Thread(runnable,"t2");
		
		t1.start();
		t2.start();
		
	}

}
