package com.day01;

public class SellTicket2 implements Runnable{
	//假设定义一百张票
	private static int tickets=50;
	
	public void run() {
		
		//假设有票售卖
		while(true) {
			//休息下
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			//判断票一定不是负数或0
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在售出第"+(tickets--)+"张票");
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		//票数目标 是同一本数据
		
		SellTicket2 target = new SellTicket2();
		
		Thread t1 = new Thread(target, "t1");
		Thread t2 = new Thread(target, "t2");
		Thread t3 = new Thread(target, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
