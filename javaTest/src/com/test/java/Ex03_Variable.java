package com.test.java;

public class Ex03_Variable {
	public static void main(String[] args) {
		//모든 자료형 + 변수 생성하기
		
		//정수형
		byte b1;
		b1=100; //100>상수, 데이터, 정수형 리터럴, 정수형 상수
		System.out.println(b1);
		short s1;
		System.out.println(Short.MAX_VALUE);
		int n6=1_000_000_000;
		System.out.println(n6);
		long l1;
		l1 = 100_000_000_000L;
		
		float f1;
		f1=54.12345544676536345345345F;
		System.out.println(f1);
		
		double d1;
		d1=34.334534536565567887685D;
		System.out.println(d1);
		
		float f2;
		f2=32423489234983749234F;
		
		double d2;
		d2=2342542524234237834289D;
		
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println(Float.MAX_VALUE );
		System.out.println(Double.MAX_VALUE);
		
		//문자형
		char c1;
		c1 ='A';
		
		String name = "홍길동";
		
		float myWeight = 345.43F;
		System.out.println("제 몸무게는 "+myWeight+" 입니다.");

	}
	
}
