package com.test.java.obj;

public class Ex39_static {
	public static void main(String[] args) {

		Note n1 = new Note(1000, "A4");
		n1.m1();
		System.out.println();

		Note n2 = new Note(2000, "A3");
		n2.m1();
		System.out.println();

	}// main

}// class

class Note {

	// 생성자

	private int price; // 1000,2000
	private String size;// A4, A5

	private static String color = "white"; // white

	// 정적 생산자
	static {
		Note.color = "White";
	}

	// 객체 생성자
	public Note(int price, String size) {
		this.price = price;
		this.size = size;
	}

	// 웬만한면 생산자 만들기
	public Note(int price, String size, String color) {
		this.price = price;
		this.size = size;
		Note.color = color;// 한개 변수에 책임을 몰아줌 ->직접 초기화 하지 않기!!
	}

	// 1. 객체 변수 vs 정적 변수
	// -개인 데이터인경우 객체변수
	// -공용 데이터인 경우 정적 변수

	// 2. 객체 메서드 vs 정적 메서드
	// -개인 행도 : 객체메서드 >  객체 메서드 > this 사용(O), Note 사용(O)
	// -공용황동 ;겅적메서드 > 정적 메서드 > this 사용(X), Note 사용(O)

	// 객체 메서드
	public static void m2() {
//		System.out.println(this.price);
//		System.out.println(this.size);
		System.out.println(Note.color);

	}

	// 객체 메서드
	public void m1() {
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(Note.color);

	}

}
