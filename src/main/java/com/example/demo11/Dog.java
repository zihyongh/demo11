package com.example.demo11;

public class Dog {
	// �ŧi�ݩ�(�S��)
	String category;  // �ɶq���n���b�@�_
	
	String color;
	
	String name;
	
	int age;
	
	// �w�q��k(�欰)
	
	public void run() {
		System.out.println("���b�]!!");
	}
	
	// ��k���h��(overload)
	// 1. ���M��k�W�٬ۦP�A����k�ѼƭӼƤ��@�ˡA�ҥH�I�srun��k�ɡA�t�Υi�H��O�O�n�]���@�ؤ�k
	public void run(String name) {               
		System.out.println(name + "���b�]!!");
	}
	// 2. ���M��k�W�٬ۦP�A����k�ѼƭӼƤ@�ˡA���O�ۦP��m���ѼƸ�ƫ��A���@�ˡA�ҥH�I�srun��k�ɡA�t�Υi�H��O�O�n�]���@�ؤ�k
	public void run(int age , String name) {               
		System.out.println(name + "���b�]!!");
	}
	public void run(String name, int age) {               
		System.out.println(name + "���b�]!!");
	}
	
	public void running() {
		System.out.println(name + "���b�]!!");
	}
	
	public void eat(String name) {
		// �L�X:�Q���`��ܷR�Y�ܦ��D�`��
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);  // ��this�ӰϤ��X class Dog �� name 
	}
	
}
