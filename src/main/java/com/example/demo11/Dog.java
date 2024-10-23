package com.example.demo11;

public class Dog {
	// 宣告屬性(特性)
	String category;  // 盡量不要擠在一起
	
	String color;
	
	String name;
	
	int age;
	
	// 定義方法(行為)
	
	public void run() {
		System.out.println("正在跑!!");
	}
	
	// 方法的多載(overload)
	// 1. 雖然方法名稱相同，但方法參數個數不一樣，所以呼叫run方法時，系統可以辨別是要跑哪一種方法
	public void run(String name) {               
		System.out.println(name + "正在跑!!");
	}
	// 2. 雖然方法名稱相同，但方法參數個數一樣，但是相同位置的參數資料型態不一樣，所以呼叫run方法時，系統可以辨別是要跑哪一種方法
	public void run(int age , String name) {               
		System.out.println(name + "正在跑!!");
	}
	public void run(String name, int age) {               
		System.out.println(name + "正在跑!!");
	}
	
	public void running() {
		System.out.println(name + "正在跑!!");
	}
	
	public void eat(String name) {
		// 印出:霸氣的總柴很愛吃變成胖總柴
		System.out.println(this.name + "很愛吃變成" + name);  // 用this來區分出 class Dog 的 name 
	}
	
}
