package com.test.java.obj.inheritance;

public class Ex52_Generic {
	public static void main(String[] args) {
		
		//제네릭, Generic
		//-제네릭 클래스
		//- 제네릭 메서드
		
		//제네릭 클래스
		// -개발자가 직접 정의하기 위해서 사용한다.
		// - JDK에서 제공되는 클래스 중 일부가 제네릭으로 제공 > 점점 증가하는중
		// - 컬렉션의 기능들
		
		//요구사항] 클래스 설계 중...
		//1. 멤버 변수가 하나 있어야한다 > int 1개
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드들을 선언
		
		//추가사항] String을 중심으로 하는 클래스 설계
		//추가사항] boolean을 중심으로 하는 클래스 설계
		//추가사항] double을 중심으로 하는 클래스 설계
		//추가사항] byte을 중심으로 하는 클래스 설계
		//추가사항] Random을 중심으로 하는 클래스 설계
		//추가사항] Student을 중심으로 하는 클래스 설계
		//추가사항] --무한대 -> Object사용!!
		
		//int 전용 클래스
		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1);
		System.out.println(n1.getData()*2);
		n1.setData(30);
		System.out.println(n1);
		System.out.println();
		//Object 범용 클래스
		WrapperObject n2 = new WrapperObject(20); //박싱
		System.out.println(n2);
		System.out.println((int)n2.getData()*2); //형변환해줘야함 !!, 언박싱
		System.out.println();
		
		//문자열 전용 클래스
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		//Object 범용 클래스
		WrapperObject s2 = new WrapperObject("아무개"); //박싱X, 형변환, 업캐스팅, 참조형끼리는 박싱 아님
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length()); //형변환해줘야함 !!
		System.out.println();
		
		//불리언 전용 클래스
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData()? "참":"거짓");
		System.out.println();
		//Object 범용 클래스
		WrapperBoolean b2 = new WrapperBoolean(false); //박싱
		System.out.println(b2);
		System.out.println((boolean)b2.getData()? "참":"거짓");
		System.out.println();
		
		//s2.setData(3.14) 도 가능함, 헷갈릴수 있다 > Object의 치명적인 단점!
		
		
	}//main
}//class


class WrapperInt{
	private int data; //1. 클래스의 중심 역할
	
	//2. 메서드 > data 중심으로 행동
	public WrapperInt(int data) {
		this.setData(data); //refactoring
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("[data=%s]", data);
	}
	
}

class WrapperString{
	private String data; //1. 클래스의 중심 역할
	
	//2. 메서드 > data 중심으로 행동
	public WrapperString(String data) {
		this.setData(data); //refactoring
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("[data=%s]", data);
	}
	
}

class WrapperBoolean{
	private boolean data; //1. 클래스의 중심 역할
	
	//2. 메서드 > data 중심으로 행동
	public WrapperBoolean(boolean data) {
		this.setData(data); //refactoring
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("[data=%s]", data);
	}
	
}


class WrapperObject{
	private Object data; //1. 클래스의 중심 역할
	
	//2. 메서드 > data 중심으로 행동
	public WrapperObject(Object data) {
		this.setData(data); //refactoring
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("[data=%s]", data);
	}
}

