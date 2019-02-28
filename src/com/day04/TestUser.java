package com.day04;

import java.lang.reflect.Field;

public class TestUser {

	public static void main(String[] args) throws Exception {
//		User u = new User();
//		u.age=20;
//		System.out.println(u.age);
//		u.setAge(30);
//		System.out.println(u.getAge());
		
		//方法2通过反射机制得到user类
		Class c = Class.forName("com.day04.User");
		
		//创建一个实例对象
		Object obj = c.newInstance();
		
		//首先获取得到字段属性
		Field fd = c.getDeclaredField("age");
		
		//打破封装 使用反射技术 打破过后将导致Java对象属性的不安全
		fd.setAccessible(true);
		
		//给对象赋予属性值的
		fd.set(obj, 110);
		
		//获取其中的值
		System.out.println(fd.get(obj));
	}
}
