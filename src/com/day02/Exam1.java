package com.day02;

public class Exam1 extends Thread{
	private Object obj;
	/**
	 * 
	 * @param obj  是否是同一个对象
	 * @param name 线程的名称
	 */
	public Exam1(Object obj,String name) {
		super(name);
		this.obj = obj;
	}
	
	public void run() {
		synchronized (obj) {
			try {
				System.out.println(this.getName()+"即将被阻塞");
				obj.wait();
				System.out.println(this.getName()+"继续执行");
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Exam1 ex = new Exam1(new Object(), "t1");
		ex.start();
	}
}
