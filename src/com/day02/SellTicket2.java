package com.day02;

public class SellTicket2 implements Runnable{
	
	private static int tickets=50;

	@Override
	public void run() {
		while(true) {
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
