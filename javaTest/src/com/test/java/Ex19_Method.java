package com.test.java;

public class Ex19_Method {
	public static void main(String[] args) {
		
		//factorial(5);
		System.out.println(factorial(5));
		
		
		
	}//main

	public static int factorial(int num) { //재귀메서드
		
		return (num==1) ? 1 : num*factorial(num-1);
		
	}
}
