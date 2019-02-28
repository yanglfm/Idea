/*package com.day02.DieLock;

import com.day02.MyLock;

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
					// TODO ???????? catch ??
					e.printStackTrace();
				}
				//????????????? ????????????
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
					// TODO ???????? catch ??
					e.printStackTrace();
				}
				//????????????? ????????????
				synchronized (MyLock.objA) {
					System.out.println(getName()+"else objA");
				}
			}
		}
	}
	
	
}*/
