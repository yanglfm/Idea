package com.test;

public class PersonWait extends Thread {
	private Seat seat;
	//�϶೤ʱ��
	private int time;
	
	
	public   PersonWait(String name,Seat seat,int time) {
		super(name);
		this.seat = seat;
		this.time = time;
	}
	
	public void run() {
		//Person p=new Person(getName(), seat, time);
		//synchronized (seat) {
			for (int i = 1; i <= 4; i++) {
				//System.out.println(i+"++wo��ִ���������");
				seat.out();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			
		}
		
		
	//}

}}
