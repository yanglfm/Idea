package com.day02;

public class ThreadDeam extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+":"+(i+1));
		}
	}

	
}
