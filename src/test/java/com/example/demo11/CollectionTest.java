package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest() {
		String str = new String();
		Bank bank = new Bank();
		// List �O����(interface)�A�u�O�Ψөw�q��k�Ӥw�A�õL�����@���e�A�ҥH�L�k�ϥ� new �إ߹��
		// ArrayList �O�Ψӹ�{�w�q�b List ����k����@���O
		List<Bank> list = new ArrayList<Bank>(); // �ĤG�� BANK �i�H�ٲ����g
		// List ������ƫ��A�����8�ذ򥻸�ƫ��A�A�u��O���O(class)
		List<Integer> intList = new ArrayList<>();

		// ���J���ǬO�T�w��
		intList.add(1);
		intList.add(2);
		intList.add(1);
		intList.add(3);
		intList.add(2, 5); // �i�H�s�W���w��m������
		for (Integer item : intList) {
			System.out.println(item);
		}
		System.out.println("================================");
		intList.remove(2);
		for (Integer item : intList) {
			System.out.println(item);
		}
	}

	@Test
	public void listTest1() {
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("A");
		strList.add("C");
		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(i).equals("B")) {
				strList.remove(strList.get(i));
			}
			System.out.println(strList.get(i));
		}
		System.out.println("================================");

		// �� forEach �]�|�����A�]���R��B������׷|���ܡA�� forEach �����צb�@�}�l�N�T�w���|����
		for (String item : strList) {
			if (item.equals("B")) {
				strList.remove(item);
			}
			System.out.println(item);
		}
	}

	@Test
	public void listTest2() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("A");
		strList.add("C");
		System.out.println(strList.get(0));
		System.out.println(strList.get(strList.size() - 1));
	}

	@Test
	public void hashsetTest() {
		// HashSet
		// 1. �ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2. �L��(���|�̷ӷs�W�����ǨӱƦC)
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// LinkedHashSet
		// 1. �ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2. ����(�|�̷ӷs�W�����ǨӱƦC)
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void treeSetTest() {
		// TreeSet
		// 1. �ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2. �Ѥp��j�Ƨ�
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void collectionPractice() {
		Random randomNumber = new Random();
		Set <Integer> Set = new TreeSet<>();			// �o�̪�Set�i�H�g��TreeSet
		while (Set.size() < 5) {
			// ����1~10�ü�
			Set.add(randomNumber.nextInt(1, 11));	// �o�ӥs�ΦW���
		}

		// ���̤j�M�̤p
		// �]��Set�����S��first�Mlast��k
		// �ҥH�૬(cast)��TreeSet�A�N�����̤j�M�̤p���\��(����:�]�i�H�b148�檺�ɭԴN��Set�令TreeSet)
		// �૬:�N�Ȫ���ƫ��A�ഫ���t�@�ظ�ƫ��A
			// 1. �Q�૬����ƫ��A�g�b�ܼƫe���A�@�w�n���p�A��(TreeSet<Integer>)set
			// 2. �ϥΤp�A���N�ഫ����ƫ��A�M�ȩ�b�@�_�A�o�ˤ~��ϥ��ഫ�᪺��k
			// 3. �V��
		System.out.println("�̤p" + ((TreeSet<Integer>) Set).first());
		System.out.println("�̤j" + ((TreeSet<Integer>) Set).last());
		
		// �t�@�ؤ�k�O�� Set �ন List
//		List <Integer> list = new ArrayList<>(strSet);
//		System.out.println("min" + list.get(0));
//		System.out.println("max" + list.get(list.size() - 1));
		
		// �Ѥp��j(tree�����L�X�ӴN�Ѥp��j�Ƨ�)
		System.out.println(Set);   // Set �]�i�H�令 list (�p�G�W�������ন list )

		// �Ѥj��p(��list)
		List <Integer> list = new ArrayList<>(Set);
		for (int i = Set.size() - 1 ; i >= 0 ; i--) {
			System.out.println(list.get(i));
		}
		
		// �Ѥj��p(reverse)
		Collections.reverse(list);		// reverse: ����Ƨ�
		System.out.println(list);
	}
	
	@Test
	public void mapTest() {
		// Map<key����ƫ��A value ����ƫ��A>
		Map <Integer , String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//  �ϥ� get(key ��) �z�L key �N������ value ���X
		String str = map.get(2);
		System.out.println(str);
		// �M��: �ϥ� foreach �N map ���� key-value ���X
		// �N map �ন entrySet �Aitem �N�O�]�t�F key �M value �A�i�H�ϥ� getKey �M getValue ����
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("========");
		// �N map �ন keySet�A�C�� item �N��ܤ@�� key�A�z�L get(item) �N������value���X
		for(Integer item : map.keySet()) {
			System.out.println("key:" + item);
			System.out.println("value" + map.get(item));
		}
		System.out.println("========");
		// �쥻 map ���A�w�s�bkey = 1 �H�ι����� value = A;
		// �{�b�b�ۦP1��m����m��J D�Akey = 1 ������� value �|�ܦ� D (�ۦPkey�A������value��\�e)
		map.put(1, "D");
		// ���P�� key�A�i�H���ۦP�Τ��P������ value
		map.put(4, "D");
		for(Integer item : map.keySet()) {
			System.out.println("key:" + item);
			System.out.println("value" + map.get(item));
		}
	}
	
	@Test
	public void mapTest2() {
		// key-value �O�@��@
		Map <Integer , String> map = new HashMap<>();
		// key-value �O�@��h
		Map <Integer , String[]> map2 = new HashMap<>();
		Map <Integer , List<String>> map3 = new HashMap<>();
		Map <Integer , Map<String , String>> map5 = new HashMap<>();
	}
	
	@Test
	public void test123() {
		// isEmpty(): �߰ݶ��X�άO map �� size �O�_�� 0 (�Ū�)
		List <String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set <String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map <String , String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		// ============
		System.out.println("=====================");
		List <String> list2 = null;
		// �]�� list123 �O null�A�s�O�����m���S���A�ҥH�ڥ��L�k�� .��k() �Ӱ���{���A�|����
		// �U��{���X�|�� nullPointerException (�ū��w���~)
		System.out.println(list2.isEmpty());
		
	}
	
	
	//�ϥΫ��ƪ� // ��Ƥ��M
	
	
	}

}
