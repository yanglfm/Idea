package com.day03;

import java.util.Date;

public class SumDemoTest2 {

	public static void main(String[] args) {
		
//		SumDemo.sum(10,20);
//		SumDemo.sum(10,20,30);
		
		//数组 str[]=体育 美术 电脑  旅游
		SumDemo.m1("A","B","C");
		
		//定义数组
		String strs[] = {"你好","hello","word","coco","嘻嘻"};
		SumDemo.m1(strs);
		
		Date d = new Date();
		Object o = new Object();
		String str = new String("abc");
//		SumDemo.m2(d,o,str);
		
		SumDemo.m3(Date.class,Object.class,String.class);
	}
}
