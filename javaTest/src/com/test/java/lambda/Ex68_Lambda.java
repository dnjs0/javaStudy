package com.test.java.lambda;

public class Ex68_Lambda {
	public static void main(String[] args) {	
		
		/*
		 * 람다식, Lambda Expression
		 *  - 함수형 프로그래밍 방식을 지원하는 표현식
		 *  - 익명 객체를 다른 방식으로 구현하는 표현식(자바의 특성)
		 *  - 코드가 간결해진다.(목적 -> 호불호)
		 *  - 컬렉션과 배열을 조작하는 기능에서 많이 활용한다.
		 *  - 람다식은 익명 객체를 간편하게 구현하는 표현식(*****)
		 *  - 람다식은 추상 메서드의 구현된 모습이다.(***)
		 *  - 자바의 람다식은 인터페이스를 반드시 사용한다.(자바의 특성)
		 *  
		 *  
		 * 람다식 형식
		 * 	- 인터페이스 변수 = 람다식;
		 *  	ex) MyInterface m1 = () -> {};
		 *  
		 *  (매개변수) -> {구현부}
		 *  - 람다식은 메서드를 표현한 표현식이다.
		 *  a. (매개변수) : 추상 메서드의 인자 리스트
		 *  b. -> : 화살표(Arrow), 구현부를 호출하는 역할(행동X)
		 *  c. {구현부} : 추상 메서드의 구현 
		 *   
		 *  
		 */
		
//		m1();
		m2();
		
	}//main	

	private static void m2() {
		
		// 람다식 == 추상 메서드
		//  - 매개변수 유/무
		//	- 반환값 유/무
		
		
		//1.
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
				
			}
		};
		pr1.call();
		
		//2.
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//3. ***람다식 구현부 > 문장이 1개일때는 {}생략 가능
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		
		//1.
		ParameterNoReturn pr4 = new ParameterNoReturn() {
			
			@Override
			public void call(int n) {
				System.out.println("pr4 : "+n);
			}
		};
		pr4.call(100);
		
		//2.
		ParameterNoReturn pr5 = (int n) -> {
			System.out.println("pr5 : " + n);
		};
		pr5.call(200);
		
		//3.
		ParameterNoReturn pr6 = (int n) -> System.out.println("pr6 : " + n);
		pr6.call(300);
		
		//***람다식의 매개변수 자료혀은 생략이 가능하다.
		ParameterNoReturn pr7 = (n) -> System.out.println("pr7 : " + n);
		pr7.call(400);
		
		//***람다식의 매개변수 ()를 생략이 가능하다.
		ParameterNoReturn pr8 = n -> System.out.println("pr8 : "+ n);
		pr8.call(500);
		
		//
		MultiParameterNoReturn pr9 = (String name, int age) -> {
			System.out.println("pr9 : " + name + "," +age);
		};
		pr9.call("홍길동", 20);
		
		//
		MultiParameterNoReturn pr10 = (name,age) ->{
			System.out.println("pr10 : "+name+","+age);
		};
		pr10.call("홍길동", 20);
		
		//***매개변수의 ()생략은 매개변수 1개일때만 가능
//		MultiParameterNoReturn pr11 = name, age ->{ 		//에러!!
//			System.out.println(pr11);
//		};
		
		//
		NoParameterReturn pr12 = () ->{
			return 100;
		};
		System.out.println("pr12 : " + pr12.call());
		
		//return 도 생략!
		//*** 람다식 구현부에 return 문이 유일하면 {}와 return 을 생략 가능
		NoParameterReturn pr13  = () -> 200;
		System.out.println("pr13 : "+ pr13.call());
		
		//
		ParameterReturn pr14 = (int a, int b) -> {
			return a+b;
		};
		System.out.println("pr14 : "+ pr14.call(10, 20));
		
		//
		ParameterReturn pr15 = (a,b) -> a+b;
		System.out.println("pr15 : " + pr15.call(10, 20));
		
		
	}

	public static void m1() {
		//요구사항] MyInterface를 구현한 객체를 생성하시오.
		// Case 1. 실명 클래스를 선언하고 객체를 생성하기 > FM
		 MyInterface m1 = new MyClass();
		 m1.test();
		 
		 //Case 2. 익명 객체 생성
		 MyInterface m2 = new MyInterface() {

			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 추상 메서드");
			}
			 
		 };
		m2.test();
		
		
		//Case 3. 람다식
		MyInterface m3 = () -> {
			System.out.println("람다식으로 구현한 추상 메서드");
		};
		m3.test();
		
		
		//interface 에 메서드가 두개일때
		TestInterface t1 = new TestInterface() {
			@Override
			public void aaa() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				
			}
		};
		t1.aaa();
		t1.bbb();
		
		//interface 에 메서드가 두개일때 람다식 -> 에러남
		//The target type of this expression must be a functional interface
		// - target type : 람다식을 저장하는 인터페이스
		// - functional interface : 추상 메서드를 딱 1개 가진 인터페이스
//		TestInterface t2 = () -> {
//		};
	}
}//class

@FunctionalInterface //하나의 메서드를 가지는 interface 임을 명시, 메서드 두개 만들면 에러남
interface MyInterface {
	void test();
}

class MyClass implements MyInterface{
	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 추상 메서드");
	}
}

interface TestInterface {
	void aaa();
	void bbb();
}

interface NoParameterNoReturn{
	void call();
}

interface ParameterNoReturn{
	void call(int n);
}

interface MultiParameterNoReturn{
	void call(String name, int age);
}

interface NoParameterReturn{
	int call();
}

interface ParameterReturn{
	int call(int a, int b);
}
