package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex11_Operator {
	public static void main(String[] args) throws IOException {
		
		
//		//비교연산자
//		int a = 10;
//		int b =5;
//		System.out.printf("%d > %d = %d\n",a,b,a>b);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이 : ");
		String input = reader.readLine();
		
		int age = Integer.parseInt(input);
		
		System.out.println(age >20); //20이상이면 true, 20이하면 false
		System.out.println();

		String s1 = "홍길동";
		String s2 = "아무개";
		
		System.out.println(s1==s2);
		
		
	}//main

}
