package com.day03;

public class EmployeesTest {

	public static void main(String[] args) {
		//第一种获取类的信息
		//加载字节码文件  路径不能出错
		//方法1  返回与给定字符串名称的类或接口相关联的类对象
		Class c1 = null;
		try {
			 c1 = Class.forName("com.day03.Employees");
			System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//方法2
		Class c2 = Employees.class;
		System.out.println(c2);
		
		//第3种
		Employees e = new Employees();
		Class c3 = e.getClass();
		System.out.println(c3);
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		
	}
}
