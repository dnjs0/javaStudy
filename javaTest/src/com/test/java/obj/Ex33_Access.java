package com.test.java.obj;

public class Ex33_Access {
	public static void main(String[] args) {
		
		/*
		 *000 지전자(제어자)
		 *-클래스 or클래스 멤버에 붙일수 있다.
		 *부가적인 기능을 제공하는 키워드(옵션)
		 *
		 *
		 * 접근 지정자(제어자), Access Modifier
		 *	클래스 or 클래스 멤버에 적용한다. 
		 * 
		 * 1. public
		 * 		- 100% 공개
		 * 2. private
		 * 		- 100% 비공개
		 * -------------------------
		 * 3. protected
		 * 4. (default) : 아무것도 안쓰면 나타남
		 * 
		 * 
		 */
//		
//		Book b1 = new Book();
//		b1.a = 10;
////		b1.b = 20; > 컴파일 오류 b1.b를 찾을 수 없음
//		b1.test();
		
		Book b1 = new Book();
		b1.title="이것이 자바다";
//		b1.price = 38000;
		b1.aaa(38000);
		
		System.out.println(b1.title);
//		System.out.println(b1.bbb());
		
		Book b2 = new Book();
		b2.title = "자바의 정석";
//		b2.price = 2000000000;

		System.out.println(b2.title);
//		System.out.println(b2.price);
		
		
		//멤버 변수 > 속성(Property), 상태(State)
		
		//멤버 변수 조작
		//setter, getter > 속성(Property)라고 부름
		
		Book b3 = new Book();
		b3.title = "자바책";
		b3.setPrice(10000);
		System.out.println(b3.gerPrice());
		
		
	}//main
}//class
