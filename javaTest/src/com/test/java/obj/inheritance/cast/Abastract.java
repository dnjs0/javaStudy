package com.test.java.obj.inheritance.cast;

public class Abastract {
	public static void main(String[] args) {
		
		/*
		 * 
		 * 추상 클래스 ,Abstract Class
		 * 	- 추상 메서드를 가진 클래스
		 * 
		 * 추상 메서드, Abstract Method
		 * 	- 헤더만 있고 본문이 없는 메서드
		 * 	- 본문(구현부)이 없는 메서드
		 * 
		 * 
		 * 
		 */
		
		G305 m1 = new G305();
		m1.color = "white";
		m1.price = 25000;
		
		m1.click();
		m1.click();
		m1.click();

		//10년 사용~ 망가짐
		M410 m2 = new M410();
		m2.color = "Black";
		m2.price = 50000;
		
		//m2.push();//여태까지 click 써와서 불편함! ->오버라이딩
		m2.click();
		m2.click();
		
		
		//추상 클래스로 객체 생성하기
//		Mouse m3 = new Mouse();
//		
//		m3.color = "white";
//		m3.price = 1000;
//		m3.click();
		
		
		
	}//main

}//class

//일반 클래스는 추상 메서드를 가질 수가 없다.
//class Keyboard{
//	public String a;
//	public void test() {
//		
//		
//		
//	}
//	public abstract void info();
//}

//일반 클래스는 추상메서드를 가질수 없다!!
abstract class Mouse{
	
	//구현된 멤버
	//1.변수
	//2.구현부를 가진 메서드
	public String color;
	public int price;
	
	
	//추상메서드,절대 body를 갖지 않음
	public abstract void click();
	
	//일반 메서드, 구현된 메서드
//	public void click() {
//		System.out.println("저렴한 스위치를 사용해서 클릭합니다.");
//	}
	
}


class G305 extends Mouse{
	//추상 클래스(부모)가 물려준 추상메서드를 구현했습니다.
	@Override
	public void click() {
		System.out.println("저렴한 스위치를 사용해서 클릭합니다.");
	}
	
}

class M410 extends Mouse{
	@Override
	public void click() {
		System.out.println("비싼 스위치를 사용해서 클릭합니다.");
	}
	
//	public void push() {
//		System.out.println("비싼 스위치를 사용해서 클릭합니다.");
//	}
}







