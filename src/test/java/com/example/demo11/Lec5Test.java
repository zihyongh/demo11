package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;


public class Lec5Test {
	
	@Test
	public void mathTest() {
		
		// max,min
		int a = Math.max(99,2);
		System.out.println(a);
		int b = Math.min(99,2);
		System.out.println(b);
		// 比較1,2,99
		int c = Math.max(99,Math.max(1,2));  // 要比較三個值，要先用兩個值比完之後再跟另外一個值比較
		System.out.println(c);
		
		// 無條件進位
		int e1 = (int) Math.round(3.4);
		int e2 = (int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		
		// rint
		int f1 = (int) Math.rint(2.5);  // 小數點是5時，會回傳最接近的偶數值
		int f2 = (int) Math.rint(3.5);
		System.out.println(f1);
		System.out.println(f2);
		
		// 平方
		int i = (int) Math.pow(10, 2);  // 10^2
		System.out.println(i);
		
		// 判斷內容有無意義
		String str5 = new String();
		String str4 = null; // 沒有記憶體位置，所以連String的方法都不能使用
		String str2 = "";   // 空字串 (empty string)
		String str3 = " ";  // 空白字串
		System.out.println(str5);
		System.out.println(str4);
		if(str4 != null) {
			boolean b21 = str4.isEmpty();
		}
		
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		System.out.printf("字串長度為:%d , isEmpty的結果為:%b\n", str2.length(),b1 );
		System.out.printf("字串長度為:%d , isEmpty的結果為:%b\n", str3.length(),b2 );
		
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
		System.out.printf("字串長度為:%d , isBlank的結果為:%b\n", str2.length(),b3 );
		System.out.printf("字串長度為:%d , isBlank的結果為:%b\n", str3.length(),b4 );
		
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		System.out.printf("字串長度為:%d , isBlank的結果為:%b\n", str2.length(),b5 );
		System.out.printf("字串長度為:%d , isBlank的結果為:%b\n", str3.length(),b6 );
		
		// 搜尋
		String s1 = "小龍女與楊過龍";
		System.out.println(s1.contains("小"));
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("龍"));      // 如果有兩個相同的字，會回傳從左開始數的第一個
		System.out.println(s1.lastIndexOf("龍"));  // 如果有兩個相同的字，會回傳從右開始數的第一個
		System.out.println(s1.indexOf("不"));      // 沒有的字會回傳-1
		System.out.println(s1.indexOf("龍", 1));   // 如果從第一個開始找，第一個遇到的就一樣會是1
		System.out.println(s1.indexOf("龍", 2));
		
		// 裁切
		// 取代
		// 轉換資料型態
		// 比較內容值
	}
	
	
	// 計算字母
	@Test
	public void stringTest() {
		this.calcWords("AABCBDCDACBDA");
	}
	public void calcWords(String a) {
		
//		// 搜尋字母
//		int wordA1 = a.indexOf("A");
//		int wordB1 = a.indexOf("B");
//		int wordC1 = a.indexOf("C");
//		int wordD1 = a.indexOf("D");
//		
//		// 從搜尋到的位置的下一個位置繼續搜尋
//		int wordA2 = a.indexOf("A", wordA1+1);
//		int wordB2 = a.indexOf("B", wordB1+1);
//		int wordC2 = a.indexOf("C", wordC1+1);
//		int wordD2 = a.indexOf("D", wordD1+1);
		
		int countTime = 0;
		int wordA = a.indexOf("A");
		while(wordA != -1) {
			countTime++;
			wordA = a.indexOf("A", wordA + 1);
		}
		System.out.println(countTime);
	}
	
}
