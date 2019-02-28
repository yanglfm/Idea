package com.test;

import java.util.ArrayList;



public class Seat {
	private int max;
	private ArrayList<Person> person;
	public Seat(int max) {
		this.max = max;
		//��ȡ��ʼ��
		person = new ArrayList<>();
	}
	//������ʼ����
	public synchronized void in(Person p){
		//���������˵�ʱ�����ȴ�
		while (person.size()>=max) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}//����ѭ����ζ�Ų������Խ���
		person.add(p);
		System.out.println(Thread.currentThread().getName()+"�����ϲ�������������"+person.size()+"����");
		notifyAll();
	}
	
	public synchronized void out() {
		//������û�˾Ͳ���Ҫ�Ƴ���out����ȴ�������
		
		while(person.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		person.remove(0);
		notifyAll();
		
	}

}
