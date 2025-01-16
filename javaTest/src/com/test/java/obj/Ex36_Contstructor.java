package com.test.java.obj;

public class Ex36_Contstructor {
	
	public static void main(String[] args) {
		
		//생성자, Constructor
		//-(특수한 목적으로 가지는)메서드
		//-객체의 멤버(변수)를 초기화하는 역할(***)
		//자료형 참조변수 = new 생성자();
		//Point p1 = new Point();
		
		//new Box();
		//1. new 실행 > 객체생성 연산자(변수만 생성하고 끝)
		//2. Box()실행 > 생성자(변수를 초기화 하는 역할)
		Box b1 = new Box();
		
		b1.setSize("대형");
		b1.setPrice(5000);
		
		System.out.println(b1.getSize());
		System.out.println(b1.getSize());
		
		
		//생성자 : 멤버 변수 값 쓰기 + 초기화는 하지만 수정은 못함, 한번만 호출 가능
		//Setter : 멤버 변수 값 쓰기 + 초기화를 비슷하게 하고 수정은 가능
		//초기화 하기 > 생성자, 수정하기 > Setter
		
		Box b201 = new Box("대형",3000);
		Box b202 = new Box("대형",3000);
		
		Box b204 = new Box("중형");
		b204.setPrice(2500);
		
		Box b205 = new Box(3004);
		b205.setSize("대형");

		
		
	}//main 

}//class

class Box{
	
	private String size;
	private int price;
	
	//기본적으로 초기화가 됨!
	//컴파일러가 컴파일을 할때 자동으로 생성하는 코드가 여러개가 있다.
	//기본생성자가 자동으로 생성됨
	//int 는 null로 초기화 못함, 참조형 변수들은 null로 초기화 가능
	//
	//생성자
	//-접근 지정자 : public (private 인 경우 호출을 못함)
	//-반환값 : 존재하지않음 > void 생략
	// - 생성자명은 반드시 클래스명이어야한다.
	//		ex) *Box* b1 = new *Box*();
	
	//기본 생성자
	public Box() {//메서드
		this.size= " 대형 " ; 	//초기값 null 에서 필요에따라 값을 고정할 수도 있다, 
		this.price = 3000;		//생성자를 또 생성해서 값을 일일히 변환하지 않아도 된다.
	}//똑같은거 많이 만들때 사용
	
	//생성자 오버로딩
	public Box(String size, int price) {//메서드기때문에 오버로딩가능
		this.size= size ; 
		this.price = price;		
	}//다양하게 만들때 사용
	
	public Box(String size) {
//		this.size = size;
//		this.price = 0;
		this(size,0);
	}
	
	public Box(int price) {//메서드기때문에 오버로딩가능
//		this.price = price;
//		this.size = null;
		this("",price);
	}
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
