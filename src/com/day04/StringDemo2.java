package com.day04;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringDemo2 {

	public static void main(String[] args) throws Exception {
		//加载类
		Class c = Class.forName("java.lang.String");
		
		//获取所有的方法public 方法[] getMethods()throws SecurityException
		Method methods[] = c.getMethods();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		for (Method m : methods) {
			sb.append("\t");
			sb.append(Modifier.toString(m.getModifiers())+" ");
			sb.append(m.getReturnType().getSimpleName()+" ");
			sb.append(m.getName()+"(");
			
			//形式参数列表
			Class [] paramTypes = m.getParameterTypes();
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
