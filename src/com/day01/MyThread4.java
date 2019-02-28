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
			String date = sdf.format(d);//转化格式
		/*	try {
				Date date1 = sdf.parse(date);//解析格式
				System.out.println(date1);
			} catch (ParseException e) {
				e.printStackTrace();
			}*/
//			System.out.println(getName()+":"+"日期："+new Date());
			System.out.println(getName()+":"+"日期："+date);
			//休眠
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
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
	 * 使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。 线程不会丢失任何显示器的所有权。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	/*	for (int i = 1; i <=10; i++) {
			//阻塞
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(i);
		}*/
		
		new MyThread4().start();
	}
}
