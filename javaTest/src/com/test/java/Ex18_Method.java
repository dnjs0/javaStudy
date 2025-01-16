package com.test.java;

public class Ex18_Method {
	
	public static void main(String[] args) {

//		m1();
		
		//선을 그리는 메서드를 선언하시오
		//1.--------------
		//2. ==========
		//3. **********
		
		drowLine();
		drowLine();
		drowLine("*");
		
		//int a;
		//System.out.println(a);
	}//main
	
	public static void drowLine() {
		System.out.println("----------");
	}

	public static void drowLine(String c) {
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		
	}
	
//	public static void m1() {
//		System.out.println("m1");
//	}
//
//	public static void m1() {
//		System.out.println("m1");
//	}
}







