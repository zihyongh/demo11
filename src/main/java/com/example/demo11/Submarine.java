package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("潛水艇在下潛");
	}

	@Override
	public void move() {
		System.out.println("潛水艇在移動");
	}

}
