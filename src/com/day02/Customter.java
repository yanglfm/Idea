package com.day02;

public class Customter extends Thread{

	//��������Ϊ���Դ��
	private Shelf shelf;
	//������ٴ�
	private int count;
	
	public Customter(String name,Shelf shelf,int count) {
		super(name);
		this.shelf = shelf;
		this.count = count;
	}
	
	public void run() {
		for (int i = 1; i <= count; i++) {
			//����
			shelf.out();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
