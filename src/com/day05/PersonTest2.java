package com.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class PersonTest2 {

	//�����л���ȡ�ļ��е�����
	public static void main(String[] args) throws Exception {
		//������ȡ������
		InputStream in = new FileInputStream("src/a.txt");
		//�����ַ����� �ͼ���⻺���ڴ�����
		byte [] bys = new byte[10];
		//���ȵ�����
		int len = -1;
		//���������л�
		ObjectInputStream o = new ObjectInputStream(in);
		//��ȡ����
		Person p = (Person) o.readObject();
		System.out.println(p);
		//�ر���
		o.close();
	}
}
