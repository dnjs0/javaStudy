package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Method {
	public static void main(String[] args) {
		
		hello("홍길동");
		
		ageFunc(10);
		
		checkScore(12, 53, 45);
		checkScore(67, 49, 98);
		
		
		int a =10;
		int b = 20;
		
		sum(a, b);
		
		substract(a,b);
		
	}//main


	private static void substract(int a, int b) {
		int c = a-b;
		System.out.printf("%d - %d = %d",a,b,c);
		
	}


	public static void sum(int a, int b) {
		int c = a+b;
		System.out.printf("%d + %d = %d",a,b,c);
	}

	
	public static void hello(String name) {
		System.out.println(name + "님 안녕하세요.");
		
	}
	
	public static void hello2() {
		System.out.println("아무개님 안녕하세요.");
	}
	
	public static void helloTest() {
		System.out.println("테스트님 안녕하세요.");
	}
	
	public static void ageFunc(int age) {
		String result = age>=15 ? "통과입니다." : "거절합니다";
		System.out.printf("나이가 %d살이므로 %s", age, result);
		System.out.println();
	}
	
	/**
	 * 성적을 평가합니다.
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 */
	public static void checkScore(int kor, int eng, int math) {
	
		int total = kor + eng + math;
		double avg = total/3.0;
		String result = avg>=60?"합격":"불합격";
		System.out.printf("평균 점수 %.1f점은 %s입니다.", avg, result);
		System.out.println();
		
	}
}//class
