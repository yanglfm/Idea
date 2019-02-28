package com.day04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorTest2 {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("java.lang.String");
		
		//通过类来获取得到构造方法的数组
		Constructor [] cs = c.getDeclaredConstructors();
		
		//创建缓冲字符串
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		//构造方法遍历
		for (Constructor cts : cs) {
			sb.append("\t");
			sb.append(Modifier.toString(cts.getModifiers())+" ");
			sb.append(c.getSimpleName()+"(");
			
			//形式参数
			Class [] paramTypes = cts.getParameterTypes();
		
			for (int i = 0; i < paramTypes.length; i++) {
				Class paramType = paramTypes[i];

				if(i==paramTypes.length-1) {
					sb.append(paramType.getSimpleName());
				}else {
					sb.append(paramType.getSimpleName()+",");
				}
			}
			sb.append("){}\n");
			
		}
		sb.append("}");
		
		System.out.println(sb);
	}
}
