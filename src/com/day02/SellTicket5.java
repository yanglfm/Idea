package com.day02;

public class SellTicket5 implements Runnable{
	
	private static int tickets=50;
	
	private boolean flag=true;
	@Override
	public void run() {
		while(flag) {
			
			sellTickets();
			
		}
	}

	//同步代码的方法
	private synchronized boolean sellTickets() {
		if(tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在售出第"+(tickets--)+"张票");
			return flag;
		}else {
			flag = false;
			return flag;
		}
	}
}
