package com.day02;

public class SellTicket7 extends Thread{

	//把票作为属性存放当前类中
	private Ticket ticket;
	
	public SellTicket7(Ticket ticket,String name) {
		super(name);
		this.ticket = ticket;
	}
	
	public void run() {
		//假设票还未售完
		while(ticket.getTickets()!=0) {
			//继续售票
			//在售票的同时必须将车票的共享数据给锁定
			synchronized (ticket) {
				if(ticket.getTickets()!=0) {
					//每次卖掉一张要递减 并更新数据
					ticket.setTickets(ticket.getTickets()-1);
					System.out.println(this.getName()+"正在售出第"+(50-ticket.getTickets())+"张票！");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}

			}
		}
	}
}
