package com.example.demo11;

public class Employee {
	
	private String id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	// ��۩w�q����� HomeTown ���O�� Employee ���ݩʤ��@
	private HomeTown hometown;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, int age, String gender, HomeTown hometown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hometown = hometown;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public HomeTown getHometown() {
		return hometown;
	}
	
	
}
