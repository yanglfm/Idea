package com.day02;

public class SellTicket3 implements Runnable{
	
	private int tickets=50;

	//������һ����
	private Object obj = new Object();
	/*@Override
	public void run() {
		while(true) {
			//����ͬ������
			synchronized (new Object()) {
				//��Ʊ����
				if(tickets>0) {
					//ģ������
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
				}else {
					break;
				}
			}
			
		}
	}*/
	
	@Override
	public void run() {
		while(true) {
			//����ͬ������
			synchronized (obj) {
				//��Ʊ����
				if(tickets>0) {
					//ģ������
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
				}else {
					break;
				}
			}
			
		}
	}

}
