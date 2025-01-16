package com.test.java;

import java.io.IOException;

public class Ex06_Input {
	public static void main(String[] args) throws IOException {
		//사용자에게 문자 한개를 입력받아 출력하기
		
		
		int code= System.in.read(); // 사용자로 부터 키보드 입력을 받아라.
		System.out.println("문자 입력 : "+code);
		System.out.printf("입력 문자 : %c\n",code);
		System.out.println("프로그램 종료");
		
		
	}//main

}//Class
