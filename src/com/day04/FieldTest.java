package com.day04;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {

	public static void main(String[] args) throws Exception {
		//������
		Class c = Class.forName("java.lang.Integer");

		//��ȡ��������
		Field [] fs = c.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f.getName());
			Class<?> type = f.getType();
			System.out.println(type);

		}

		//����
		/*for (Field field : fs) {
			//��ȡ��������
			System.out.println(field.getName());

			//��ȡ��������
			Class type = field.getType();
//			System.out.println(type.getName());
			System.out.println(type.getSimpleName());

			//��ȡ���η�
			int i = field.getModifiers();
//			System.out.println(i);
			String modi = Modifier.toString(i);
			System.out.println(modi);

			System.out.println();
		}*/
	}
}
