package com.day03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {

	public static void main(String[] args) throws Exception {
		//加载类
		Class c = Class.forName("java.lang.Integer");
		
		//获取属性字段Field
		/*Field [] fs = c.getFields();
		System.out.println(fs.length);
		System.out.println(fs[0].getName());*/
		
		//获取所有属性
		Field [] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//获取字段名称
			System.out.println(field.getName());
			
			//获取属性字段的数据类型
			Class type = field.getType();
//			System.out.println(type.getName());
			System.out.println(type.getSimpleName());
			
			//获取修饰符
			int i = field.getModifiers();
//			System.out.println(i);
			String s = Modifier.toString(i);
			System.out.println(s);
			System.out.println();
			
			/**
			 * 作业
			 * 	输出以下形式的内容
			 * 
			 * public final class Integer {
			 *  public static final int   MIN_VALUE = 0x80000000;
			 *  public static final int   MAX_VALUE = 0x7fffffff;
			 *  .....	
			 * }
			 */
			
			
		}
		
	}
}
