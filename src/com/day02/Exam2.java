package com.day02;

public class Exam2 extends Thread{

	private Object obj;
	
	public Exam2(Object obj,String name) {
		super(name);
		this.obj = obj;
	}
	
	public void run() {
		synchronized (obj) {
			System.out.println(this.getName()+"唤醒了obj对象");
			obj.notify();
		}
	}
	
	public static void main(String[] args) {
		
		//创建锁对象 lock
		Object obj = new Object();
		
		Exam1 ex1 = new Exam1(obj, "A线程");
		Exam2 ex2 = new Exam2(obj, "B线程");
		
		ex1.start();
		ex2.start();
	}
}
