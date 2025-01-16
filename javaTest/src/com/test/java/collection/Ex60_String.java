package com.test.java.collection;

public class Ex60_String {
	public static void main(String[] args) {
//		m1();
//		m2();
		m3();
		
		
		
	}//main

	private static void m3() {
		//m2의 1번과 2번일 경우 String 대신에 StringBuilder 사용
		String s1 = "홍길동";
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("홍길동");
		System.out.println(s2);
		
		System.out.println(s2.length());
		
		s1 = s1+"님";
		s2.append("님");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		//String vs StringBuilder 성능차이 > 시간 측정
		
		String txt1 = "홍길동";
		
		long begin = System.currentTimeMillis();
		for(int i = 0; i<300000; i++) {
			txt1 = txt1 + ".";
		}
		long end = System.currentTimeMillis();
		System.out.println(txt1.length());
		
		System.out.printf("%,dms\n", end - begin);
		System.out.println();
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		begin = System.currentTimeMillis();
		
		for(int i =0; i<300000; i++) { 
			txt2.append(".");
		}
		end = System.currentTimeMillis();
		System.out.println(txt1.length());
		
		System.out.printf("%,dms\n", end - begin);
		System.out.println();
		
	}

	private static void m2() {
		// 문자열 작업시 주의할 점
		
		//1. 잦은 문자열 수정은 지양해야한다.
		String str1 = "홍길동";
		
		for(int i =0; i<100; i++) {
			str1 = str1 + "님";
		}
		
		//2. 큰 문자열 조작은 지양해야한다.
		String str2 = "홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동 ...";
		str2 += ".";
		
	}

	private static void m1() {
		//"자바의 문자열은 불변(Immutable)이다."
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3+"길동"; // 연산에 의한 문자열 상수는 상수풀에 별도록 보관된다.
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1==s2); //주소값 비교
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		
		System.out.println(s1.equals(s2)); //값비교가 됨
		System.out.println(s1.equals(s3));
		System.out.println();
		
		//문자열을 만드는 방법 2가지
		String s5 = "홍길동";
		String s6 = new String("홍길동"); //s5와 다른 길동이
		String s7 = new String("홍길동");
		
		System.out.println(s6==s7); //false
		System.out.println(s6.equals(s7)); //true
				
		
	}
}//class
