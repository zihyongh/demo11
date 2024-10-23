package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {

	public void test0() {
		// \ �bjava����ܸ���Ÿ��A�ΨӸ��榳�S��N�q���Ÿ� --> �����S��N�q���Ÿ��ܦ���ª��r��
		// \ ����Ÿ��L�k��W�s�b
		// \\ --> �Ĥ@�Ӹ���Ÿ��O���ĤG�Ӹ���Ÿ��q���S��N�q�ܦ���ª��r��
		String pattern = "\\";
		System.out.println(pattern);
		String path;
	}

	@Test
	public void test() {
		// ��������X�榡 : �Ʀr4�X - �Ʀr3�X - �Ʀr3�X
		// \d ��ܼƦr 0~9 �����N�䤤�@��
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";

		Scanner scan = new Scanner(System.in);

		System.out.println("�п�J������X: �榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String input = scan.next();
		boolean check = input.matches(pattern);
		if (check) { // ���P�� check == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}

		// �W���� input.matches(pattern) �����G���ܼ� check ���^��
		// ���b���򪺵{���X���A�ܼ� check �u�ϥΤF�@��
		// �ҥH�i�H�ϥΰΦW(���ݭn���ܼƦW�٨ӱ��p�⪺���G)���覡��g
		if (input.matches(pattern)) { // ���P�� input.matches(pattern) == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}
	}

	@Test
	public void test1() {
		// ��������X�榡 : �Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d ��ܼƦr0~9�����N�䤤�@��
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// �ϥΤj�A�� {} �B�z pattern �����ƥX�{���r��A���ȭ���{}�e���r��
		String pattern = "\\d{4} - \\d{3} - \\d{3}";
		// �W�@�� -\\d ���ƤF2���A -\\d{3} �O�]�t�F - , \\d , {3} �o3���r��
		// �ҥH�ݭn�Τp�A����3�Ӧr��ꦨ�P�@��(-\\d{3})�A�A�Τj�A���B�z���ƪ�����
		// �U���o�浥��W���A�p�A���̪����e�|���ƨ⦸({2}�O���ƨ⦸���N��)
		String pattern1 = "\\d{4} (- \\d{3}) {2}";

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X: �榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String input = scan.next();

		if (input.matches(pattern)) { // ���P�� input.matches(pattern) == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}
	}

	@Test
	public void test2() {
		// ���ܮ榡1: �Ʀr2�X-�Ʀr7�X
		String pattern1 = "\\d{2}-\\d{7}";
		// ���ܮ榡2: (�Ʀr2�X)-�Ʀr7�X
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X: �榡�� �Ʀr2�X-�Ʀr7�X �άO (�Ʀr2�X)-�Ʀr7�X");
		String input = scan.next();
		if (input.matches(pattern1) || input.matches(pattern2)) {
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}
		// ====================================
		// �X�� pattern1 �M pattern2
		// �b pattern3 �����e���i�H�Ů�A���M�U�@�� matches ���ɭԷ|��Ů�@�_���i�h
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (input.matches(pattern3)) {
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}
		// =====================================
		// �X�ְϽX
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		if (input.matches(pattern4)) {
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}
	}

	@Test
	public void test3() {
		// ���ܮ榡: �Ʀr2�X-�Ʀr7�X��8�X
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// {7,8}���: �̤�7�X�A�̦h8�X
		String pattern1 = "\\d{2}-\\d{7,8}";
	}

	@Test
	public void test4() {
		// �����q�ܤ��
		String pattern = "(\\(\\d{2}\\)\\d{7})|(\\(\\d{2}\\)\\d{8})|(\\d{2}-{\\d{7})|(\\d{2}-{\\d{8}))";
		String pattern1 = "(\\(\\d{2}\\)\\d{7}|\\d{8})|\\d{2}-(\\d{7}|\\d{8})";
		String pattern2 = "(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
	}

	@Test
	public void test5() {
		String pattern3 = "0\\d{1,3}-\\d{7,8}";
	}

	@Test
	public void test6() {
		String pattern = "[A-CSW-Z]"; // �ŦX���r����:A�BB�BC�BS�BW�BX�BY�BZ
		String str = "_";
		System.out.println(str.matches(pattern));
	}

	@Test
	public void test7() {
		String pattern = "(0[1-9]{1,3})-\\d{7,8}"; // ()�i�H�ٲ��A�]���S���n��L������
		String str = "05-11223456";
		System.out.println(str.matches(pattern));
	}

	@Test
	public void test8() {
		// ��J�����Ҹ��X
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����Ҹ��X");
		String input = scan.next();
		if (input.length() < 10 || input.length() > 10) {
			System.out.println("�榡���~");
			return;
		}
			String pattern = "[A-Z][12]\\d{8}";				// [12]�B[1|2]�B[1-2]���i�H
			System.out.println(input.matches(pattern));
			
			String pattern2 = "[A-Z&&[^ABDEFH]][12]\\d{8}";
			System.out.println(input.matches(pattern2));
			
			String pattern3 = "[\\w&&[^_a-zABDEFH0-9]][1|2]\\d{8}";
			System.out.println(input.matches(pattern3));
	}

	@Test
	public void test9() {
	}
}
