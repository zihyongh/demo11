package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {
	
	@Test
	public void animalTest() {
		Animal ani = new Animal();
		ani.setName("ANI");
		ani.eat();
		ani.sleep();
	}
	
	@Test
	public void animalTest2() {
		Animal ani = new Animal("ANI",5);
		ani.eat();
		ani.sleep();
	}
	
	@Test
	public void birdTest() {
		Bird bird = new Bird();
		bird.setName("�p�i�R");
		bird.eat();
		bird.sleep();
		bird.fly();
	}
	
	@Test
	public void birdTest2() {
		Bird bird = new Bird("�p�i�R",5);
		bird.eat();
		bird.sleep();
		bird.fly();
		bird.fly2();
	}
	
	@Test
	public void birdTest3() {
		// ���M���^�Ӫ���ƫ��A�O�����O�A���]�� new �X�Ӫ���ҬO�l���O�A�ҥH����W�N�O�l���O
		Animal bird = new Bird("�p�i�R",5);
		// eat() �M sleep() ���檺�|�O�b�l���O�����s�w�q����@���e
		bird.eat();
		bird.sleep();
		// �H�U2�ؤ�k�L�k�Q�I�s�A�]���S���Q�w�q�b�����O��
//		bird.fly();
//		bird.fly2();
		// ��X�H�W�A��s�إߥX�Ӫ��l���O��Ҩ䱵������ƫ��A�O�����O��
			// 1. �u��I�s�w�q�b�����O������k
			// 2. ��l���O�����s�w�q�����O����k�ɡA���檺�|�O�l���O������@���e
	}
	
	@Test
	public void birdTest4() {
		Bird bird = new Bird("�p�i�R",5);
		bird.fly();
		// ���s�w�q fly() ����k
		// 1. �b�إ߷s����Үɪ��������s����@���e�A�Y�[�W�j�A��
		// 2. �j�A���n�g�b�������e�A�B�����@�w�n������
		// 3. ���s�w�q����@���e�N�Ȧ��b�o������
		// 4. @Override �i���i�L�A����ĳ�[
		Bird bird2 = new Bird("�p�i�R",5) {

			@Override
			public void fly() {
				System.out.println("�³��C��");
			}
		};
		bird2.fly();
	}
	
}
