package com.example.demo11;

public class Animal {

	private String name;

	protected int age;

	// �غc��k
	public Animal() {
		super();
		// �غc��k���Y���I�s�����O�� super() ��k�A���ެO�w�]�٬O���a�Ѽƪ��غc��k�A
		// ��l���{���X���u��g�b super() ��k����
		System.out.println("�o�O�����O");
	}

	public Animal(String name, int age) {
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

	public void eat() {
		System.out.println(name + "�Y�F��!!");
	}

	public void sleep() {
		System.out.println(name + "�Y����!!");
	}
}
