package com.day02;

public class Customter extends Thread{

	//将货架作为属性存放
	private Shelf shelf;
	//购买多少次
	private int count;
	
	public Customter(String name,Shelf shelf,int count) {
		super(name);
		this.shelf = shelf;
		this.count = count;
	}
	
	public void run() {
		for (int i = 1; i <= count; i++) {
			//购物
			shelf.out();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
