package com.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class PersonTest2 {

	//反序列化读取文件中的内容
	public static void main(String[] args) throws Exception {
		//穿件读取输入流
		InputStream in = new FileInputStream("src/a.txt");
		//创建字符数组 就简单理解缓冲内存区域
		byte [] bys = new byte[10];
		//长度的属性
		int len = -1;
		//创建反序列化
		ObjectInputStream o = new ObjectInputStream(in);
		//读取内容
		Person p = (Person) o.readObject();
		System.out.println(p);
		//关闭流
		o.close();
	}
}
