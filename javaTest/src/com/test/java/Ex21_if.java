package com.test.java;

import java.util.Scanner;

public class Ex21_if {
	
	
	public static void main(String[] args) {
		
		//m1();
//		String result = getNum(100000000);
//		System.out.println(result);
//		
		
//		m3();
		
//		m4();
		
//		m5();
		
//		m6();
		
//		m7();
		
		m8();
				
		
		
		
	}//main

	public static void m8() {

Scanner scan = new Scanner(System.in);
		
		System.out.print("기상시각(시) : ");
		int hour = scan.nextInt();
		
		if(hour<6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if(hour<7) {
			System.out.println("버스를 타고 출근한다.");
		} else if(hour<8) {
			System.out.println("택시를 타고 출근한다.");
		}else {
			System.out.println("병가를 낸다.");
		}
		
	}
	private static void m7() {

		Scanner scan = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = scan.nextInt();
		
		if(score >= 0 &&  score <=100) {
			if(score >=60) {
				System.out.println("합격입니다.");
			}else if(score<60 ){
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("1~100사이의 정수를 입력해주세요!");
		}
		
	}

	private static void m6() {

		
		int sum =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 어떤 개발틀을 선호 합니까 ? " );
		System.out.println("a. 메모장");
		System.out.println("b. 이클립스");
		System.out.println("c. 인텔리제이");
		
		System.out.print("선택 : ");
		
		String sel = scan.nextLine();
		
		if(sel.equals('a')) {
			sum = sum+1;
		}else if(sel.equals('b')) {
			sum = sum+5;
		}else if(sel.equals('c')) {
			sum = sum+10;
		}
		
		
		System.out.println("2. 어떤 프로그래밍 언어를 선호 합니까 ?" );
		System.out.println("a. Java");
		System.out.println("b. C#");
		System.out.println("c. Python");
		
		System.out.print("선택 : ");
		
		sel = scan.nextLine();
		
		if(sel.equals('a')) {
			sum = sum+1;
		}else if(sel.equals('b')) {
			sum = sum+5;
		}else if(sel.equals('c')) {
			sum = sum+10;
		}
		
		System.out.println("3. 하루에 몇시간 코딩합니까 ?" );
		System.out.println("a. 1시간");
		System.out.println("b. 3시간");
		System.out.println("c. 5시간");
		
		System.out.print("선택 : ");
		
		sel = scan.nextLine();
		
		if(sel.equals('a')) {
			sum = sum+1;
		}else if(sel.equals('b')) {
			sum = sum+5;
		}else if(sel.equals('c')) {
			sum = sum+10;
		}
		
		System.out.println("설문이 완료되었습니다.");
		
		System.out.println();
		System.out.print("[결과]");
		
		if(sum>20) {
			System.out.println("당신은 개발자의 자질이 높습니다.");
		}else if(sum>10) {
			System.out.println("개발자가 되려면 조금더 노력하세요");
		}else {
			System.out.println("치킨집을 하세요");
		}
	}

	public static void m5() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("기상시각(시) : ");
		int hour = scan.nextInt();
		
		if(hour<6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if(hour<7) {
			System.out.println("버스를 타고 출근한다.");
		} else if(hour<8) {
			System.out.println("택시를 타고 출근한다.");
		}else {
			System.out.println("병가를 낸다.");
		}
		
	}

	public static void m4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		String result = age >= 18?"성인" : "미성년자";
		System.out.println(result);
		
		if (age>=18) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자 입니다!!");
		}
		
		
	}

	public static void m3() {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		
		int num = scan.nextInt();
		
		if(num>0) {
			//참블럭
			System.out.printf("입력한 %d는 양수 입니다.\n",num);
		}else if(num<0) {
			System.out.printf("입력한 %d는 음수 입니다.\n",num);
		}else {
			System.out.printf("입력한 정수 %d는 0 입니다.\n",num);
		}
		System.out.println("프로그램 종료");
		
	}

	public static String getNum(int num) {
//		천단위 표시 > 문자열 반환
		return String.format("%,d", num);
		
		
	}

	public static void m1() {
		Scanner scan = new Scanner(System.in);
		
		//reader.readLine() 동일
		String input = scan.nextLine();
		
		
		//		Wrapper Class 안써도 됨!
		//int age = Integer.parseInt(input); 
	
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.println(age>=2 ? "성인":"미성년자");
		
	}

}
