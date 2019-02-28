package com.test;

import java.util.ArrayList;



public class Seat {
	private int max;
	private ArrayList<Person> person;
	public Seat(int max) {
		this.max = max;
		//获取初始化
		person = new ArrayList<>();
	}
	//厕所开始进人
	public synchronized void in(Person p){
		//当厕所满人的时候进入等待
		while (person.size()>=max) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}//跳出循环意味着厕所可以进人
		person.add(p);
		System.out.println(Thread.currentThread().getName()+"正在上厕所，厕所里有"+person.size()+"个人");
		notifyAll();
	}
	
	public synchronized void out() {
		//厕所里没人就不需要移除，out进入等待，，，
		
		while(person.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		person.remove(0);
		notifyAll();
		
	}

}
