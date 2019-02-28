package com.day04;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest2 {

	public static void main(String[] args) throws Exception {
		//加载类
		Class c = Class.forName("java.lang.Integer");
		
		//获取所有属性
		Field [] fs = c.getDeclaredFields();
		
		//创建字符串拼接对象
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		//遍历
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
