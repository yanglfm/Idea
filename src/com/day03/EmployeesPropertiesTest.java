package com.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EmployeesPropertiesTest {

	public static void main(String[] args) throws Exception {
		//属性文件的创建
		Properties p = new Properties();
		
		//创建文件对象流
		FileInputStream file = new FileInputStream("src/employees.properties");
		
		//加载
		p.load(file);
		
		file.close();
		
		//通过key获取value
		String s = p.getProperty("className");
		
//		System.out.println(s);
		
		//反射机制
		Class c  = Class.forName(s);
		//创建对象
		Object o = c.newInstance();
		
		System.out.println(o);
		
	}
}
