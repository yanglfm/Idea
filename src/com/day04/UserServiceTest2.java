package com.day04;

import java.lang.reflect.Method;

public class UserServiceTest2 {

	public static void main(String[] args) throws Exception {
		//ͨ��������ɵ�¼����
		Class c = Class.forName("com.day04.UserService");
		
		//��ȡĳ���ض��ķ�������ʽ�����б�
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		
		//ͨ�����䴴������
		Object o = c.newInstance();
		
		//ͨ��m�������invoke���� ������ʽ������ֵ����
		Object returnType = m.invoke(o, "jack1","123");
		
		System.out.println(returnType);
	}
}
