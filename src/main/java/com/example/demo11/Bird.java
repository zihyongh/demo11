package com.example.demo11;

public class Bird extends Animal {
	// �ϥ�����r extends ���~�� Animal ���w�����ݩʩM��k
	// 1.�ݩ� name �H�Φs���p���ݩʪ� getter/setter��k
	// 2.eat, sleep ��k
	// �H�W���ݩʤΤ�k�bAnimal�����A���ݭn�A���g�@��

	// �غc��k
	// �w�]�غc��k(�S���Ѽƪ��غc��k)
	public Bird() {
		// 1.�b�I�s�l���O���غc��k���e�A�|���I�s�����O���غc��k�A���ެO�w�]�غc��k�٬O�a���Ѽƪ��غc��k
		// 2.�Y�Ϭٲ��I�s�����O�� super() ��k�A�{���̵M�|������I�s�����O���غc��k
		super();
		System.out.println("�o�O�l���O");
	}

	// bird �� name �M age �~�Ӧۤ����O Animal�A�ҥH�a�� name �M age ���غc��k�|�h�I�s�����O���غc��k
	public Bird(String name, int age) {
		super(name, age);
	}

	public void fly() {
		// �i�z�L����r super �ӨϥΤ����O�� public ��k
		// �ݩ� name ���v���O private�A�u��b Animal ���O���ϥ�
		System.out.println(super.getName() + "���b��!!");
		// �ثe java �������i�H�N����r super �ٲ�
		System.out.println(getName() + "���b��!!");
	}

	public void fly2() {
		// �]���ݩ� age �v���O protected�A�ҥH�l���O�i�H�����s�����ݩ�
		System.out.println("���~" + age + "���A" + getName() + "���b��!!");
	}

	// 1. �l���O�i�H���s�w�q(���P����@���e)�����O����k
	// 2. @override �N�O�ΨӼаO�l���O���s�w�q�����O����k: �ثe�� java �����A�������i�H�ٲ��A��ĳ�[
		// 2.1 @ �O Annotation(����): �|�b�{���X�����ѰT���A�o�ǰT���|�b�sĶ�άO����ɳQ�B�z 
	// 3. �Q�l���O���s�w�q����k:
		// 3.1 �v�����i������p(���i�H�O�Ū��άOprivate, protected)
		// 3.2 �^�Ǹ�ƧκA�n�@��
		// 3.3 ��k�M�p�A�������ѼƼƶq�H�ΨC�ӰѼƪ���ƫ��A���n�@��
		// 3.4 �ߤ@�����P�N�O�j�A��������@���e
	@Override
	public void eat() {
		System.out.println(getName() + "�Y����");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + "�Ϋܦh");
	}
	
	
}
