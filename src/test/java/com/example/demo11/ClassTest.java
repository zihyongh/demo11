package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest() {
		// �ϥ�����r new �إ߹��(instance)
		Dog myDog = new Dog();
		// �إߨC�ӹ�Ҥ��P���ݩ�(�S��)
		myDog.category = "���";
		myDog.color = "�L����";
		myDog.name = "�`��";
		myDog.age = 1;
		
		System.out.println("�����~��:" + myDog.category);
		System.out.println("�������O:" + myDog.color);
		// ==============================
		// �ϥΤ�k(�欰)
		myDog.run();
		myDog.running();
		myDog.eat("�D�`��");
	}
	
	@Test
	public void bankTest() {
		Bank myBank = new Bank();
		
//		myBank.user = "AAA";
		myBank.setUser("AAA");
//		myBank.balance = 500;
		myBank.setBalance(500);
		
		myBank.withdraw(600);
	}
	
	@Test
	public void stringTest() {
		// withdraw31�O�R�A��k�A�i�H�����z�L ���O�W��,�R�A��k �I�s
		Bank.withdraw5(null, null, null, 0);
		// withdraw3�O�ʺA��k�A�n��new���O�~�i�H�I�s
		Bank myBank = new Bank();
		myBank.withdraw3("title","TTA����","AAA", 0);
	}
	
	@Test
	public void stringTest3() {
		String str = "ABCADAQW";
		String newStr = str.replace("A", "Z");           // replace�O������
		String newStr1 = str.replaceAll("A", "Z");       // replaceAll�]�O������
		String newStr2 = str.replaceAll("[A-C]", "Z");   // ���W��F��[A-C]�OA��C���N��A�M�ᴫ��Z
		System.out.println(newStr);
		System.out.println(newStr1);
		System.out.println(newStr2);
	}
}
