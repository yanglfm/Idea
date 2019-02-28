package com.day04;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringDemo {

	public static void main(String[] args) throws Exception {
		//������
		Class c = Class.forName("java.lang.String");
		
		//��ȡ���еķ���public ����[] getMethods()throws SecurityException
		Method methods[] = c.getMethods();
		
		//����
		for (Method m : methods) {
			//���������ķ������η�
			System.out.println(Modifier.toString(m.getModifiers()));
			
			//��ȡ�����ķ���ֵ����
			Class returnType = m.getReturnType();
			System.out.println(returnType.getSimpleName());
			
			//��ȡ����������
			System.out.println(m.getName());
			
			//��������ʽ�����б�
			Class[] paramTypes = m.getParameterTypes();
			for (Class c1 : paramTypes) {
				System.out.println(c1.getSimpleName());
			}
			
			
			System.out.println();
		}
	}
}
