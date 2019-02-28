package com.day01;

public class MyThread3 extends Thread{
	
	public MyThread3(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+":"+(i+1));
		}
	}
	
	public static void main(String[] args) {
		
		MyThread3 my1 = new MyThread3("t1");
		MyThread3 my2 = new MyThread3("t2");
		
		//对线程的优先级设定
		my1.setPriority(MAX_PRIORITY);
		
		System.out.println("Priority:"+my1.getPriority());//Priority:10
		System.out.println("Priority:"+my2.getPriority());//Priority:5
		
		my1.start();
		my2.start();
		
	}
}
