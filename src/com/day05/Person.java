package com.day05;

import java.io.Serializable;

public class Person implements Serializable{

	private String name;
	transient private int age;
	private static final long SerializableUID=5646346546464654L;
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
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
		// TODO 自动生成的方法存根
		return "Person[name="+name+",age="+age+"]";
	}

}
