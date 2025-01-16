package com.test.java;

public class Ex16_Method {
	public static void main(String[] args) {
		
		
		int a =10;
		int b = 20;
		
		int c = sum(a,b);
		System.out.println(c);
		
		System.out.println(checkAge(45));
		
	}//main
	
	
	public static int sum(int a, int b) {
		int result = a+b;
		return result;
		
	}
	
	public static String checkAge(int age) {
		String check = age>=20 ? "합격입니다.":"불합격입니다.";
//		System.out.println("이 메소드가 종료됩니다.");
		return check;	
	}
	
	

}
