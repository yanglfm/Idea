package com.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		//�������������ļ�����
		/**
		 * Properties ʵ���Ǻ�map�ӿ�һ���ģ�ֻ����key��value�洢�����ַ������� ��key�����ظ��� ������ظ����򸲸�value��ֵ
		 */
		Properties p = new Properties();
		
		//����������
		FileInputStream file = new FileInputStream("src/dbinfo.properties");
		
		//�������ļ����ؽ���
		p.load(file);
		
		//�ر���
		file.close();
		
		//��Ҫͨ��key����ֵ
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
