package com.day04;

import java.util.Scanner;

public class UserServiceTest {

	public static void main(String[] args) {
		//��ǰ��д��
		//ʵ��������
		UserService u = new UserService();
		Scanner sc  = new Scanner(System.in);
		System.out.println("���������û�����");
		String username = sc.next();
		System.out.println("�����������룺");
		String password = sc.next();
		
		boolean flag = u.login(username, password);
		
		if(flag) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}
	}
}
