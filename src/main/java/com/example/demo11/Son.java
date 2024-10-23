package com.example.demo11;

public class Son extends Father{

	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void playball() {
		System.out.println(getName() + "is playing ball!");
	}
}
