package com.day02;

import java.util.ArrayList;

//货架
public class Shelf {
	//货架上货上限
	private int max;
	//货架上的获取
	private ArrayList<Product> products;
	
	public Shelf(int max) {
		this.max = max;
		//获取初始化
		products = new ArrayList<>();
	}
	
	//货架上上货是由厂家来调用
	public synchronized void in(Product p) {
		//假设货架上的货物满了就一直等待
		while(products.size()>=max) {
			//阻塞厂商线程
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//跳出循环就意味着货架上不满可以上货
		products.add(p);
		System.out.println(Thread.currentThread().getName()+"将一个产品放上货架，当前的产品数目为："+products.size());
		//唤醒所有线程
		notifyAll();
	}
	
	//从货架上拿货 这是属于消费者来消费
	public synchronized void out() {
		//货架上是空的状态就一直等待中
		while(products.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//跳出循环说明货架上有东西
		products.remove(0);
		System.out.println(Thread.currentThread().getName()+"买走产品，当前货架上的所有产品数目为："+products.size());
		
		//唤醒所有顾客线程
		notifyAll();
	}
}
