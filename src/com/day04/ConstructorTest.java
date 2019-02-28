package com.day04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorTest {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("java.lang.String");
		
		//通过类来获取得到构造方法的数组
		Constructor [] cs = c.getDeclaredConstructors();

		//遍历
		for (Constructor cst : cs) {
			//获取修饰符
			System.out.println(Modifier.toString(cst.getModifiers()));
			//得到形式参数列表
			Class [] paramTypes = cst.getParameterTypes();
			for (Class paramType : paramTypes) {
				System.out.println(paramType.getSimpleName());
			}
			System.out.println();
		}
	}
}
