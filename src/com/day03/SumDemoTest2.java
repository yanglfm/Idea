package com.day03;

import java.util.Date;

public class SumDemoTest2 {

	public static void main(String[] args) {
		
//		SumDemo.sum(10,20);
//		SumDemo.sum(10,20,30);
		
		//���� str[]=���� ���� ����  ����
		SumDemo.m1("A","B","C");
		
		//��������
		String strs[] = {"���","hello","word","coco","����"};
		SumDemo.m1(strs);
		
		Date d = new Date();
		Object o = new Object();
		String str = new String("abc");
//		SumDemo.m2(d,o,str);
		
		SumDemo.m3(Date.class,Object.class,String.class);
	}
}
