package com.day01;

public class MyThread7 extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+":"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			//ʹ��yield���� public static void yield():�Ե��ȳ����һ����ʾ������ǰ�߳�Ը�������ǰʹ�õĴ������� ���ȳ���������ɵغ��������ʾ��
			//���ǲ���֤һ��һ�ε����   
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		
		t1.setName("����");
		t2.setName("����");
		
		t1.start();
		t2.start();
	}
}
