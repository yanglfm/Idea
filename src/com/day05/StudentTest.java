package com.day05;

import java.lang.reflect.Field;
import java.util.Arrays;

public class StudentTest {

	//�����ֶ�����������
	public static void main(String[] args) throws Exception, IllegalAccessException {
		//ʵ��������
		Student stu = new Student();
		stu.setId(1);
		stu.setName("����");
		stu.setAge(20);
		stu.setLover(new String[] {"����","����","����"});
		
		//��ȡ���е��ֶ�
		Field [] fields = Student.class.getDeclaredFields();//�������
		//ѭ������
		for (Field field : fields) {
			//���Ʒ�װ
			field.setAccessible(true);
			//��ȡ����ֵ
			Object value = field.get(stu);//Object  get(Object obj) ���ظ�����ʾ���ֶε�ֵ Field ��ָ���Ķ����ϡ����������obj��ʾ�ֶε�ֵ; ԭʼֵ����װ���ʵ��Ķ���֮ǰ������
			//��ȡ����������
			System.out.println("����������Ϊ��"+field.getName());
			//�ж��Ƿ���һ������
			if(value.getClass().isArray()) {
				//��ֵת��������
				Object [] arr = (Object[]) value;
				System.out.println("������ֵ�ǣ�"+Arrays.toString(arr));
			}else {
				//���������
				System.out.println("������ֵ�ǣ�"+value);
			}
			field.setAccessible(false);
		}
	}
}
