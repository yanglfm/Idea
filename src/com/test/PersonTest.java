package com.test;



public class PersonTest {

	public static void main(String[] args) {
		//»õ¼Ü
		Seat seat = new Seat(1);
		
	
		
		Person c1 = new Person("c1", seat, 1);
		Person c2 = new Person("c2", seat, 3);
		Person c3 = new Person("c3", seat, 3);
		Person c4 = new Person("c4", seat, 3);
		Person c5 = new Person("c5", seat, 3);
		
		
		PersonWait w1 = new PersonWait("w1", seat, 1);
		
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		w1.start();
		//w1.start();
		//w2.start();
		
		

	}

}
