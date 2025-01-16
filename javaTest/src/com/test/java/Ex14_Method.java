package com.test.java;

import java.util.Scanner;

public class Ex14_Method {
	public static void main(String[] args) {
		
		
//		//안녕하세요 5번 출력
//		hello();
//		hello();
//		hello();
//		hello();
//		hello();
//		
//		
//		printnumber();
//		
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		System.out.println(a);
		
		
	}//main
	 
	//public static void printnumber()
	
	public static void printnumber(){
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		System.out.println();
	
	}
	
	
	
	//메서드 선언
	public static void hello() {
		System.out.println("안녕하세요");
	}

}
