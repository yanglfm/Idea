package com.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread4 extends Thread{

	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = sdf.format(d);//ת����ʽ
		/*	try {
				Date date1 = sdf.parse(date);//������ʽ
				System.out.println(date1);
			} catch (ParseException e) {
				e.printStackTrace();
			}*/
//			System.out.println(getName()+":"+"���ڣ�"+new Date());
			System.out.println(getName()+":"+"���ڣ�"+date);
			//����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	/**
	 * 2018-08-20 15:44:01
	 * 2018-08-20 15:44:02
	 * 2018-08-20 15:44:03
	 * 2018-08-20 15:44:04
	 * .....
	 * 
	 * public static void sleep(long millis)throws InterruptedException
	 * ʹ��ǰ����ִ�е��߳���ָ���ĺ�������ͣ����ʱִֹͣ�У�������ȡ����ϵͳ��ʱ���͵��ȳ���ľ��Ⱥ�׼ȷ�ԡ� �̲߳��ᶪʧ�κ���ʾ��������Ȩ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	/*	for (int i = 1; i <=10; i++) {
			//����
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(i);
		}*/
		
		new MyThread4().start();
	}
}
