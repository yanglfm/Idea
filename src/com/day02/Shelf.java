package com.day02;

import java.util.ArrayList;

//����
public class Shelf {
	//�����ϻ�����
	private int max;
	//�����ϵĻ�ȡ
	private ArrayList<Product> products;
	
	public Shelf(int max) {
		this.max = max;
		//��ȡ��ʼ��
		products = new ArrayList<>();
	}
	
	//�������ϻ����ɳ���������
	public synchronized void in(Product p) {
		//��������ϵĻ������˾�һֱ�ȴ�
		while(products.size()>=max) {
			//���������߳�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//����ѭ������ζ�Ż����ϲ��������ϻ�
		products.add(p);
		System.out.println(Thread.currentThread().getName()+"��һ����Ʒ���ϻ��ܣ���ǰ�Ĳ�Ʒ��ĿΪ��"+products.size());
		//���������߳�
		notifyAll();
	}
	
	//�ӻ������û� ��������������������
	public synchronized void out() {
		//�������ǿյ�״̬��һֱ�ȴ���
		while(products.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//����ѭ��˵���������ж���
		products.remove(0);
		System.out.println(Thread.currentThread().getName()+"���߲�Ʒ����ǰ�����ϵ����в�Ʒ��ĿΪ��"+products.size());
		
		//�������й˿��߳�
		notifyAll();
	}
}
