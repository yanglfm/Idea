package com.day03;

public class Singleton {

	//定义一个属性
	private static Singleton instance=null;
	//私有构造方法
	private Singleton() {
		
	}
	
	//提供一个公开方法并且返回值的类型就是它本身 
	//静态修饰符 给第三方提供便利
	public static Singleton getInstance() {
		if(instance==null) {
			//实例化
			instance = new Singleton();
		}
		return instance;
	}
	
}
