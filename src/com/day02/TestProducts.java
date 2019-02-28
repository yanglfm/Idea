package com.day02;

public class TestProducts {

	public static void main(String[] args) {
		//货架
		Shelf shelf = new Shelf(10);
		
		//定义厂家线程
		Factory f1 = new Factory("厂商1", shelf, 10);
		Factory f2 = new Factory("厂商2", shelf, 10);
		Factory f3 = new Factory("厂商3", shelf, 10);
		
		//定义两个顾客线程
		Customter c1 = new Customter("顾客1", shelf, 5);
		Customter c2 = new Customter("顾客2", shelf, 5);
		
		//开启线程
		f1.start();
		f2.start();
		f3.start();
	
		c1.start();
		c2.start();
	}
}
