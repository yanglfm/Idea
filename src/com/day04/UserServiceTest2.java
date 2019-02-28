package com.day04;

import java.lang.reflect.Method;

public class UserServiceTest2 {

	public static void main(String[] args) throws Exception {
		//通过反射完成登录案例
		Class c = Class.forName("com.day04.UserService");
		
		//获取某个特定的方法和形式参数列表
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		
		//通过反射创建对象
		Object o = c.newInstance();
		
		//通过m对象调用invoke方法 并将形式参数的值代入
		Object returnType = m.invoke(o, "jack1","123");
		
		System.out.println(returnType);
	}
}
