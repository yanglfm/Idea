package com.day04;

import java.lang.reflect.Field;

public class TestUser {

	public static void main(String[] args) throws Exception {
//		User u = new User();
//		u.age=20;
//		System.out.println(u.age);
//		u.setAge(30);
//		System.out.println(u.getAge());
		
		//����2ͨ��������Ƶõ�user��
		Class c = Class.forName("com.day04.User");
		
		//����һ��ʵ������
		Object obj = c.newInstance();
		
		//���Ȼ�ȡ�õ��ֶ�����
		Field fd = c.getDeclaredField("age");
		
		//���Ʒ�װ ʹ�÷��似�� ���ƹ��󽫵���Java�������ԵĲ���ȫ
		fd.setAccessible(true);
		
		//������������ֵ��
		fd.set(obj, 110);
		
		//��ȡ���е�ֵ
		System.out.println(fd.get(obj));
	}
}
