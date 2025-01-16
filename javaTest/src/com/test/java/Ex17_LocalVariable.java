package com.test.java;

public class Ex17_LocalVariable {
	public static void main(String[] args) {
		
		
		int a; // (main을 영역으로 하는) 지역변수
		a=10;
		System.out.println(a);
		
		n1();
		
		int age = 20;
		checkAge(20);
		
		
	}//main

	public static void checkAge(int age) {
		
	}
	
	
	private static void n1() {
		int b; //(n1을 메인으로 하는) 지역변수
		b =30;
		System.out.println(b);
		
	}

}
