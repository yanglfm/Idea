package com.day03;

public class TestA {

	public static void main(String[] args) throws Exception {
		//将类A加载
//		Class.forName("com.day03.A");
		
		//这种执行的方式是不会执行静态代码块
//		Class c = A.class;
		
		A a = new A();
//		Class c = a.getClass();
		
	}
}
