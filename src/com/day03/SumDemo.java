package com.day03;

public class SumDemo {
/*
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}*/
	//可变长的参数...代表可以存放同类数据类型的参数 参数的个数不定
	public static void sum(int ...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}
	
	//书写字符串的可变长参数
	public static void m1(String ...args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	//传入的参数是对象？？？？  Date String Demo
	public static void m2(Object ...args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void m3(Class ...args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
}
