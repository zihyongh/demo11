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

		// �n���@�Ӱ}�C
		int[] numberArr = new int[4];

		while (true) {
			// �}�C�����O�H���X�@�Ӽ�
			numberArr[0] = (int) (Math.random() * 10);
			numberArr[1] = (int) (Math.random() * 10);
			numberArr[2] = (int) (Math.random() * 10);
			numberArr[3] = (int) (Math.random() * 10);
			// ���ۦP���ơA�N���L
			if (numberArr[0] == numberArr[1] || numberArr[0] == numberArr[2] || numberArr[0] == numberArr[3]
					|| numberArr[1] == numberArr[2] || numberArr[1] == numberArr[3] || numberArr[2] == numberArr[3]) {
				continue;
			}
			// �S���ۦP���ơA�N�L�X�A�M�ᵲ���j��
			else {
				for (int i = 0; i < numberArr.length; i++) {
					System.out.print(numberArr[i]);
				}
				break;
			}
		}

		// �פJ���a��J
		Scanner sc = new Scanner(System.in);

		// �s���a��J�|���
		while (true) {
//			System.out.println();
			System.out.println("�п�J�|�ӼƦr");
			int ans = sc.nextInt();    // �����nextInt�A�]���}�Y�O�s���ܷ|����

			int a = 0;
			int b = 0;
			int[] ansArr = new int[4];
			ansArr[0] = ans / 1000;
			ansArr[1] = ans % 1000 / 100;
			ansArr[2] = ans % 1000 % 100 / 10;
			ansArr[3] = ans % 1000 % 100 % 10;

//			if(ansArr.length < 4) {
//				System.out.println("�n��J�|�ӼƦr!");
//			}
//			else if(ans > 9999) {
//				System.out.println("�n��J���T�d��!!");
//			}

			if (ansArr[0] == ansArr[1] || ansArr[0] == ansArr[2] || ansArr[0] == ansArr[3] || ansArr[1] == ansArr[2]
					|| ansArr[1] == ansArr[3] || ansArr[2] == ansArr[3]) {
				System.out.println("�Ʀr���i�H����!");
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
			} // else����

		}
	}

	// array �}�C
	@Test
	public void arrayTest() {
		// �ŧi�}�C
		int[] arr1 = new int[7]; // ��«ŧi
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7]; // ��«ŧi
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };

		// ��ŧi���}�C���e�ȳ��|�O null �άO �w�]��(�p�G�ŧi�ɨS�����)
		System.out.println(arr1[0]); // �p�G�ϥΰ򥻸�ƫ��A�ŧi�A�|�۰����A�˶i�w�]��
		System.out.println(arr1Class[0]); // �p�G�ϥ����O�ŧi�A���|���w�]�ȡA�|�O�Ū�
		System.out.println(arr3[7]); // �W�L�}�C���j�p�A�ҥH�|�O�Ū�

		// �m��
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

	public double avgWeather(double[] weatherData) { // weatherData�O�ŰѼơA���I��x���N��
		System.out.println(weatherData.toString()); // �u�n���O�򥻸�ƫ��A�̭��s���|�O�O�����m�A�G�������ܼ��ର�r��A�|�L�X�O�����m)
		System.out.println(Arrays.toString(weatherData)); // �ݭn�ϥ�array���Ѫ���k�~�|�L�X���T�����e��

		double sum = 0;
		for (int i = 0; i < weatherData.length; i++) {
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length;
		return avg;
	}

	// array �m��

	@Test
	public void arrayPractice() {
		int[] gradeArr = { 50, 60, 40, 80, 90 };
		this.arrayGrade(gradeArr);
	}

	public void arrayGrade(int[] gradeData) {
		System.out.print("�ұo���f����:");

//		for(int i = 0 ; i < gradeArr.length ; i++) {
//			System.out.print(" "+gradeArr[i]);
//		}

		System.out.println(Arrays.toString(gradeData));

		// ��X�}�C�����̤j�M�̤p��
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

		// ��D�̤j�ȩM�̤p�Ȫ��Ƭۥ[�A�M��⥭��
		int sum = 0;
		for (int i = 0; i < gradeData.length; i++) {
			if (i != maxIndex && i != minIndex) {
				System.out.println(i);
				sum = sum + gradeData[i];
			}
		}
		System.out.println(sum);
		double averrage = sum / (gradeData.length - 2);
		System.out.println("���Ĥ���:" + averrage);

	}

	// �U���O��arrays.sort���Ϊk
	public double arrayGrade2(int[] gradeData) {

		Arrays.sort(gradeData);
		System.out.println("�ƦC����:" + Arrays.toString(gradeData));
		int sum = 0;
		for (int i = 1; i < gradeData.length - 1; i++) {
			sum = sum + gradeData[i];
		}
		System.out.printf("�̤j��:%d\n�̤p��:%d\n�o��:%d", gradeData[0], gradeData[gradeData.length - 1],
				sum / (gradeData.length - 2));
		return sum / (gradeData.length - 2);
	}

	// list �}�C

	@Test
	public void listTest() {
		// �ŧi
		List<String>list1 = Arrays.asList("1","2");      // �L�k�W�R
		List<Integer>list2 = List.of(99,100);            // �L�k�W�R
		List<Character>list3 = new ArrayList<>();        // �i�H���N�ק�
		List<String>list7 = new ArrayList<String>();     // �᭱�����A���̼˥i�H��J��ƫ��A�A���]���ܳ·СA�q�`���|�g
		List<String>list8 = new ArrayList<>(list1);
		
		// �ϥ�ArrayList�~����ק�list�����e
		list8.add("3");
		System.out.println(list8.get(0));
		list8.remove("1");
		System.out.println(list8.get(0));
		
		// ������O new ArrayList ?
//		List<Character>list5 = new List<>();             
		// �]�� list �O interface ����Ʈ榡�A�G��S�������@(��ڪ��ާ@�B�J)�A�L�k�Q�гy
		// �p�G�չ� new List �|�ɭP���~
//		list3 = new LinkedList<Character>();
		// Q �����򤣨ϥ�arrayList�Ӹ� new ArrayList �����G?
		ArrayList<Character>list4 = new ArrayList<>();  
//		list4 = new LinkedList<Character>();
		// A (1) �]��ArrayList �O��@ List �̭��w�q�n����k�A�G ArrayList �i�H�Q�����O List ���@��
		//       �G List ���|�� ArrayList ���ƥ������A�i�H�˶i ArrayList
		//       ==> �u�n�O��@ interface �����O(class)�A���i�H�� interface �@����e��(�ܼƪ���ƫ��A)
		//   (2) �]�� interface �i�H�Q�h�����O��@�A��� interface �ӻ��A���P��@���O�L���@��
		//       �ӹ藍�P��@(class)�ӻ��A�����������q�A�G�S����k�˶i�����̭�
		//       �]���ĥ�interface �@���e������ƫ��A�A�i�H���˦U���U�˪���@���O
//		System.out.println(list1.get(1));
//		System.out.println(list2.get(0));
		// list �Ҥl
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
		
		// �������A���̥i�H������indexOf�X�Ӫ��ȡA���@�w�n����i�ܼƸ̭�
		weatherList3.remove(weatherList3.indexOf(30.0)); 
		
		// �j�Mlist�̭����S���Y��
		weatherList3.contains(10);
		
		// �I�s�U�����M����k
		this.avgWeatherByList(weatherList1);
	}
	public double avgWeatherByList(List<Double>weatherList) {
		double sum = 0;
		
		// �M��
		// item �O�i�H�۩w�q���ܼƦW�١A�ΨӥN���_���᭱��list�̪��C�@����ơA�i�W�[�{�����iŪ��
		for(Double item:weatherList) {   // item = weatherList.get(i)
//			System.out.println(item);
			if(weatherList.indexOf(item)==0) {
				// �M���b�{������e�A�N�|�]�w�n���ޭȪ��d��
				// �]���b�B�@���L�{���A������h�ק�list�����סA�|�ɭP���ޭȿ��~
				weatherList.remove(0);
				weatherList.add(0.0);
			}
		}
		
		
		// lambda �g�k
		weatherList.forEach(item -> {
//			sum+=item;    // lambda�g�k������O���঳�M�Ʀb�̭��A�ҥH�L�k�Ψӭp��Ҧ���ƪ��`�M(�]���S���e���h�x�s���G)
//			if(weatherList.indexOf(item)==0) {
//			// �M���b�{������e�A�N�|�]�w�n���ޭȪ��d��
//			// �]���b�B�@���L�{���A������h�ק�list�����סA�|�ɭP���ޭȿ��~
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
		
		// �ŧi�@��list
		List <Integer> fourWords = new ArrayList<>();
		
		// �}�l�ͦ��Ʀr�A�p�G�ͦ����Ʀr��쥻�w�s�b���Ʀr���ơA�N�~��ͦ��A����list���׵���4
		while(fourWords.size() < 4) {
			
			// �ͦ��@�Ӽ�
			int a = (int)(Math.random() * 10);
//			fourWords.add(a);   // �p�G�ͦ���b�o��A�L�N�|�b������e�N���ͦ��@�Ӽ�
			
			// �s�ͦ����Ʀr�A�S���s�blist�̭��A�N�[�i�h
			if(!fourWords.contains(a)) {
				fourWords.add(a);
			}
		}
		String a = "";        // ���n���A�A�bfor�j��̭���ȡA�o�ˤ~��bfor�j��~�ϥ�
		for(Integer words:fourWords) {
			a = words + "";   // �@�ӼƦr�[�W�r��(�̭����Ω�F��)��A�N�|�ܦ��r��A�ҥH�i�H�γo�Ӥ�k������r��
			System.out.print(a);     	
		}
		return a;
	}	
}
