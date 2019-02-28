package com.day04;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringDemo {

	public static void main(String[] args) throws Exception {
		//加载类
		Class c = Class.forName("java.lang.String");
		
		//获取所有的方法public 方法[] getMethods()throws SecurityException
		Method methods[] = c.getMethods();
		
		//遍历
		for (Method m : methods) {
			//遍历方法的访问修饰符
			System.out.println(Modifier.toString(m.getModifiers()));
			
			//获取方法的返回值类型
			Class returnType = m.getReturnType();
			System.out.println(returnType.getSimpleName());
			
			//获取方法的名称
			System.out.println(m.getName());
			
			//方法的形式参数列表
			Class[] paramTypes = m.getParameterTypes();
			for (Class c1 : paramTypes) {
				System.out.println(c1.getSimpleName());
			}
			
			
			System.out.println();
		}
	}
}
