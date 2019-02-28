package com.day04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorTest2 {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("java.lang.String");
		
		//ͨ��������ȡ�õ����췽��������
		Constructor [] cs = c.getDeclaredConstructors();
		
		//���������ַ���
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		//���췽������
		for (Constructor cts : cs) {
			sb.append("\t");
			sb.append(Modifier.toString(cts.getModifiers())+" ");
			sb.append(c.getSimpleName()+"(");
			
			//��ʽ����
			Class [] paramTypes = cts.getParameterTypes();
		
			for (int i = 0; i < paramTypes.length; i++) {
				Class paramType = paramTypes[i];

				if(i==paramTypes.length-1) {
					sb.append(paramType.getSimpleName());
				}else {
					sb.append(paramType.getSimpleName()+",");
				}
			}
			sb.append("){}\n");
			
		}
		sb.append("}");
		
		System.out.println(sb);
	}
}
