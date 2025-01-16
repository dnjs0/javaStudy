package com.test.java.collection;

public class Ex63_Anonymous {
	public static void main(String[] args) {
		
		/**
		 * 익명 클래스,Anonymous Class
		 * 	- 익명 객체, Anonymous Object
		 * 	- 이름이 없는 클래스
		 * 
		 * 프로젝트
		 * 	- 수많은 클래스 ~,~
		 * 	- 한번 써먹고 다신 안쓸 클래스를 익명클래스로 만든다.
		 * 
		 * - 실명클래스 vs 익명 클래스
		 * 	- 실명 클래스 : 객체를 여러개 만들 수 있다.
		 * 					클래스를 계속 관리 해야한다.
		 * 	- 익명 클래스 : 객체를 딱 1개만 만들 수 있다.
		 * 					클래스 관리가 필요하지 않다.
		 * 
		 * 
		 */
		
		//요구사항 ] 인터페이스를 구현한 클래스를 선언하기 > 객체 생성
		
		//1. 본인 타입의 참조변수
		BBB b1 = new BBB();
		b1.test();
		
		//2. 부모타입의 참조변수
		AAA b2 = new BBB();
		b2.test();
		
		//3. 익명 객체(+익명 클래스)
		//The type new AAA(){} must implement the inherited abstract method AAA.test()
		//	-> 상속받은 추상 메서드 구현해야한다
		AAA b3 =  new AAA() {

			@Override
			public void test() {
				System.out.println("익명 객체 메서드를 구현했습니다.");
				
			}
			
		};
		b3.test();
		
		AAA b4 = new AAA() {

			@Override
			public void test() {
				System.out.println("익명메서드를 구현했ㅅ븐디ㅏ.");
			}
			
		};
		
		
	}//main

}//class


interface AAA{
	void test();
}

class BBB implements AAA{
	@Override
	public void test() {
		System.out.println("추상 메서드를 구현했습니다.");
	}
}