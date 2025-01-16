package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.*;

public class Ex07_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		
//		//사용자로부터 문자 하나 입력받아 출력하기
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //reader > 입력기 >(도구)
//		 
//		 int code =  reader.read();//System.in.read()		
//		 
//		 System.out.println(code);
//		 System.out.printf("%c\n",code);
		 
		
//		
//		//이름 입력
////		int code =reader.read(); //문자 코드값은 0부터 시작
//		System.out.print("이름 입력 : ");
//		String name = reader.readLine(); //한 줄을 입력받음
//	
//		System.out.print("나이 입력 : ");
//		String age = reader.readLine(); //한 줄을 입력받음
//		
//		System.out.printf("%s님의 나이는 %s입니다.",name, age);
		
		
		//숫자 두개를 입력받아 더하시오
		System.out.print("첫번째 숫자를 입력하시오. : ");
		String num1 = reader.readLine();
		
		System.out.print("두번째 숫자를 입력하시오 : ");
		String num2 = reader.readLine();
		
		
		System.out.println(Double.parseDouble(num1)+Double.parseDouble(num2));
		
		
		 
	}//main
}//Class
