package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("������b�U��");
	}

	@Override
	public void move() {
		System.out.println("������b����");
	}

}
