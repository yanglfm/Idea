package com.day05;

import java.lang.reflect.Field;
import java.util.Arrays;

public class StudentTest {

	//反射字段是数组类型
	public static void main(String[] args) throws Exception, IllegalAccessException {
		//实例化对象
		Student stu = new Student();
		stu.setId(1);
		stu.setName("张三");
		stu.setAge(20);
		stu.setLover(new String[] {"足球","篮球","上网"});
		
		//获取所有的字段
		Field [] fields = Student.class.getDeclaredFields();//反射机制
		//循环遍历
		for (Field field : fields) {
			//打破封装
			field.setAccessible(true);
			//获取变量值
			Object value = field.get(stu);//Object  get(Object obj) 返回该所表示的字段的值 Field ，指定的对象上。结果：对象obj表示字段的值; 原始值被包装在适当的对象之前被返回
			//获取变量的名称
			System.out.println("变量的名称为："+field.getName());
			//判断是否是一个数组
			if(value.getClass().isArray()) {
				//将值转换成数组
				Object [] arr = (Object[]) value;
				System.out.println("变量的值是："+Arrays.toString(arr));
			}else {
				//输出非数组
				System.out.println("变量的值是："+value);
			}
			field.setAccessible(false);
		}
	}
}
