package com.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EmployeesPropertiesTest {

	public static void main(String[] args) throws Exception {
		//�����ļ��Ĵ���
		Properties p = new Properties();
		
		//�����ļ�������
		FileInputStream file = new FileInputStream("src/employees.properties");
		
		//����
		p.load(file);
		
		file.close();
		
		//ͨ��key��ȡvalue
		String s = p.getProperty("className");
		
//		System.out.println(s);
		
		//�������
		Class c  = Class.forName(s);
		//��������
		Object o = c.newInstance();
		
		System.out.println(o);
		
	}
}
