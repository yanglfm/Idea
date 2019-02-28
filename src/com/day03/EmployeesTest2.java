package com.day03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeesTest2 {

	public static void main(String[] args) throws Exception {
		//类加载
		Class c1 = Class.forName("com.day03.Employees");
		//产生类的实例对象    public T newInstance()
		Object obj = c1.newInstance();
		System.out.println(obj);
		
		//练习 使用实例反射技术 完成日期类实例对象的输出 其格式是 2018-08-22 15：23：33
		Class d = Class.forName("java.util.Date");
		obj = d.newInstance();
		if(obj instanceof Date) {
			Date date = (Date) obj;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
		}
		
	}
}
