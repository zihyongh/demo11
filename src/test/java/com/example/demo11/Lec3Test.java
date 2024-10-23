package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {

	// 遞迴

	@Test
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		// 當拆解到最小問題時，直接回傳答案
		if (x == 1) {
			return 1;
		}
		// 每一次的答案會是 原本傳進來的參數 + 以(參數 - 1)來呼叫此方法的結果
		int sum = x + this.recurrence(x - 1);
		return sum;
	}

	// 猜數字
	@Test
	public void guessNumberGame() {
		
		// 生成一個數字
		Random r = new Random();
		int number = r.nextInt(2, 99);
		System.out.println(number);
		
		// 輸入使用者輸入的數字
		Scanner scan = new Scanner(System.in);
		int start = 1 ;
		int end = 99;
		while (true) {
			System.out.println("輸入" + start + "~" + end +"任一數字");
			int ans = scan.nextInt();
			if (ans < 1 || ans > 99) {
				System.out.println("請輸入正確範圍的數字");
			}
			else if (ans > number) {
				end = ans;
			}
			else if(ans < number) {
				start = ans;
			}
			else{
				System.out.println("猜中了!");
				break;
			}
		}
	}
	

			
}
				

