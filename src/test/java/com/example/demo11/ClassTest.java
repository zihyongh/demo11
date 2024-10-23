package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest() {
		// 使用關鍵字 new 建立實例(instance)
		Dog myDog = new Dog();
		// 建立每個實例不同的屬性(特性)
		myDog.category = "柴犬";
		myDog.color = "淺黃色";
		myDog.name = "總柴";
		myDog.age = 1;
		
		System.out.println("狗的品種:" + myDog.category);
		System.out.println("狗的毛色是:" + myDog.color);
		// ==============================
		// 使用方法(行為)
		myDog.run();
		myDog.running();
		myDog.eat("胖總柴");
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
		// withdraw31是靜態方法，可以直接透過 類別名稱,靜態方法 呼叫
		Bank.withdraw5(null, null, null, 0);
		// withdraw3是動態方法，要先new類別才可以呼叫
		Bank myBank = new Bank();
		myBank.withdraw3("title","TTA分行","AAA", 0);
	}
	
	@Test
	public void stringTest3() {
		String str = "ABCADAQW";
		String newStr = str.replace("A", "Z");           // replace是換全部
		String newStr1 = str.replaceAll("A", "Z");       // replaceAll也是換全部
		String newStr2 = str.replaceAll("[A-C]", "Z");   // 正規表達式[A-C]是A到C的意思，然後換成Z
		System.out.println(newStr);
		System.out.println(newStr1);
		System.out.println(newStr2);
	}
}
