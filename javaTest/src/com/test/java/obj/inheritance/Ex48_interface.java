package com.test.java.obj.inheritance;

public class Ex48_interface {
	public static void main(String[] args) {
		
		/*
		 * 인터페이스 , Interface
		 * 	- 자료형으로 쓰인다, class 와 유사
		 * 	- 
		 * 
		 * 
		 */
		
		BackPack b1 = new BackPack();
		b1.open();
		b1.close();
		
		//추상클래스 vs 인터페이스
		//- 추상 클래스 : 구현부를 가질 수 있다. + 추상 멤버를 가질 수 있다.
		//- 인터페이스 : 구현부를 가질 수 없다. + 추상 멤버를 가질 수 있다. > 주로 쓴다.
		
	}//main

}

//인터페이스 ==  추상메서드의 집합 , 규칙의 집합
//인터페이스 선언
interface Bag {
	//인터페이스 멤버 선언
	//	- 추상 멤버를 가진다.->abstract 생략 가능
	//	- 인터페이스는 구현멤버를 가질 수 없다.
	//		일반 멤버 변수 , 구현된 일반 메서드
	//	
//	public abstract void open();
//	public void open();
	void open();
//	public abstract void close();
//	public void close();
	void close();
	
}

//Interface 상속 키워드 : implements
class BackPack implements Bag {

	@Override
	public void open() {
		System.out.println("백팩을 엽니다.");
	}

	@Override
	public void close() {
		System.out.println("백팩을 닫습니다.");
	}
	
}

class BridfCase implements Bag{

	@Override
	public void open() {
		System.out.println("서류가방을 엽니다");
	}

	@Override
	public void close() {
		System.out.println("서류가방을 닫습니다");
		
	}
	
}









