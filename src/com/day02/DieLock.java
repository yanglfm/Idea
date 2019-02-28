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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				//��������Դ���� Ҫ��ȡ��һ����Դ
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				//��������Դ���� Ҫ��ȡ��һ����Դ
				synchronized (MyLock.objA) {
					System.out.println(getName()+"else objA");
				}
			}
		}
	}
	
	
}
