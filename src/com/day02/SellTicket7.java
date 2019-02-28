package com.day02;

public class SellTicket7 extends Thread{

	//��Ʊ��Ϊ���Դ�ŵ�ǰ����
	private Ticket ticket;
	
	public SellTicket7(Ticket ticket,String name) {
		super(name);
		this.ticket = ticket;
	}
	
	public void run() {
		//����Ʊ��δ����
		while(ticket.getTickets()!=0) {
			//������Ʊ
			//����Ʊ��ͬʱ���뽫��Ʊ�Ĺ������ݸ�����
			synchronized (ticket) {
				if(ticket.getTickets()!=0) {
					//ÿ������һ��Ҫ�ݼ� ����������
					ticket.setTickets(ticket.getTickets()-1);
					System.out.println(this.getName()+"�����۳���"+(50-ticket.getTickets())+"��Ʊ��");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}

			}
		}
	}
}
