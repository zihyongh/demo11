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
		// ���1,2,99
		int c = Math.max(99,Math.max(1,2));  // �n����T�ӭȡA�n���Ψ�ӭȤ񧹤���A��t�~�@�ӭȤ��
		System.out.println(c);
		
		// �L����i��
		int e1 = (int) Math.round(3.4);
		int e2 = (int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		
		// rint
		int f1 = (int) Math.rint(2.5);  // �p���I�O5�ɡA�|�^�ǳ̱��񪺰��ƭ�
		int f2 = (int) Math.rint(3.5);
		System.out.println(f1);
		System.out.println(f2);
		
		// ����
		int i = (int) Math.pow(10, 2);  // 10^2
		System.out.println(i);
		
		// �P�_���e���L�N�q
		String str5 = new String();
		String str4 = null; // �S���O�����m�A�ҥH�sString����k������ϥ�
		String str2 = "";   // �Ŧr�� (empty string)
		String str3 = " ";  // �ťզr��
		System.out.println(str5);
		System.out.println(str4);
		if(str4 != null) {
			boolean b21 = str4.isEmpty();
		}
		
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		System.out.printf("�r����׬�:%d , isEmpty�����G��:%b\n", str2.length(),b1 );
		System.out.printf("�r����׬�:%d , isEmpty�����G��:%b\n", str3.length(),b2 );
		
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
		System.out.printf("�r����׬�:%d , isBlank�����G��:%b\n", str2.length(),b3 );
		System.out.printf("�r����׬�:%d , isBlank�����G��:%b\n", str3.length(),b4 );
		
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		System.out.printf("�r����׬�:%d , isBlank�����G��:%b\n", str2.length(),b5 );
		System.out.printf("�r����׬�:%d , isBlank�����G��:%b\n", str3.length(),b6 );
		
		// �j�M
		String s1 = "�p�s�k�P���L�s";
		System.out.println(s1.contains("�p"));
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("�s"));      // �p�G����ӬۦP���r�A�|�^�Ǳq���}�l�ƪ��Ĥ@��
		System.out.println(s1.lastIndexOf("�s"));  // �p�G����ӬۦP���r�A�|�^�Ǳq�k�}�l�ƪ��Ĥ@��
		System.out.println(s1.indexOf("��"));      // �S�����r�|�^��-1
		System.out.println(s1.indexOf("�s", 1));   // �p�G�q�Ĥ@�Ӷ}�l��A�Ĥ@�ӹJ�쪺�N�@�˷|�O1
		System.out.println(s1.indexOf("�s", 2));
		
		// ����
		// ���N
		// �ഫ��ƫ��A
		// ������e��
	}
	
	
	// �p��r��
	@Test
	public void stringTest() {
		this.calcWords("AABCBDCDACBDA");
	}
	public void calcWords(String a) {
		
//		// �j�M�r��
//		int wordA1 = a.indexOf("A");
//		int wordB1 = a.indexOf("B");
//		int wordC1 = a.indexOf("C");
//		int wordD1 = a.indexOf("D");
//		
//		// �q�j�M�쪺��m���U�@�Ӧ�m�~��j�M
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
