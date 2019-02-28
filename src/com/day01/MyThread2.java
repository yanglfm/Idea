package com.day01;

public class MyThread2 extends Thread{
	
	public MyThread2(String name) {
		super(name);
	}
	
	public void run() {
//		System.out.println("�ú�ѧϰ �������ϣ�");
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+":"+(i+1));
		}
	}
	
	public static void main(String[] args) {
		//����ʵ��
//		MyThread2 my1 = new MyThread2();
//		MyThread2 my2 = new MyThread2();
		
		MyThread2 my1 = new MyThread2("t1");
		MyThread2 my2 = new MyThread2("t2");
		//��������
//		my1.setName("t1");
//		my2.setName("t2");
		
		my1.start();
		my2.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}
}
