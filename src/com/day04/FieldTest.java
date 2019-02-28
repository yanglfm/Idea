package com.day04;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {

	public static void main(String[] args) throws Exception {
		//加载类
		Class c = Class.forName("java.lang.Integer");

		//获取所有属性
		Field [] fs = c.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f.getName());
			Class<?> type = f.getType();
			System.out.println(type);

		}

		//遍历
		/*for (Field field : fs) {
			//获取属性名称
			System.out.println(field.getName());

			//获取数据类型
			Class type = field.getType();
//			System.out.println(type.getName());
			System.out.println(type.getSimpleName());

			//获取修饰符
			int i = field.getModifiers();
//			System.out.println(i);
			String modi = Modifier.toString(i);
			System.out.println(modi);

			System.out.println();
		}*/
	}
}
