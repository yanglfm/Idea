package com.day01;

public class MyThread5 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(i+1));
		}
	}
	
	public static void main(String[] args) {
		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();
		MyThread5 t3 = new MyThread5();
		
		/**
		 * public final void join(long millis)
                throws InterruptedException
               	�ȴ�����߳�������ʱ�����Ϊmillis���롣 0�ĳ�ʱ��ζ����Զ�ȴ��� 
		 */
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
	}
}
