package com.example.demo11;

import org.junit.jupiter.api.Test;

public class NewLec1 {
	
	@Test							// 在測試檔案的型態不能有任何回傳值
	void contextLoads() {			// 只寫void的意思是沒定義權限，只在這個頁面可以使用
		int a = 10;
		Integer b = 20; 			// class 的預設值是null
		Integer c = new Integer(30);
		
		// class 類別
		String str1 = "abc";		// 創建後會存入字串池裡面
		String str2 = new String("abc");
		
		// ==============================
		int aaa;        // 預設值是0
		Integer bbb;    // 預設值是null，因為他是class
		
	}
	
	@Test
	public void stringTest2() {
		String str = "abc";
		String str1 = "abc";
		String str2 = new String ("abc");
		System.out.println(str == str1);		// true
		System.out.println(str1 == str2);		// false 
		System.out.println(str.equals(str2));	// true
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC");      				  // 串接用"append"這個方法
		strBuf.append("DEF").append("QQQ");       // 可以連續.append下去
		System.out.println(strBuf.toString());    // 轉字串
	}
	
	@Test
	public void stringReverseTest() {
		String str = "abcde";
		String[] strArray = str.split("");  // [a, b, c, d, e]
									// index:   0, 1, 2, 3, 4
		String newStr = "";
		for(int i = strArray.length - 1 ; i >= 0 ; i--) {
			String item = strArray[i];
			newStr = newStr + item;
			// 第一次: i = 4 ; item = "e" ; newStr 從 "" --> ""+"e" = "e"
			//.....
		}
		//================================
		
		// 直接用 StringBuffer 非常快速
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();		
	}
	
	@Test
	public void tttTest() {
		int a = 5;
		if(a >= 18) {
			System.out.println("年齡: + a");  //大括號可以省略，範圍一樣指第一行
			}
			System.out.println("已成年");
	}
	
}
