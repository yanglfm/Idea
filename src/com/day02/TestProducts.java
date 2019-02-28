package com.day02;

public class TestProducts {

	public static void main(String[] args) {
		//����
		Shelf shelf = new Shelf(10);
		
		//���峧���߳�
		Factory f1 = new Factory("����1", shelf, 10);
		Factory f2 = new Factory("����2", shelf, 10);
		Factory f3 = new Factory("����3", shelf, 10);
		
		//���������˿��߳�
		Customter c1 = new Customter("�˿�1", shelf, 5);
		Customter c2 = new Customter("�˿�2", shelf, 5);
		
		//�����߳�
		f1.start();
		f2.start();
		f3.start();
	
		c1.start();
		c2.start();
	}
}
