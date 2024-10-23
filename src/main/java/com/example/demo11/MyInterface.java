package com.example.demo11;

// 介面本身就是一個抽象的物件，所以關鍵字 abstract 可有可無
// 完整的寫法是: public abstract interface
// 介面是抽象物件，無法使用關鍵字 new 來生成實例
public interface MyInterface {
	
	// 定義在介面中的屬性
	// 1. 權限只能是 public 或是 nomodifier
	// 2. 必須要給初始值
	int NUM = 10;
	public int NUM2 = 10;
	// 3. 完整的寫法(或是被編譯後的寫法)如下
	// 4. 因為被定義成 final，是常數，所以變數名稱要全大寫，遇到不同的英文字母間用底線串接
	public static final int NUMBER = 10;
	// 靜態方法本身就是全域，所以可以在test包中透過介面或變數來呼叫
	
	// 因為介面是一個抽象的物件，所以定義裡面的方法都是抽象方法
	// 只是關鍵字 abstract 一樣可以省略: public abstract void fly();
	public void fly();
	
	// 介面中可以有預設方法實作內容(有大括號)，但一定要加上關鍵字 default
	// 預設方法不強制一定要重新定義
	public default void flying(String name) {
		System.out.println(name + "~~flying");
	}
	
	// 定義在介面中的 static 方法，一定要有實作內容(因為是全域唯一，既然是唯一就不能被重新定義)
	// static 方法無法被重新定義
	public static void flying2(String name) {
		System.out.println(name + "~~flying");
	}
	
}
