package com.day02;

public class Factory extends Thread{

	//将货架作为属性存放
	private Shelf shelf;
	//厂家生产产品的数量
	private int count;
	
	public Factory(String name,Shelf shelf,int count) {
		super(name);
		this.shelf = shelf;
		this.count = count;
	}
	
	public void run() {
		for (int i = 1; i <= count; i++) {
			//产生产品实例对象
			Product p = new Product();
			shelf.in(p);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
