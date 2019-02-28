package com.day01;

public class MyThread7 extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+":"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			//使用yield方法 public static void yield():对调度程序的一个暗示，即当前线程愿意产生当前使用的处理器。 调度程序可以自由地忽略这个提示。
			//但是不保证一人一次的情况   
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		
		t1.setName("张三");
		t2.setName("李四");
		
		t1.start();
		t2.start();
	}
}
