package com.day01;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("�ú�ѧϰ �������ϣ�");
	}
	
	public static void main(String[] args) {
		//����ʵ��
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		//�����߳�
	/*	my.run();
		//Ϊʲô�ǵ��̣߳�run���������Ƿ�װ�̵߳Ĵ��룬ֱ�ӵ���ֻ����ͨ����.�������ĵ��÷�ʽ
		my.run();*/
		
		/*my.start();
		my.start();*/
		my1.start();
		my2.start();
		
	}
}
