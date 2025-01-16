package com.test.java.obj.inheritance;

public class Ex49_Sample {
	public static void main(String[] args) {
		
		/*
		 * 1.추상 클라스 or인터페이스
		 * 2. 참조형 형변환(다운 캐스팅, 업 캐스팅)
		 * 
		 */

		//상황] 프린터 대리점 운영
		//1. LG100 모델 x5대 , HP200 모델 x 30대
		//2. 하루 1번씩 > 제품 점검
		
		//점검 방식 추가
		//	LG100의 selfTest()
		//	HP200의 call()
//		m1();
		m2();
//		m3();
		
	}//main

	private static void m3() {
		//
		//Case 3
		//프린터 종류 증가 > 형변환 사용
		//instanceof
		//	- 2항 연산자
		//	-boolesn 반환
		//	- 객체 instanceof 타입
		//	list[i] instanceof LG100 : LG100의 자손이나 본인이냐?>
		
		
		Printer[] list = new Printer[8];//LG(5) + HP(3)
		
		
		
		for(int i =0; i<list.length; i++) {
			
			
			if(i<5) {
				list[i] = new LG100(100009, 10,"black",4);
			}else {
				list[i] = new HP200(25000,13,"터치");
			}
		}
		
		//점검 시간
		for(int i=0; i<list.length; i++) {
			
			
			list[i].print();
			
//			System.out.println(list[i] instanceof LG100);
			
			if(list[i] instanceof LG100) {
				LG100 lg = (LG100)list[i];
				lg.selfTest();
			}else if(list[i] instanceof HP200){
				HP200 hp = (HP200)list[i];
				hp.call();
			}
			
		}
		
		
		
		
	}

	private static void m2() {
		//
		//Case 2
		//점검할 프린터가 많을때사용
		//프린터 종류 증가 > 종류강 동일한 비용 증가
		LG100[] lg = new LG100[8];
		HP200[] hp = new HP200[4];
		
		for(int i=0; i<lg.length; i++) {
			lg[i] = new LG100(10000,10,"black",4);
		}
		for(int i=0; i<hp.length; i++) {
			hp[i] = new HP200(30000,13,"터치");
		}
		
		//점검시간
		for(int i = 0; i<lg.length; i++) {
			lg[i].print();
			lg[i].selfTest();
		}
		for(int i = 0; i<hp.length; i++) {
			hp[i].print();
			hp[i].call();
		}
		
		
	}

	private static void m1() {
		//Case 1
		//가장 비효율적인 방식
		//대당 비용 x 동일 증가
		LG100 lg1 = new LG100(30000, 10, "Black", 4);
		LG100 lg2 = new LG100(30000, 10, "Black", 4);
		LG100 lg3 = new LG100(30000, 10, "Black", 4);
		LG100 lg4 = new LG100(30000, 10, "Black", 4);
		LG100 lg5 = new LG100(30000, 10, "Black", 4);
		
		HP200 hp1 = new HP200(25000,11,"터치");
		HP200 hp2 = new HP200(25000,11,"터치");
		HP200 hp3 = new HP200(25000,11,"터치");
		HP200 hp4 = new HP200(25000,11,"터치");
		
		//점검
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		hp4.print();
		
		//추가 상황
		//1. 프링터 재고 증가
		//	- LG100 > 500대
		//	- HP200 > 300대
		
		
	}
	
}//class

//클래스 상속할때 부모역할하는 녀석들
//1. 일반 클래스
//2. 추상 클래스
//3. 인터페이스

//선택 기준
//1. 추상 메서드가 필요한가?
//		a.yes > 추상클래스 or 인터페이스
//		2. 구현된 멤버를 상속할 것인가?
//			a.yes > 추상클래스
//			b.no > 인터페이스
//		b.no > 일반 클래스
//

abstract class Printer { 
	private int price;
	private int weight;
	
	public Printer(int price, int weight) {
		this.price=price;
		this.weight = weight;
	}
	
	//공통 사용법
	public abstract void print();
	
}

class LG100 extends Printer{
	
	public LG100(int price, int weight, String color, int size) {
		super(price, weight);
		this.color = color;
		this.size = size;
	}

	private String color;
	private int size; //A4, A5
	
	public void print() {
		System.out.printf("%d 사이즈로 출력합니다.\n",this.size);
	}
	
	public void selfTest() {
		System.out.println("자가 진단을 합니다.");
	}
	
}

class HP200 extends Printer{
	public HP200(int price, int weight, String type) {
		super(price, weight);
		this.type = type;
	}

	private String type; //터치 or 버튼
	
//	public void output() {
//		System.out.printf("%s 방식으로 출력합니다.",this.type);		
//	}
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n",this.type);
	}
	
	public void call() {
		System.out.println("상담원 AI와 연결합니다.");
	}
	
	
	
}

