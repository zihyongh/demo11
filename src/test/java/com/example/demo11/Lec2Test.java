package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec2Test {
	@Test
	public void reviewLec1() {
		int a;
		String b = "1111";
	}	

	//檔案註解
	/**
	 * 
	 * @param test 書本的ISBN
	 * @return 書本名稱
	 */
	public String fileCommentTest(int test) {
		return null;
	}
	/* 多行註解
	 *
	 *	 
	 * 
	 * 
	 */

	@Test
	public void computeTest() {
		int a = 10;
		System.out.println(a);
		System.out.println(a++ * 10); // a*10 ; a=a+1;
		System.out.println(a);
		
		System.out.println("***********************");
		
		a = 10;
		System.out.println(a);
		System.out.println(++a * 10); // a=a+1 ; a*10;
		System.out.println(a);
		
		int quotient = 10/3;
		int remaindar = 10%3;
		System.out.println("10除以3的商數是" + quotient);
		System.out.println("10除以3的餘數是" + remaindar);
	}
	
	@Test
	public void compoundTest() {
		int a = 9;
		int b = 4;
		System.out.println(a+=9); //1
		System.out.println(--a); //2 //a--的話會先列印再做計算
		System.out.println(a); //2
		System.out.println(a*=5); //3
		System.out.println(a%=b); //5
		
	}
	
	@Test
	public void compareTest() {
		boolean res1 = (1!=1); //false
		boolean res2 = (1==1); //true
		System.out.println(res1 && res2);
		System.out.println(res1 || res2);
	}
	
	
	@Test
	public void practiceTest() {
		int a = this.sum(1,100);
		System.out.println(a);
	}
	
	/**
	 * 
	 * @param start 起始值
	 * @param end 最終值
	 * @return 等差數列和
	 */
	public int sum (int start , int end) {
		int sum = ( start + end ) * (end - start + 1) / 2;
		return sum;
	}
	
	//
	@Test
	public void practiceTemTest() {
		double a = this.temcToTemf(34);
		double b = this.temfToTemc(66);
		System.out.println(a);
		System.out.println(b);
	}
	
	/**
	 * 
	 * @param c 原攝氏溫度
	 * @return 算出的華氏溫度
	 */
	public double temcToTemf(double c) {
		double f ;
		f = (c * 9 / 5) + 32;
		return f ;
	}
	
	/**
	 * 
	 * @param f 原華氏溫度
	 * @return 算出的攝氏溫度
	 */
	public double temfToTemc(double f) {
		double c ;
		c = ( f - 32 ) * 5 / 9;
		return c ;
	}
	
	// for 迴圈 (等差級數總和)
	@Test
	public void practiceTest2() {
		int a = this.forloop(100);
		System.out.println(a);
	}
	/**
	 * 
	 * @param end 終止值
	 * @return 總和
	 */
	public int forloop (int end) {
		int sum = 0;  // 在迴圈外宣告才可以用在迴圈以外的地方
		for(int i = 1 ; i <= end ; i++) {
			sum = sum + i;
		}
		return sum; //返回要放在for外面，放裡面會在第一圈跑完就回傳回去了
	}
	
	// while 迴圈 (等差級數總和)
	@Test
	public void practiceTest3() {
		int a = this.whileloop(100);
		System.out.println(a);
		}
		
	public int whileloop(int end) {
		int sum = 0;
		int a = 1;
		while (a <= end) {
			sum = sum + 1;
			a++;
		}	
		return sum;
	}
	
	
	// do while 迴圈 (等差級數總和)
	@Test
	public void practiceTest4() {
		int a = this.dowhileLoop(100);
		System.out.println(a);
		}
	
	public int dowhileLoop(int end) {
		int sum = 0;
		int a = 1;
		do {
			sum = sum + a;
			a++;
		} while(a <= end);
		return sum;
				
	}
	
	
	// for迴圈 (九九乘法表)
	@Test
	public void multipleForm () {
		for(int a = 1 ; a < 10 ; a++) {
			for(int b = 1 ; b < 10 ; b++) {
				System.out.printf("%d*%d=%2d " , a , b , a*b); // 佔位符號(一位數*另一位數=兩位數) 
			}
			System.out.printf("\n"); //在跑完上面那個迴圈之後自動換行
		}
	}
	
	// while迴圈 (九九乘法表)
	@Test
	public void multipleForm2 () {
		int a = 1;
		while(a < 10) {
			int b = 1; // 初始化條件不要寫錯地方
			while(b < 10) {	
				System.out.printf("%d*%d=%2d " , a , b , a*b);
				b++;
			}
				System.out.printf("\n");
				a++;
		}
		
	}
	
	// do while 迴圈
	@Test
	
	public void whileLoop() {
		boolean i = true;
		while(!i) {
			System.out.println("I am in~");
		}
	}
	
	public void dowhileLoop() {
		boolean i = true;
		do {
			System.out.println("I am in~");
		}while(!i);
			
	}
	
	// 無窮迴圈
	@Test
	public void infiniteLoop() {
		
	int i = -1;
	for(;;) {
		i++;
		if(i == 1) {
			continue;
		}
		if(i == 5) {
			break; //和return不一樣
		}
		System.out.println(i);
		}
	}
	
	// break & continue
	@Test
	public void nestedLoopBreakTest() {
		a: for(int i = 0 ; i < 10 ; i+=2) { // 幫迴圈加上標籤名稱，只需要在迴圈前面加上【標籤名稱：】
			System.out.println(i);
			for(int j = 1 ; j < 10 ; j+=2) {
				System.out.println(j);
//				break;　// 預設會對最近的迴圈作用，顧會跳出j的迴圈
				break a; // 若要對外層迴圈作用，須在外層迴圈加上標籤，再註明此標籤名稱
			}
			System.out.println("內層已結束");
		}
		System.out.println("外層已結束");
	}
	
	// 雞兔同籠
	@Test
	public void practiceLoop5() {
		this.chirabLoop(35, 130);
	}
	
	public void chirabLoop(int head, int foot) {
		// 可以先判斷腳的數目是不是偶數，不是偶數就可以停了，節省程式的運算時間
//		if(foot%2 == 1) {
//			System.out.println("這題無解");
//			return;
//		}
		
		int chi = 0;
		while(chi <= head) {
			int rab = head - chi;
			if(2 * chi + 4 * rab == foot) {
				System.out.println("雞有" + chi + "隻 ; 兔有" + rab + "隻");
//				System.out.println("雞 : 兔\n%d : %d\n", chi, rab);
				return;  // 也可以用break
			}
			chi++;
		}
		System.out.println("無解");
		
//		if(rab > head){
//			System.out.println("無解");
//			return;   // 也可以用break;
//		}
		
	}
	
	// if判斷式(票價計算)
	@Test
	public void practice6If() {
		int ticketPrice = this.ticketIf(45);
		System.out.println(ticketPrice);
	}
	
	public int ticketIf(int age) {
		int ticket = 100;
		if(age <= 6 || age >=80) {
			ticket *= 0.2;
			return (int) ticket;
		}
		if (age <=12 && age >=7 ) {
			ticket *= 0.5;
			return (int) ticket;
		}
		if(age >= 60 && age <=79) {
			ticket *= 0.5;
			return (int) ticket;
		}
//		else {    // 省略else的程式碼比較好寫
//			ticket = 100;
//			return (int) ticket;
//		}
		return ticket;
	}
	
	// switch 判斷式
	@Test
	public void practice7Switch() {
		this.gradeSwitch(100);
	}
	public void gradeSwitch(int grade) {
		switch(grade/10) {
		
			case 10 : // case後面不能放變數  // 如果印出結果一樣，可以程式運作可以省略
			case 9 :
				System.out.println("A");  // 也可以寫成 return'A'，省略break
				break;
			
			case 8 :
				System.out.println("B");
				break;
			
			case 7 :
				System.out.println("C");
				break;
			
			case 6 :
				System.out.println("D");
				break;
			
			default :
				System.out.println("F");
		}
	}
	
	
}

	

