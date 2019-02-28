package com.day04;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest2 {

	public static void main(String[] args) throws Exception {
		//������
		Class c = Class.forName("java.lang.Integer");
		
		//��ȡ��������
		Field [] fs = c.getDeclaredFields();
		
		//�����ַ���ƴ�Ӷ���
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		//����
		for (Field field : fs) {
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers())+" ");
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+";\n");
		}
		
		sb.append("}");
		
		System.out.println(sb);
	}
}
