package com.day01;

public class SellTicket2 implements Runnable{
	//���趨��һ����Ʊ
	private static int tickets=50;
	
	public void run() {
		
		//������Ʊ����
		while(true) {
			//��Ϣ��
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			//�ж�Ʊһ�����Ǹ�����0
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		//Ʊ��Ŀ�� ��ͬһ������
		
		SellTicket2 target = new SellTicket2();
		
		Thread t1 = new Thread(target, "t1");
		Thread t2 = new Thread(target, "t2");
		Thread t3 = new Thread(target, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
