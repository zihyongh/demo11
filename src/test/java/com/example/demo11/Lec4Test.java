package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

public class Lec4Test {

	// 1A2B
	@Test
	public void oneAGame() {
//		Random r = new Random();
//		int number = r.nextInt(0, 10);

		// 聲明一個陣列
		int[] numberArr = new int[4];

		while (true) {
			// 陣列中分別隨機出一個數
			numberArr[0] = (int) (Math.random() * 10);
			numberArr[1] = (int) (Math.random() * 10);
			numberArr[2] = (int) (Math.random() * 10);
			numberArr[3] = (int) (Math.random() * 10);
			// 有相同的數，就跳過
			if (numberArr[0] == numberArr[1] || numberArr[0] == numberArr[2] || numberArr[0] == numberArr[3]
					|| numberArr[1] == numberArr[2] || numberArr[1] == numberArr[3] || numberArr[2] == numberArr[3]) {
				continue;
			}
			// 沒有相同的數，就印出，然後結束迴圈
			else {
				for (int i = 0; i < numberArr.length; i++) {
					System.out.print(numberArr[i]);
				}
				break;
			}
		}

		// 匯入玩家輸入
		Scanner sc = new Scanner(System.in);

		// 叫玩家輸入四位數
		while (true) {
//			System.out.println();
			System.out.println("請輸入四個數字");
			int ans = sc.nextInt();    // 不能用nextInt，因為開頭是零的話會消失

			int a = 0;
			int b = 0;
			int[] ansArr = new int[4];
			ansArr[0] = ans / 1000;
			ansArr[1] = ans % 1000 / 100;
			ansArr[2] = ans % 1000 % 100 / 10;
			ansArr[3] = ans % 1000 % 100 % 10;

//			if(ansArr.length < 4) {
//				System.out.println("要輸入四個數字!");
//			}
//			else if(ans > 9999) {
//				System.out.println("要輸入正確範圍!!");
//			}

			if (ansArr[0] == ansArr[1] || ansArr[0] == ansArr[2] || ansArr[0] == ansArr[3] || ansArr[1] == ansArr[2]
					|| ansArr[1] == ansArr[3] || ansArr[2] == ansArr[3]) {
				System.out.println("數字不可以重複!");
			} else {

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (ansArr[i] == numberArr[j]) {
							if (i == j) {
								a++;
							} else {
								b++;
							}
						}
					}
				}

				System.out.println(a + "a" + b + "b");
				break;
			} // else結束

		}
	}

	// array 陣列
	@Test
	public void arrayTest() {
		// 宣告陣列
		int[] arr1 = new int[7]; // 單純宣告
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7]; // 單純宣告
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };

		// 剛宣告的陣列內容值都會是 null 或是 預設值(如果宣告時沒有賦值)
		System.out.println(arr1[0]); // 如果使用基本資料型態宣告，會自動幫你裝進預設值
		System.out.println(arr1Class[0]); // 如果使用類別宣告，不會有預設值，會是空的
		System.out.println(arr3[7]); // 超過陣列的大小，所以會是空的

		// 練習
		double weatherW1 = 30.0;
		double weatherW2 = 33.0;
		double weatherW3 = 35.0;
		double weatherW4 = 37.4;
		double weatherW5 = 30.0;
		double weatherW6 = 34.6;
		double weatherW7 = 38.0;
		double[] weather = { 30.0, 33.0, 35.0, 37.4, 30.0, 34.6, 38.0 };

		System.out.println(this.avgWeather(weather));
	}

	public double avgWeather(double[] weatherData) { // weatherData是空參數，有點像x的意思
		System.out.println(weatherData.toString()); // 只要不是基本資料型態裡面存的會是記憶體位置，故直接把變數轉為字串，會印出記憶體位置)
		System.out.println(Arrays.toString(weatherData)); // 需要使用array提供的方法才會印出正確的內容值

		double sum = 0;
		for (int i = 0; i < weatherData.length; i++) {
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length;
		return avg;
	}

	// array 練習

	@Test
	public void arrayPractice() {
		int[] gradeArr = { 50, 60, 40, 80, 90 };
		this.arrayGrade(gradeArr);
	}

	public void arrayGrade(int[] gradeData) {
		System.out.print("所得評審分數:");

//		for(int i = 0 ; i < gradeArr.length ; i++) {
//			System.out.print(" "+gradeArr[i]);
//		}

		System.out.println(Arrays.toString(gradeData));

		// 找出陣列中的最大和最小值
		int max = gradeData[0];
		int maxIndex = 0;
		int min = gradeData[0];
		int minIndex = 0;
		for (int j = 1; j < gradeData.length; j++) {
			if (gradeData[j] > max) {
				max = gradeData[j];
				maxIndex = j;
			}
			if (gradeData[j] < min) {
				min = gradeData[j];
				minIndex = j;
			}
		}

		System.out.println();
		System.out.println(max);
		System.out.println(maxIndex);
		System.out.println(min);
		System.out.println(minIndex);

		// 把非最大值和最小值的數相加，然後算平均
		int sum = 0;
		for (int i = 0; i < gradeData.length; i++) {
			if (i != maxIndex && i != minIndex) {
				System.out.println(i);
				sum = sum + gradeData[i];
			}
		}
		System.out.println(sum);
		double averrage = sum / (gradeData.length - 2);
		System.out.println("有效分數:" + averrage);

	}

	// 下面是用arrays.sort的用法
	public double arrayGrade2(int[] gradeData) {

		Arrays.sort(gradeData);
		System.out.println("排列之後:" + Arrays.toString(gradeData));
		int sum = 0;
		for (int i = 1; i < gradeData.length - 1; i++) {
			sum = sum + gradeData[i];
		}
		System.out.printf("最大值:%d\n最小值:%d\n得分:%d", gradeData[0], gradeData[gradeData.length - 1],
				sum / (gradeData.length - 2));
		return sum / (gradeData.length - 2);
	}

	// list 陣列

	@Test
	public void listTest() {
		// 宣告
		List<String>list1 = Arrays.asList("1","2");      // 無法增刪
		List<Integer>list2 = List.of(99,100);            // 無法增刪
		List<Character>list3 = new ArrayList<>();        // 可以任意修改
		List<String>list7 = new ArrayList<String>();     // 後面的角括號依樣可以填入資料型態，但因為很麻煩，通常不會寫
		List<String>list8 = new ArrayList<>(list1);
		
		// 使用ArrayList才能夠修改list的內容
		list8.add("3");
		System.out.println(list8.get(0));
		list8.remove("1");
		System.out.println(list8.get(0));
		
		// 為什麼是 new ArrayList ?
//		List<Character>list5 = new List<>();             
		// 因為 list 是 interface 的資料格式，故其沒有任何實作(實際的操作步驟)，無法被創造
		// 如果試圖 new List 會導致錯誤
//		list3 = new LinkedList<Character>();
		// Q 為什麼不使用arrayList來裝 new ArrayList 的結果?
		ArrayList<Character>list4 = new ArrayList<>();  
//		list4 = new LinkedList<Character>();
		// A (1) 因為ArrayList 是實作 List 裡面定義好的方法，故 ArrayList 可以被視為是 List 的一種
		//       故 List 不會對 ArrayList 有排斥反應，可以裝進 ArrayList
		//       ==> 只要是實作 interface 的類別(class)，都可以用 interface 作為其容器(變數的資料型態)
		//   (2) 因為 interface 可以被多個類別實作，對於 interface 來說，不同實作都是他的一種
		//       而對不同實作(class)來說，彼此互不互通，故沒有辦法裝進彼此裡面
		//       因此採用interface 作為容器的資料型態，可以盛裝各式各樣的實作類別
//		System.out.println(list1.get(1));
//		System.out.println(list2.get(0));
		// list 例子
		List<Double>weatherList1 = new ArrayList<>();
		weatherList1.add(30.0);
		weatherList1.add(32.5);
		weatherList1.add(34.0);
		weatherList1.add(34.5);
		weatherList1.add(32.4);
		weatherList1.add(34.7);
		weatherList1.add(34.9);
		
		List<Double> tempList = Arrays.asList(30.0, 32.5, 34.0, 34.5, 32.4, 34.7, 34.9);
		List<Double> weatherList2 = new ArrayList<>(tempList);
		List<Double> weatherList3 = new ArrayList<>(List.of(30.0, 32.5, 34.0, 34.5, 32.4, 34.7, 34.9));
		
		for(int i = 0 ; i < weatherList2.size() ; i++) {
			System.out.print(weatherList3.get(i)+" ");
		}
		int a = weatherList3.indexOf(30.0);
		System.out.println(a);
		
		// 移除的括號裡可以直接放indexOf出來的值，不一定要先放進變數裡面
		weatherList3.remove(weatherList3.indexOf(30.0)); 
		
		// 搜尋list裡面有沒有某值
		weatherList3.contains(10);
		
		// 呼叫下面的遍歷方法
		this.avgWeatherByList(weatherList1);
	}
	public double avgWeatherByList(List<Double>weatherList) {
		double sum = 0;
		
		// 遍歷
		// item 是可以自定義的變數名稱，用來代替冒號後面的list裡的每一筆資料，可增加程式的可讀性
		for(Double item:weatherList) {   // item = weatherList.get(i)
//			System.out.println(item);
			if(weatherList.indexOf(item)==0) {
				// 遍歷在程式執行前，就會設定好索引值的範圍
				// 因此在運作的過程中，不能夠去修改list的長度，會導致索引值錯誤
				weatherList.remove(0);
				weatherList.add(0.0);
			}
		}
		
		
		// lambda 寫法
		weatherList.forEach(item -> {
//			sum+=item;    // lambda寫法的限制是不能有遍數在裡面，所以無法用來計算所有資料的總和(因為沒有容器去儲存結果)
//			if(weatherList.indexOf(item)==0) {
//			// 遍歷在程式執行前，就會設定好索引值的範圍
//			// 因此在運作的過程中，不能夠去修改list的長度，會導致索引值錯誤
//			weatherList.remove(0);
//			weatherList.add(0.0);
			System.out.println(item);
		});
		return sum;
	}
	
	@Test
	public void arrayListTest() {
		this.arrayListPractice();
	}
	
	public String arrayListPractice() {
		
		// 宣告一個list
		List <Integer> fourWords = new ArrayList<>();
		
		// 開始生成數字，如果生成的數字跟原本已存在的數字重複，就繼續生成，直到list長度等於4
		while(fourWords.size() < 4) {
			
			// 生成一個數
			int a = (int)(Math.random() * 10);
//			fourWords.add(a);   // 如果生成放在這邊，他就會在比較之前就先生成一個數
			
			// 新生成的數字，沒有存在list裡面，就加進去
			if(!fourWords.contains(a)) {
				fourWords.add(a);
			}
		}
		String a = "";        // 先聲明，再在for迴圈裡面賦值，這樣才能在for迴圈外使用
		for(Integer words:fourWords) {
			a = words + "";   // 一個數字加上字串(裡面不用放東西)後，就會變成字串，所以可以用這個方法把整數轉字串
			System.out.print(a);     	
		}
		return a;
	}	
}
