package com.day03;

public class EmployeesTest {

	public static void main(String[] args) {
		//��һ�ֻ�ȡ�����Ϣ
		//�����ֽ����ļ�  ·�����ܳ���
		//����1  ����������ַ������Ƶ����ӿ�������������
		Class c1 = null;
		try {
			 c1 = Class.forName("com.day03.Employees");
			System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//����2
		Class c2 = Employees.class;
		System.out.println(c2);
		
		//��3��
		Employees e = new Employees();
		Class c3 = e.getClass();
		System.out.println(c3);
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		
	}
}
