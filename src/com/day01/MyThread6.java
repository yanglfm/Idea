package com.day01;

import java.util.Date;

public class MyThread6 extends Thread{

	public void run() {
		System.out.println("��ʼʱ�䣺"+new Date());
		//��Ҫ��Ϣ5��ʱ�� 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("�ұ�ǿ���ж���");
		}
		System.out.println("����ʱ�䣺"+new Date());
	}
	
	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		t.setName("t1");
		t.start();
		
		//����3�� ��ǰ���߳̾�Ҫ��ֹ
		try {
			Thread.sleep(3000);
//			t.stop();
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
