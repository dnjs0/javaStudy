package com.test.java.obj.inheritance.cast;

public class Ex46_Cast {
	public static void main(String[] args) {
		
		/*
		 * 형변환, Type Casting
		 * 1. 기본형 형변환
		 * 	- 기본형 끼리의 형변환 (boolean 제외)
		 *  - byte, short, int, long, float, double, char
		 *  - 문제발생 > 오버플로우
		 *  
		 * 2. 참조형 형변환
		 * 	- Class끼리의 형변환
		 * 	
		 * 참조형 형변환
		 * 	- 상속 관계에 있는 클래스끼리만 가능하다.
		 * 	- 직계만 가능
		 * 	- 방계는 불가능(형제랑 불가능)
		 * 
		 * 	1.업캐스팅, Up Casting
		 * 		- 암시적인 형변환
		 * 	2.다운캐스팅 Down Casting
		 * 		- 명시적인 형변환
		 * 
		 */
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); //자식객체 >원본
		
		//복사
		//Parent = Child
		//암시적인 형 ㅂ변환
		//부모클래스 = 자식클래스
		//업캐스팅
		//100%안전
		//참조 병수끼리의 복사이르모 주소값이 복사된다.
		p1 = c1;
		p1 = (Parent)c1;
		
		//기본형 형변환 성공 검증? > 값을 출력
		//참조형 형변환 성공 검증? > 다른 방식 (복사본 사용)

		//복사본 사용!!
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println();
		
		Parent p2;
		Child c2;
		
		p2 = new Parent(); //부모클래스 >원본
		
		//복사 발생
		//Child = Parent
		//명시적인 형변환
		//다운캐스팅
		//c2 = (Child)p2; //100%불가능,에러남
		
		//검증?
//		c2.a=10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d=40;
		
		Parent p3;
		Child c3;
		
		c3 = new Child(); //원본
		p3 = c3;//복사
		
		Child c4;
		
		//자식 클래스 = 부모 클래스
		c4 = (Child)p3;
		
		c4.a =10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);

		
		//기본형 형변환 하는 이유?>유연한 코드
		//참조형 형변환 하는 이유?>유연한 코드
		
		
	}//main

}//class

class Parent {
	public int a;
	public int b;
	
}

class Child extends Parent{
	public int c;
	public int d;
	
}















