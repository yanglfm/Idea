package com.day02;

public class ThreadDeamTest {

	public static void main(String[] args) {
		
		//�����ػ��̶߳���
		ThreadDeam t1 = new ThreadDeam();
		ThreadDeam t2 = new ThreadDeam();
		
		//���߳���������
		t1.setName("�ŷ�");
		t2.setName("����");
		
		//�����ػ��߳�
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		//���߳�
		Thread.currentThread().setName("����");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(i+1));
		}
		
	}
}
