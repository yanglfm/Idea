package com.day02;

public class DieLock extends Thread {
	
	private boolean flag;
	
	public DieLock(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if(flag) {
			synchronized (MyLock.objA) {
				System.out.println(getName()+"if objA");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				//对现有资源不放 要获取另一个资源
				synchronized (MyLock.objB) {
					System.out.println(getName()+"if objB");
				}
			}
		}else {
			synchronized (MyLock.objB) {
				System.out.println(getName()+"else objB");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				//对现有资源不放 要获取另一个资源
				synchronized (MyLock.objA) {
					System.out.println(getName()+"else objA");
				}
			}
		}
	}
	
	
}
