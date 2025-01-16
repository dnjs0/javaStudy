package com.test.java.obj.inheritance;

public class Ex53_Generic {
	public static void main(String[] args) {
		
		//Item o1 = new Item();
		Item<String> o1 = new Item<String>();
		o1.a = "문자열";
		System.out.println(o1.a.length());
		
		Item<Integer> o2 = new Item<Integer>();
		o2.a = 10;
		System.out.println(o2.a*2);
		
		Object o3 = 10;
		o3 = "믄지얄";
		System.out.println(o3);
		System.out.println();
		
		Pen<Double> p1 = new Pen<Double>();
		Pen<Double> p2 = new Pen<>(); //두번째 Double 생략 가능
		
		p1.a = 3.3;
		p1.b = 2.2;
		p1.c = 1.1;
		
		Laptop<String> l1 = new Laptop<>();
		l1.setType("맥북");
		System.out.println(l1.getType());
		
		Laptop<Integer> l2 = new Laptop<>();
		l2.setType(100);
		System.out.println(l2.getType());
		
		Monitor<String,Integer> m1 = new Monitor<String, Integer>("모니터",100);
		System.out.println(m1.getA());
		System.out.println(m1.getB());
		System.out.println();
		
		//제네릭 클래스
		Wrapper<Integer> n3 = new Wrapper<Integer>(40);//박싱
		System.out.println(n3);
		System.out.println(n3.getData() * 2);
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("강아지");//박싱
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		Wrapper<Boolean> s4 = new Wrapper<Boolean>(true);//박싱
		System.out.println(s4);
		System.out.println(s4.getData()?"찬":"거짓");
		System.out.println();
		
	}//main
}//class


//제네릭 클래스
// T : 타입변수(매개변수 역할) > 참조형만 넣을 수 있다.(기본형은 대입 불가능)
// <> : 인자 리스트
class Item<T>{
	public T a; //클래스를 선언할 당시에는 a의 자료형이 정해져있지 않다.
	public int b;
	public String c;
	
	public void test() {
		
	}
	
}

interface Desk<T>{
	
}

class Pen<T>{
	public T a;
	public T b;
	public T c;
}

class Laptop<T>{
	private T type;

	public T getType() {
		return this.type;
	}

	public void setType(T type) {
		T temp; //비권장
		this.type = type;
	}
}

class Monitor<T,U>{
	private T a;
	private U b;
	
	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}

	public Monitor(T a, U b) {
		this.a = a;
		this.b = b;
	}
}

//제네릭 클래스
class Wrapper<T>{
	private T data;
	public Wrapper(T data) {
		this.setData(data);
	}
	public T getData() {
		return this.data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return String.format("[data=%s]", data);
	}
	
	
}















