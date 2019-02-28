package com.day01;

public class MyDemo {
	int age;
	Object obj;
	
	public void test() {
		System.out.println("test ok");
	};
	
	public void test2(MyDemo d) {
		d.test();
	}
	public static void main(String[] args) {
		System.out.println("hello");
		new Object();
		new Object();
		new Object();
		new Object();
		new Object();
		System.out.println("world");
		//垃圾回收方法
//		System.gc();
//		Runtime.getRuntime().gc();
		MyDemo d = null;
		new MyDemo().test2(d);
		
	
	}
}
