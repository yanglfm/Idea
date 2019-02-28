package com.day02;

public class SellTicket4 implements Runnable{
	
	private int tickets=50;

	//���������������һ����
	private Lock obj = new Lock();
	
	@Override
	public void run() {
		while(true) {
			//����ͬ������
			/**
			 * t1,t2,t3�̶߳����п����ߵ������
			 * ����t1�õ�cpuʹ��Ȩ��t1�ͽ���ҵ���߼�����
			 * ����t2�õ�cpuʹ��Ȩ�ˣ�t2��Ҫ�������������������ǹ��ŵģ�����ȥ������ֻ�ܵ�
			 * t1,t2,t3 �����Ǿ��� ˭�õ�cpuʹ��Ȩ˭�Ϳ����Ƚ��������ǿ��ŵ�״̬ ��ĳ���߳̽���� ��������
			 * �Դ�����... ֱ����Ʊ����
			 * �� ������
			 */
			synchronized (obj) {
				//��Ʊ����
				if(tickets>0) {
					//ģ������
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");
				}else {
					break;
				}
			}
			
		}
	}

}
