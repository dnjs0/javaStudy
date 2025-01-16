package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex26_Array {
	public static void main(String[] args) {

//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();
//		m14();
//		m15();
//		m16();
//		m19();
//		m20();
		m21();
		
		
	}// main

	private static void m21() {
		// 문제풀이를 위한,,, 70번 부터
		int [][] nums =new int[5][5];
		//입력
		int num=1;
		
		for(int i = 0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length;j++) {
				nums[i][j] = num;
				num++;
			}
		}
		
		//출력 : 항상 동일하게 -> 메서드로 빼기
		printArray(nums);
		
		System.out.println();
		
		num=1;
		for(int i = 0; i<nums.length; i+=2) {
			for(int j=0; j<nums[0].length;j++) {
				nums[i][j] = num;
				num++;
			}
			num += 5;
		}
		
		
		//출력 : 항상 동일하게 -> 메서드로 빼기
		printArray(nums);
		
		
	}

	private static void printArray(int[][] nums) {
		for(int i =0; i<nums.length; i++) {
			for(int j =0; j<nums[0].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
	}

	private static void m20() {
		//배열의 길이는 불변이다.
		//1.배열의 길이를 런타임시에 결정할 수 있다.
		//2. 같은 참조 변수를 계속 사용해서 배열의 길이라 변한것 처럼 꾸밀 수 있다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("학생 수 : ");
//		int length = scan.nextInt();
//		
//		int[] kor = new int[length];//컴파일시 길이를 런타임시 결정
//		System.out.println(kor.length);
//		System.out.println(Arrays.toString(kor));
		
		//case2
		int[] kor = new int[5];
		kor = new int[10]; //덮어쓰기해서 늘린다.
		
		
		
	}

	private static void m19() {
		// 배열 초기화 리스트
		int[] nums1 = {10,20,30};
		int[][] nums2 = {
						{10,20,30},
						{40,50,60}
						};
		int[][][] nums3 = {
						{{10,20,30},{40,50,60}},
						{{70,80,90},{100,110,120}}
						};
		
	}

	private static void m16() {
		// 배열의 차원
		//1차ㅝㄴ 배열
		int[] nums1 = new int[3];
		
		nums1[0] =10;
		nums1[1]=20;
		nums1[2] = 30;
		System.out.println(Arrays.toString(nums1));
		
		//2차원 배열
		int[][] nums2 = new int[2][3];
		
		nums2[0][0]=10;
		nums2[0][1]=20;
		nums2[0][2]=30;
		
		nums2[1][0]=40;
		nums2[1][1]=50;
		nums2[1][2]=60;
		
		System.out.println(Arrays.deepToString(nums2));
		
		for(int i =0; i<nums2.length; i++) {
			for(int j=0; j<nums2[0].length; j++) {
				System.out.print(nums2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3];
		
		nums3[0][0][0]=10;
		nums3[0][0][1]=20;
		nums3[0][0][2]=30;
		
		nums3[0][1][0]=40;
		nums3[0][1][1]=50;
		nums3[0][1][2]=60;
		
		nums3[1][0][0]=70;
		nums3[1][0][1]=80;
		nums3[1][0][2]=90;
		
		nums3[1][1][0]=100;
		nums3[1][1][1]=110;
		nums3[1][1][2]=120;
		
		System.out.println(Arrays.deepToString(nums3));
		
	}

	private static void m15() {
		// 배열 조작
		//요소 삽입,삭제
		//배열의 요소 삽입(insection)
		//right shift발생 : 모든 요소가 오른쪽으로 한칸씩 이동
		
		int[] nums = {1,2,3,4,5};
		int index=1; //삽입 될 위치
		int value = 9; //삽입될 값
		
		System.out.println(Arrays.toString(nums));
		
		for(int i =nums.length-2;i>=index;i--) {
			nums[i+1] = nums[i];//shift발생
		}
		nums[index] = value;
		System.out.println(Arrays.toString(nums));
		
		
		int[] nums2 = {1,2,3,4,5};
		int index2= 2; //삽입 될 위치
		int value2 = 5; //삽입될 값
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=index+1; i<nums.length;i++) {
			nums[i-1]=nums[i]; //왼쪽으로shift
		}
		nums[index2] = value2;
		nums[nums.length-1] = 0; //없어지는 배열 초기값으로 채우기
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m14() {
		// 자바에서 제공하는 정렬
		//숫자배열
		int[] nums = {1,3,5,4,2};
		Arrays.sort(nums);//Quick Search구현
		System.out.println(Arrays.toString(nums));
		
		//문자열 배열
		String[] names = {"홍길동" , "아무개","강아지","고양이","병아리"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//Calendar 배열
		Calendar[] clist = new Calendar[5];
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -1);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 3);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -2);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();
		
		Arrays.sort(clist);
		for(int i=0;i<clist.length; i++) {
			System.out.printf("%tF\n",clist[i]);
		}
		
	}

	private static void m13() {
		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();
		
		day2.add(Calendar.DATE, -2);
		
		System.out.printf("day1 : %tF\n",day1);
		System.out.printf("day2 : %tF\n",day2);
		
		System.out.println(day1.getTimeInMillis()>day2.getTimeInMillis()); //true
		System.out.println(day1.compareTo(day2)); //양수 음수 0 등
		
		//문자열 정렬
		String[] names = {"홍길동" , "아무개","강아지","고양이","병아리"};
		
		for(int i= 0 ; i<names.length; i++) {
			for(int j =0; j<names.length-i-1;j++) {
				if(names[j].compareTo(names[j+1])<0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
		
		
		//날짜정렬
		Calendar[] clist = new Calendar[5];
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -1);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 3);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -2);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();

		for(int i = 0; i<clist.length-1; i++) {
			for(int j=0; j<clist.length-i-1; j++) {
				if(clist[j].compareTo(clist[j+1])>0) {// 양수면 j번째가 더 큼
					
					Calendar temp = clist[j];
					clist[j] = clist[j+1];
					clist[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<clist.length; i++) {
			System.out.printf("%tF\n",clist[i]);
		}
		
		
		
	}

	private static void m12() {
		// 데이터 비교?
		//1. 숫자비교
		//2. 문자열 비교
		//3. 날짜 시간 비교
		
		int a =20;
		int b=4;
		
		System.out.println(a>b);
		
		//2.문자열 비교
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(((int)c1 > (int)c2));
		System.out.println(c1>c2);//굳이 형변환 할 필요가 없다
		
		String s1 = "A";
		String s2 = "B";
		
		//System.out.println(s1>s2); -> 컴파일 오류남
		//거의 모든 연산자는 참조형을 피연산자로 갖지 못함
		
		c1= s1.charAt(0); //s1문자열의 첫번째 문자를 char로 반환
		System.out.println(c1); //A 가 출력된다.
		c2 = s2.charAt(0);
		System.out.println(c2); //B 가 출력된다.
		
		s1 = "홍길동";
		s2 = "아무개";
		
		
		
		if(compare(s1,s2)>0) {
			System.out.println(s1+">"+s2);
		}else if (compare(s1,s2)<0) {
			System.out.println(s2+">"+s1);
		}else {
			System.out.println("둘이 동일한 문자열");
		}
		
		System.out.println("홍길동".compareTo("아무개")); //4361 크면 앞에것이 더 큰것
		System.out.println("아무개".compareTo("홍길동")); //-4361
		System.out.println("홍길동".compareTo("홍길동")); //0 같다
		
	}

	public static int compare(String s1 , String s2) {
		
		//문자열의 길이가 다를경우
		int length = s1.length()>s2.length() ? s2.length() : s1.length();
		//두문자열을 비교해서 더 작은길이를 반환함
		
		
		//s1이 크면 1반환, s2이 크면 -1반환, 두리 동일하면 0반환
		//s1 = 홍길동, s2= 아무개
		for(int i = 0; i <length; i++) {
			
			if(s1.charAt(i)>s2.charAt(i)) {
				return 1; //값을 반환+ 메서드를 종료함
			}else if(s1.charAt(i)<s2.charAt(i)) {
				return -1;
			}
		}
		
		
		//문자열의 길이가 다른것 / 문자열이 같은것
		if(s1.length() >s2.length()) {
			return 1;
		}else if(s1.length()<s2.length()) {
			return -1;
		}else {
			return 0;
		}

		
	}
	
	private static void m11() {
		// 정렬
		//-크기 비교후 재배치
		//오름차순
		//내림차순
		
		//정렬구현
		//1.직접 구현
		//2. JDK제공 + 사용
		
		int a = 10;
		int b = 5;
		int temp; //빈컵
		
		temp = a;
		a = b;
		b= temp;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int[] nums = {5,3,1,4,2};
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=0; i<nums.length; i++) {
			for(int j = 0; j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
		
	}

	private static void m10() {
		
		//배열의 자동 초기화
		//배열의 생성 직후 모든 요소(방)가 초기화가 된다.
		//배열뿐만 아니라 모든 참조열의 특징이다.
		
		
		//초기화의 규칙
		//1. 정수배열은 0 으로 초기화
		//2. 실수 배열은 0.0
		//3. 문자열은 \0
		//4, 논리배열은 false
		//5. 참조형배열은 null
		
		//배열 초기화 리스트
		//규칙을 가지는 값으로 초기화
		int[] nums1 = new int[5];
		
		for(int i =0; i<nums1.length;i++) {
			nums1[i] = i;
		}
		System.out.println(Arrays.toString(nums1));
		
//		int[] nums2 = new int[] {5, 3, 4, 1, 2};
		int[] nums2;
		nums2 = new int[] {5, 3, 4, 1, 2};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {5, 3, 4, 1, 2}; //가장 많이 사용
		System.out.println(Arrays.toString(nums3));
		
		String[] names1 = new String[3];
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";
		
		
	}

	private static void m9() {
		// arrays 클래스
		// 유틸리티 클래스 , 배열과 관련된 여러가지 기능을 제공하는 서비스
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		// [I @ 1f32e575
		// 자료형 해시코드 16진수(메모리 주소값)
		System.out.println(nums);

		printArray(nums);
		System.out.println(Arrays.toString(nums));

		int[] copy = Arrays.copyOfRange(nums, 0, nums.length); // 원본, 처음, 끝

		nums[0] = 1000;
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}

	}

	private static void m8() {
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		int[] copy = new int[3];
		for (int i = 1; i < nums.length; i++) {
			copy[i] = nums[i];
		}

	}

	private static void m7() {

		int a = 10; // 원본(기본형)
		changeValue(a);
		System.out.println(a); // 변화없음: sideEffect가 없다.

		int[] nums = new int[3]; // 원본(참조형)
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		changeValue(nums);
		System.out.println(nums[0]);

	}

	private static void changeValue(int[] nums) {

		nums[0] = 1000;
		System.out.println(nums[0]);

	}

	private static void changeValue(int a) {

		a = 20;
		System.out.println(a);

	}

	private static void m6() {
		// 배열 복사

		int a = 10;// 기본형 복사
		int b;

		b = a;

		a = 20; // 원본수정

		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println();

		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		int[] copy;

		// int[] int배열
		copy = nums;

		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		System.out.println();

		nums[0] = 100;// 원본수정
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println();

		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		System.out.println();

	}

	private static void m5() {
		// 기본형과 참조형의 차이
		// 기본형 : 변수에 데이터를 직접 저장
		// 참조형: 데이터 따로 생성 + 변수도 따로 생상 > 둘을 연결

		// 여태 수업 참조형
		// 1.문자열
		// 2. 배열

		int a1 = 10;
		int a2 = 2000000000;

		String s1 = "홍길동";
		String s2 = "동해물과 백두산이 마르고 닳도록";

		int[] num1 = new int[5];
		int[] num2 = new int[20];

		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 + n2);

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.DATE, 25);
//		System.out.println(c1-c2);

	}

	private static void m4() {
		// 각 자료형 > 배열
		// 정수 byte, short , int, long
		long[] list1 = new long[5];
		list1[0] = 10L;
		System.out.println(list1[0]);

		// 실수배열
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);

		// 문자배열 ==String
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);

		// 논리배열(boolean)
		boolean[] list4 = new boolean[5];
		System.out.println(list4[0]);

		// 문자열(참조형) 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		Calendar c3 = Calendar.getInstance();

		Calendar[] clist = new Calendar[3];
		clist[0] = Calendar.getInstance();
		clist[1] = Calendar.getInstance();
		clist[2] = Calendar.getInstance();

		int n1;
		int n2;
		int n3;

	}

	private static void m3() {
		// 배열 생성 직후의 상태
		// 배열은 생성 후 초기화하지 않아도 자동으로 초기화 된다.
		int[] nums = new int[5];

		nums[0] = 10;
		nums[1] = 20;

		System.out.println(nums[0]); // 10
		System.out.println(nums[1]); // 20
		System.out.println(nums[2]); // 0
		System.out.println(nums[3]); // 0
		System.out.println(nums[4]); // 0

		// 배열의 길이 == 배열내의 방 개수
		System.out.println(nums.length);
		System.out.println(nums[nums.length - 1]);

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}

	}

	private static void m2() {
		// 학생 3명 > 국어점수 > 총점, 평균
		// 추가사항 ] 학생수 증가 > 300명

		// 배열 선언하기 : 자료형[] 변수명 = new 자료형[길이];
//						배열타입 배열명 = new 배열타입[배열길이];
		int[] kors = new int[3];
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 20;

		System.out.println(kors.length);

		int sum = 0;
		for (int i = 0; i < kors.length; i++) {
			sum += kors[i];
		}

		double avg = (double) sum / kors.length;
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", sum, avg);

	}

	private static void m1() {
		// 학생 3명 > 국어점수 > 총점, 평균
		// 추가사항 ] 학생수 증가 > 300명

		int kor1 = 100;
		int kor2 = 70;
		int kor3 = 80;

		int total = kor1 + kor2 + kor3;

		double avg = total / 3.0;

		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);

	}

}
