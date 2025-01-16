package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	public static void main(String[] args) throws IOException {
		
		
		//사용자로부텀 ㅜㄴ자 1개를 입력> 영어 소문자인지 검사
		
		//제어 흐름 설계
//		1. BufferedReader 생성
//		2. 안내 메시지 출력
//		3. 입력 > 문자 1개 얻기
//		4. 유효성 검사
//			문자 > 문자 코드
//			소문자 범위에 속하는지?
//			결과 도출
//		5. 결과 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("영어문자 1개를 입력하세요 : ");
		 int code = reader.read();
		 String result = (code >= 97 && code<=122) ? "소문자 입니다." : "소문자가 아닙니다.";
		 System.out.printf("입력하신 문자 %c는 %s",code,result);
		
		
		
	}//main

}
