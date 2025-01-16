package com.test.java;

public class Ex04_Escape {
	public static void main(String[] args) {
		//특수문자 > Escape Sequence
		//컴파일러가 번역할 때, 특정문자를 그대로 출력하지 않고 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		//1. \n
		System.out.println("안녕하세요.\n홍길동입니다.");
		System.out.println();
		System.out.println("안녕하세요.\t홍길동"); 
		System.out.println("홍길동\b입니다.");
		System.out.println("홍길동: \"안녕하세요\"");
		System.out.println("상대방 : \'그래그래\'");
		System.out.println("수업폴더의 경로는 C:\\class\\code\\java 입니다.");
	}

}
