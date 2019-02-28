package com.day05;

import java.io.Serializable;

public class Person implements Serializable{

	private String name;
	transient private int age;
	private static final long SerializableUID=5646346546464654L;
	public Person() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "Person[name="+name+",age="+age+"]";
	}

}
