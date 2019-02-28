package com.day03;

public class Singleton {

	//����һ������
	private static Singleton instance=null;
	//˽�й��췽��
	private Singleton() {
		
	}
	
	//�ṩһ�������������ҷ���ֵ�����;��������� 
	//��̬���η� ���������ṩ����
	public static Singleton getInstance() {
		if(instance==null) {
			//ʵ����
			instance = new Singleton();
		}
		return instance;
	}
	
}
