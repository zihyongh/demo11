package com.example.demo11;

import org.junit.jupiter.api.Test;

public class NewLec1 {
	
	@Test							// �b�����ɮת����A���঳����^�ǭ�
	void contextLoads() {			// �u�gvoid���N��O�S�w�q�v���A�u�b�o�ӭ����i�H�ϥ�
		int a = 10;
		Integer b = 20; 			// class ���w�]�ȬOnull
		Integer c = new Integer(30);
		
		// class ���O
		String str1 = "abc";		// �Ыث�|�s�J�r����̭�
		String str2 = new String("abc");
		
		// ==============================
		int aaa;        // �w�]�ȬO0
		Integer bbb;    // �w�]�ȬOnull�A�]���L�Oclass
		
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
		strBuf.append("ABC");      				  // �걵��"append"�o�Ӥ�k
		strBuf.append("DEF").append("QQQ");       // �i�H�s��.append�U�h
		System.out.println(strBuf.toString());    // ��r��
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
			// �Ĥ@��: i = 4 ; item = "e" ; newStr �q "" --> ""+"e" = "e"
			//.....
		}
		//================================
		
		// ������ StringBuffer �D�`�ֳt
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();		
	}
	
	@Test
	public void tttTest() {
		int a = 5;
		if(a >= 18) {
			System.out.println("�~��: + a");  //�j�A���i�H�ٲ��A�d��@�˫��Ĥ@��
			}
			System.out.println("�w���~");
	}
	
}
