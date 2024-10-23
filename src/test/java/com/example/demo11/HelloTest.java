package com.example.demo11;

import org.junit.jupiter.api.Test;

public class HelloTest {
	@Test // 要使用單元測試必須加上此annotation
	public void helloTest() {
		System.out.println(this.helloMaker("hello "));
		//this適用於呼叫大括號外的方法或變數時，才需要添加
		//呼叫方法時，不論有沒有傳入參數，都必須加上小括號
		//如:this.大括號外的方法名稱(參數)
		System.out.println(this.helloMaker2("hello" ,"bye "));
	}
	
	
	public String helloMaker(String inString) {
		// 因為宣告方法時，有要求回傳字串，故必須return字串，才不會報錯
		return inString+"world";
	}
	
	// 在參數名稱前面加上...即可輸入不只一個參數，而傳入的參數會以陣列(array，資料組成的一長列)的方式儲存
	// 此時的參數名稱會代表此陣列的儲存位置(記憶體空間)，要取用陣列內的內容需要加上[索引位置]
	// 必且記得，程式的索引位置通常以0為起始點
	public String helloMaker2(String...inString) {
		return inString[1]+"world";
	}
	
	@Test
	public void staticFinalTest() {
		// ctrl+點擊:可查看該物品的詳細資料
		// 因為PI被加上了static的前綴，所以不能再被修改
		// 而因為PI本身有static所以不需要先創建才能使用，而是大家都存取同一個記憶空間裡的值
		// 創建是指建立一個記憶體空間給該物件
		System.out.println(Math.PI);
	}
	
	@Test
	public void variableTest() {
		//數值-整數
		//強制轉型:值前面加上(要轉型的資料型態)
		byte a = (byte)128;
		short b = 3;
		int c = 128;
		a = (byte)c;
//		System.out.println(a);
		//-浮點數(小數)
		float g = (float)0.5;
		double h = 0.5;
		//字元
		char i = '1';
		char l = 65;  //當把數字放入char容器中時，程式會自動解讀為文字編碼，找到該數字相對應的字元
		//布林值
		boolean j = true;
		boolean k = false;
		
		//容器賦值的流程
		int res = 5/2;
//		System.out.println(res);
		// 當沒有小數點時，程式會自動將數字解讀為int(整數)，因此計算的結果也會用整數的方式呈現
		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2);
		// 而只要有任何一數是小數，程式就能夠以小數的方式去計算出結果(2.5)
		double res2 = (double)(5/2);
		// 程式執行的順序會是5先除以2，再將相除出來的整數轉換為小數，最後放入容器中，所以是2.0不是2.5
		System.out.println(res2);
	}
	
	@Test
	public void hardCodeTest() {
	
	int add1 = 4;
	int add2 = 5;
	
	// 將時作內容用兩個變數包起來，方便未來修改值的內容(只要修改變數即可)
	int sum2 = add1 + add2;
	System.out.println(sum2);
	
	// 省略掉只使用一次的sum2，稱為匿名變數
	System.out.println(add1 + add2);
	}
	
	@Test
	public void stringTest() {
		// 測試基本資料型態的判斷
		int a = 1;
		int b = 1;
		System.out.println(a==b);
		
		String c = "a";
		String d = "a";
		String e = new String("a");
		System.out.println(c == d);
		System.out.println(e);
		System.out.println(c == e);
		
		// 類別與基本資料型態的差異
//		int a1 = null;
		integer a1 = null;
		}
	


}
