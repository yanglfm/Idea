package com.test;



public class Person extends Thread{
	   //��������Ϊ���Դ��
		private Seat seat;
		//�϶೤ʱ��
		private int time;
		
		public Person(String name,Seat seat,int time) {
			super(name);
			this.seat = seat;
			this.time = time;
		}
		
		public void run() {
			Person p=new Person(getName(), seat, time);
			//for (int i = 1; i <= 3; i++) {
				
				seat.in(p);
				try {
					Thread.sleep(100);
					//seat.out(p);
					//Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		//}

}
