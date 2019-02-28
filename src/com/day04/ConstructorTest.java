package com.day04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorTest {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("java.lang.String");
		
		//ͨ��������ȡ�õ����췽��������
		Constructor [] cs = c.getDeclaredConstructors();

		//����
		for (Constructor cst : cs) {
			//��ȡ���η�
			System.out.println(Modifier.toString(cst.getModifiers()));
			//�õ���ʽ�����б�
			Class [] paramTypes = cst.getParameterTypes();
			for (Class paramType : paramTypes) {
				System.out.println(paramType.getSimpleName());
			}
			System.out.println();
		}
	}
}
