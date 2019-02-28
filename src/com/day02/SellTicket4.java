package com.day02;

public class SellTicket4 implements Runnable{
	
	private int tickets=50;

	//创建任意对象看做是一把锁
	private Lock obj = new Lock();
	
	@Override
	public void run() {
		while(true) {
			//设立同步代码
			/**
			 * t1,t2,t3线程都是有可能走到这里的
			 * 假设t1拿到cpu使用权，t1就进入业务逻辑代码
			 * 假设t2拿到cpu使用权了，t2就要进来，但是它发现门是关着的，进不去，所以只能等
			 * t1,t2,t3 机会是均等 谁拿到cpu使用权谁就可以先进入且门是开着的状态 当某根线程进入后 门又锁了
			 * 以此类推... 直至售票结束
			 * 门 开，关
			 */
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
