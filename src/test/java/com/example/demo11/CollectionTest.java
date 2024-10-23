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
		// List 是介面(interface)，只是用來定義方法而已，並無任何實作內容，所以無法使用 new 建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別
		List<Bank> list = new ArrayList<Bank>(); // 第二個 BANK 可以省略不寫
		// List 中的資料型態不能放8種基本資料型態，只能是類別(class)
		List<Integer> intList = new ArrayList<>();

		// 插入順序是固定的
		intList.add(1);
		intList.add(2);
		intList.add(1);
		intList.add(3);
		intList.add(2, 5); // 可以新增指定位置的元素
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

		// 用 forEach 跑會報錯，因為刪掉B之後長度會改變，但 forEach 的長度在一開始就固定不會改變
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
		// 1. 相同的元素只會保留一個(不允許重複的元素)
		// 2. 無序(不會依照新增的順序來排列)
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
		// 1. 相同的元素只會保留一個(不允許重複的元素)
		// 2. 有序(會依照新增的順序來排列)
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
		// 1. 相同的元素只會保留一個(不允許重複的元素)
		// 2. 由小到大排序
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
		Set <Integer> Set = new TreeSet<>();			// 這裡的Set可以寫成TreeSet
		while (Set.size() < 5) {
			// 產生1~10亂數
			Set.add(randomNumber.nextInt(1, 11));	// 這個叫匿名函數
		}

		// 取最大和最小
		// 因為Set本身沒有first和last方法
		// 所以轉型(cast)成TreeSet，就有取最大和最小的功能(推薦:也可以在148行的時候就把Set改成TreeSet)
		// 轉型:將值的資料型態轉換成另一種資料型態
			// 1. 被轉型的資料型態寫在變數前面，一定要有小括號(TreeSet<Integer>)set
			// 2. 使用小括號將轉換的資料型態和值放在一起，這樣才能使用轉換後的方法
			// 3. 慎用
		System.out.println("最小" + ((TreeSet<Integer>) Set).first());
		System.out.println("最大" + ((TreeSet<Integer>) Set).last());
		
		// 另一種方法是把 Set 轉成 List
//		List <Integer> list = new ArrayList<>(strSet);
//		System.out.println("min" + list.get(0));
//		System.out.println("max" + list.get(list.size() - 1));
		
		// 由小到大(tree直接印出來就由小到大排序)
		System.out.println(Set);   // Set 也可以改成 list (如果上面有先轉成 list )

		// 由大到小(轉list)
		List <Integer> list = new ArrayList<>(Set);
		for (int i = Set.size() - 1 ; i >= 0 ; i--) {
			System.out.println(list.get(i));
		}
		
		// 由大到小(reverse)
		Collections.reverse(list);		// reverse: 反轉排序
		System.out.println(list);
	}
	
	@Test
	public void mapTest() {
		// Map<key的資料型態 value 的資料型態>
		Map <Integer , String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//  使用 get(key 值) 透過 key 將對應的 value 取出
		String str = map.get(2);
		System.out.println(str);
		// 遍歷: 使用 foreach 將 map 中的 key-value 取出
		// 將 map 轉成 entrySet ，item 就是包含了 key 和 value ，可以使用 getKey 和 getValue 取值
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("========");
		// 將 map 轉成 keySet，每個 item 就表示一個 key，透過 get(item) 將對應的value取出
		for(Integer item : map.keySet()) {
			System.out.println("key:" + item);
			System.out.println("value" + map.get(item));
		}
		System.out.println("========");
		// 原本 map 中，已存在key = 1 以及對應的 value = A;
		// 現在在相同1位置的位置放入 D，key = 1 其對應的 value 會變成 D (相同key，對應的value後蓋前)
		map.put(1, "D");
		// 不同的 key，可以有相同或不同的對應 value
		map.put(4, "D");
		for(Integer item : map.keySet()) {
			System.out.println("key:" + item);
			System.out.println("value" + map.get(item));
		}
	}
	
	@Test
	public void mapTest2() {
		// key-value 是一對一
		Map <Integer , String> map = new HashMap<>();
		// key-value 是一對多
		Map <Integer , String[]> map2 = new HashMap<>();
		Map <Integer , List<String>> map3 = new HashMap<>();
		Map <Integer , Map<String , String>> map5 = new HashMap<>();
	}
	
	@Test
	public void test123() {
		// isEmpty(): 詢問集合或是 map 其 size 是否為 0 (空的)
		List <String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set <String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map <String , String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		// ============
		System.out.println("=====================");
		List <String> list2 = null;
		// 因為 list123 是 null，連記憶體位置都沒有，所以根本無法用 .方法() 來執行程式，會報錯
		// 下行程式碼會報 nullPointerException (空指針錯誤)
		System.out.println(list2.isEmpty());
		
	}
	
	
	//使用哈希表 // 兩數之和
	
	
	}

}
