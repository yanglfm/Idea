package com.day02;

public class DieLockTest {

	public static void main(String[] args) {
		
		DieLock t1 = new DieLock(true);
		DieLock t2 = new DieLock(false);
		
		t1.setName("A线程 ");
		t2.setName("B线程 ");
		
		t1.start();
		t2.start();
	}
}
