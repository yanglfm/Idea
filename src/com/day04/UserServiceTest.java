package com.day04;

import java.util.Scanner;

public class UserServiceTest {

	public static void main(String[] args) {
		//以前的写法
		//实例化对象
		UserService u = new UserService();
		Scanner sc  = new Scanner(System.in);
		System.out.println("请你输入用户名：");
		String username = sc.next();
		System.out.println("请你输入密码：");
		String password = sc.next();
		
		boolean flag = u.login(username, password);
		
		if(flag) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	}
}
