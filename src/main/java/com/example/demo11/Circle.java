package com.example.demo11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("�e���");
	}

	// �Q�~�Ӫ� Shape ���O���A�]�����w�q��H��k draw1()�A�ҥH�o�Ӥ�k�����n�Q���s�w�q
	@Override
	public void draw1() {
		System.out.println("�e���A�@��S�@��");
	}

}
