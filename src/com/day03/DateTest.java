package com.day03;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {
		//方法1 java.util.Date 
		Class c1 = Class.forName("java.util.Date");
		System.out.println(c1);//class java.util.Date
		
		//方法2
		Class c2 = Date.class;
		System.out.println(c2);//class java.util.Date
		
		//方法3
		Date d = new Date();
		Class c3 = d.getClass();
		System.out.println(c3);//class java.util.Date
		
		System.out.println(c1==c2);//true
		System.out.println(c2==c3);//true
		
		//原型是否可以实现反射 int 可以
		Class i = int.class;
		System.out.println(i);
	}
}
