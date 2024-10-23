package com.example.demo11;

public class PersonInfo extends IdName{
	
	private int age;
	
	private String city;

	public PersonInfo() {
		super();
	}

	public PersonInfo(int age, String city) {
		super();
		this.age = age;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
	
	
}
