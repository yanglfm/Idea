package com.day02;

public class SellTicket3 implements Runnable{
	
	private int tickets=50;

	//看做是一把锁
	private Object obj = new Object();
	/*@Override
	public void run() {
		while(true) {
			//设立同步代码
			synchronized (new Object()) {
				//有票可售
				if(tickets>0) {
					//模拟休眠
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在售出第"+(tickets--)+"张票");
				}else {
					break;
				}
			}
			
		}
	}*/
	
	@Override
	public void run() {
		while(true) {
			//设立同步代码
			synchronized (obj) {
				//有票可售
				if(tickets>0) {
					//模拟休眠
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在售出第"+(tickets--)+"张票");
				}else {
					break;
				}
			}
			
		}
	}

}
