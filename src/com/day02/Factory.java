package com.day02;

public class Factory extends Thread{

	//��������Ϊ���Դ��
	private Shelf shelf;
	//����������Ʒ������
	private int count;
	
	public Factory(String name,Shelf shelf,int count) {
		super(name);
		this.shelf = shelf;
		this.count = count;
	}
	
	public void run() {
		for (int i = 1; i <= count; i++) {
			//������Ʒʵ������
			Product p = new Product();
			shelf.in(p);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
