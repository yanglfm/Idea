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
	//�ɱ䳤�Ĳ���...������Դ��ͬ���������͵Ĳ��� �����ĸ�������
	public static void sum(int ...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}
	
	//��д�ַ����Ŀɱ䳤����
	public static void m1(String ...args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	//����Ĳ����Ƕ��󣿣�����  Date String Demo
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
