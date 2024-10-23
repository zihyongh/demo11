package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {

	// ���j

	@Test
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		// ���Ѩ�̤p���D�ɡA�����^�ǵ���
		if (x == 1) {
			return 1;
		}
		// �C�@�������׷|�O �쥻�Ƕi�Ӫ��Ѽ� + �H(�Ѽ� - 1)�өI�s����k�����G
		int sum = x + this.recurrence(x - 1);
		return sum;
	}

	// �q�Ʀr
	@Test
	public void guessNumberGame() {
		
		// �ͦ��@�ӼƦr
		Random r = new Random();
		int number = r.nextInt(2, 99);
		System.out.println(number);
		
		// ��J�ϥΪ̿�J���Ʀr
		Scanner scan = new Scanner(System.in);
		int start = 1 ;
		int end = 99;
		while (true) {
			System.out.println("��J" + start + "~" + end +"���@�Ʀr");
			int ans = scan.nextInt();
			if (ans < 1 || ans > 99) {
				System.out.println("�п�J���T�d�򪺼Ʀr");
			}
			else if (ans > number) {
				end = ans;
			}
			else if(ans < number) {
				start = ans;
			}
			else{
				System.out.println("�q���F!");
				break;
			}
		}
	}
	

			
}
				

