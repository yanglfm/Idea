package com.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		//创建属性配置文件对象
		/**
		 * Properties 实际是和map接口一样的，只不过key和value存储的是字符串类型 且key不能重复的 如果有重复的则覆盖value的值
		 */
		Properties p = new Properties();
		
		//创建输入流
		FileInputStream file = new FileInputStream("src/dbinfo.properties");
		
		//将属性文件加载进来
		p.load(file);
		
		//关闭流
		file.close();
		
		//需要通过key来拿值
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	}
}
