package com.day02;

public class Exam1 extends Thread{
	private Object obj;
	/**
	 * 
	 * @param obj  �Ƿ���ͬһ������
	 * @param name �̵߳�����
	 */
	public Exam1(Object obj,String name) {
		super(name);
		this.obj = obj;
	}
	
	public void run() {
		synchronized (obj) {
			try {
				System.out.println(this.getName()+"����������");
				obj.wait();
				System.out.println(this.getName()+"����ִ��");
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Exam1 ex = new Exam1(new Object(), "t1");
		ex.start();
	}
}
