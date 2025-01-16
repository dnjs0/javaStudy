package com.test.java;

import com.test.java.aaa.Red;
import com.test.java.aaa.Yellow;

public class Ex45_package {
	public static void main(String[] args) {
		
		/*
		 * 패키지, Package
		 * -클래스를 저장하기 위한 폴거
		 * -많은 클래스들을 체계적으로 관리하기 위한 용도
		 * - 경로 > c:\aaa\bbb\bbb
		 *  - 패키지 > aaa.bbb.ccc
		 *  - . : 멤버 접근 연산자 (부모.자식)
		 * 
		 * 
		 * "com.test.java.aaa" 	> "Red.java
		 * 						> "Yello.java"
		 * "com.test.java.bbb" 	> "Yello.java"
		 * "com.test.java.bbb.ccc" 	> "Blue.java"
		 * 
		 * 패키지 + 접근지정
		 * 1. private > 100 % 비공개
		 * 2. public > 100 % 공개
		 * ------------------------
		 * 3. (default) > 패키지 접근 지정자
		 * 		- 같은 패키지내에서는 100% 공개
		 * 		- 다른 패키지에서는 100% 비공개
		 * 4. protected
		 * 		- 같은 패키지내에서는 100% 공개
		 * 		- 다른 패키지에서는 100% 비공개
		 * 		- 다른 패키지에 있어도 자식 클래스이면 100% 공개
		 * 
		 * 
		 */
		
		//현재패키지 :  com.test.java
		//대상 클래스 :  com.test.java.aaa.Red
		
		//패키지 역할
		// - 같은 성격의 클래스 집합
		// - 논리적 역할 & 물리적 역할
		
		//다른 패키지의 클래스를 인식하는 방법 
		//1. 풀네임 사용
		//2. import 사용
		
//		com.test.java.aaa.Red r1 = new com.test.java.aaa.Red();

		Red r2 = new Red(); //import com.test.java.aaa.Red;
		
		Yellow y1 = new Yellow(); //aaa
	
		com.test.java.bbb.Yellow y2 = new com.test.java.bbb.Yellow(); //bbb Yellow를 쓸 경우
		//import를 한번더 할 수 없음
		
		
		
		
		
		
	}//main

}
