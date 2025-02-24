package com.example.demo11;

public class Animal {

	private String name;

	protected int age;

	// 建構方法
	public Animal() {
		super();
		// 建構方法中若有呼叫父類別的 super() 方法，不管是預設還是有帶參數的建構方法，
		// 其餘的程式碼都只能寫在 super() 方法之後
		System.out.println("這是父類別");
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
		System.out.println(name + "吃東西!!");
	}

	public void sleep() {
		System.out.println(name + "吃飽睡!!");
	}
}
