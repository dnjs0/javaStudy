package com.test.java.obj;

public class Ex32_Class {
	public static void main(String[] args) {
		
		Person2 p1 = new Person2();
		p1.name = "홍길동";
		p1.age = 30;
		p1.hello();
		
		Person2 p2 = new Person2();
		p2.name = "아무개";
		p2.age = 20;
		p2.hello();
	}//main
}//class


//***
class Person2 { 
	
	//멤버 변수>객체의 상태(속성)
	public String name;
	public int age;
	
	//멤버 메서드 > 객체의 행동
//	public void hello() {
//		System.out.println("안녕하세요");
//	}
	
	//멤머메스드를 정의
	//(반드시)자신의 상태(멤버변수)를 활용해서 구현
	public void hello() {
		System.out.printf("안녕하세요~ 저는 %s입니다. %d살입니다.\n",name,age);
	}
	
}
