package com.test.java.obj;

public class Book {
	
	//누구를 대상으로?
	// - 클래스 기준
	//- 멤버가 소속된 클래스 영역을 기준으로> 경계선/담벼락
//	public int a; //100%공개
//	private int b; //100% 비공개
//	
//	
//	public void test() {
//		System.out.println("a = "+ a); //public > 동작안함
//		System.out.println("b = "+b); //private > 동작안함
//	}
	
	
	//접근지정자 가이드
	//1.멤버변수는 무조건 private 으로 선언한다.
	//2. 멤버 메서드를 선언한다.
	
	
	public String title;
	private int price;
	
	//외부 > (전달) > 내부 : Setter > 이름을 만들때 setXXX(거의 멤버변수)로 적는다.
	public void aaa(int a) {
		
		if(a>=0 && a<=1000000) {
			price = a;
		}
	}
	
	public void setPrice(int price) {
		//위에있는 price(멤버변수)
		//여기 price(지역변수/매개변수)
		//여기서는 둘다 사용할 수 있으므로 충돌이 발생함
		//컴파일은 안남 왜? > 지역변수가 더 구체적인 변수이므로 이것이 우선순위

		//this 연산자
		//객체 접근(지정) 연산자
		//현재 코드가 소속되어있는 객체 자신을 가르키는 역할
		//"나"
		this.price=price;
		
		this.title = "책 제목 ";
		
		
	}
	
	
	
	// 내부 > (전달) > 외부
	
	//Getter
	//get멤버변수
	public int gerPrice() {
		return this.price;//가독성
	}
	

}
