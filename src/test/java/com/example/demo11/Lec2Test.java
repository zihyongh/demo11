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

	//�ɮ׵���
	/**
	 * 
	 * @param test �ѥ���ISBN
	 * @return �ѥ��W��
	 */
	public String fileCommentTest(int test) {
		return null;
	}
	/* �h�����
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
		System.out.println("10���H3���ӼƬO" + quotient);
		System.out.println("10���H3���l�ƬO" + remaindar);
	}
	
	@Test
	public void compoundTest() {
		int a = 9;
		int b = 4;
		System.out.println(a+=9); //1
		System.out.println(--a); //2 //a--���ܷ|���C�L�A���p��
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
	 * @param start �_�l��
	 * @param end �̲׭�
	 * @return ���t�ƦC�M
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
	 * @param c �����ū�
	 * @return ��X���ؤ�ū�
	 */
	public double temcToTemf(double c) {
		double f ;
		f = (c * 9 / 5) + 32;
		return f ;
	}
	
	/**
	 * 
	 * @param f ��ؤ�ū�
	 * @return ��X�����ū�
	 */
	public double temfToTemc(double f) {
		double c ;
		c = ( f - 32 ) * 5 / 9;
		return c ;
	}
	
	// for �j�� (���t�ż��`�M)
	@Test
	public void practiceTest2() {
		int a = this.forloop(100);
		System.out.println(a);
	}
	/**
	 * 
	 * @param end �פ��
	 * @return �`�M
	 */
	public int forloop (int end) {
		int sum = 0;  // �b�j��~�ŧi�~�i�H�Φb�j��H�~���a��
		for(int i = 1 ; i <= end ; i++) {
			sum = sum + i;
		}
		return sum; //��^�n��bfor�~���A��̭��|�b�Ĥ@��]���N�^�Ǧ^�h�F
	}
	
	// while �j�� (���t�ż��`�M)
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
	
	
	// do while �j�� (���t�ż��`�M)
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
	
	
	// for�j�� (�E�E���k��)
	@Test
	public void multipleForm () {
		for(int a = 1 ; a < 10 ; a++) {
			for(int b = 1 ; b < 10 ; b++) {
				System.out.printf("%d*%d=%2d " , a , b , a*b); // ����Ÿ�(�@���*�t�@���=����) 
			}
			System.out.printf("\n"); //�b�]���W�����Ӱj�餧��۰ʴ���
		}
	}
	
	// while�j�� (�E�E���k��)
	@Test
	public void multipleForm2 () {
		int a = 1;
		while(a < 10) {
			int b = 1; // ��l�Ʊ��󤣭n�g���a��
			while(b < 10) {	
				System.out.printf("%d*%d=%2d " , a , b , a*b);
				b++;
			}
				System.out.printf("\n");
				a++;
		}
		
	}
	
	// do while �j��
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
	
	// �L�a�j��
	@Test
	public void infiniteLoop() {
		
	int i = -1;
	for(;;) {
		i++;
		if(i == 1) {
			continue;
		}
		if(i == 5) {
			break; //�Mreturn���@��
		}
		System.out.println(i);
		}
	}
	
	// break & continue
	@Test
	public void nestedLoopBreakTest() {
		a: for(int i = 0 ; i < 10 ; i+=2) { // ���j��[�W���ҦW�١A�u�ݭn�b�j��e���[�W�i���ҦW�١G�j
			System.out.println(i);
			for(int j = 1 ; j < 10 ; j+=2) {
				System.out.println(j);
//				break;�@// �w�]�|��̪񪺰j��@�ΡA�U�|���Xj���j��
				break a; // �Y�n��~�h�j��@�ΡA���b�~�h�j��[�W���ҡA�A���������ҦW��
			}
			System.out.println("���h�w����");
		}
		System.out.println("�~�h�w����");
	}
	
	// ���ߦPŢ
	@Test
	public void practiceLoop5() {
		this.chirabLoop(35, 130);
	}
	
	public void chirabLoop(int head, int foot) {
		// �i�H���P�_�}���ƥجO���O���ơA���O���ƴN�i�H���F�A�`�ٵ{�����B��ɶ�
//		if(foot%2 == 1) {
//			System.out.println("�o�D�L��");
//			return;
//		}
		
		int chi = 0;
		while(chi <= head) {
			int rab = head - chi;
			if(2 * chi + 4 * rab == foot) {
				System.out.println("����" + chi + "�� ; �ߦ�" + rab + "��");
//				System.out.println("�� : ��\n%d : %d\n", chi, rab);
				return;  // �]�i�H��break
			}
			chi++;
		}
		System.out.println("�L��");
		
//		if(rab > head){
//			System.out.println("�L��");
//			return;   // �]�i�H��break;
//		}
		
	}
	
	// if�P�_��(�����p��)
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
//		else {    // �ٲ�else���{���X����n�g
//			ticket = 100;
//			return (int) ticket;
//		}
		return ticket;
	}
	
	// switch �P�_��
	@Test
	public void practice7Switch() {
		this.gradeSwitch(100);
	}
	public void gradeSwitch(int grade) {
		switch(grade/10) {
		
			case 10 : // case�᭱������ܼ�  // �p�G�L�X���G�@�ˡA�i�H�{���B�@�i�H�ٲ�
			case 9 :
				System.out.println("A");  // �]�i�H�g�� return'A'�A�ٲ�break
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

	

