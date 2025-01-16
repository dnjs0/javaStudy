package com.test.java;

public class Ex09_Casting {
	public static void main(String[] args) {
		
		byte b1; //1byte(작은형)
		short s1; //2byte(큰형)
		
		b1 =10; //원본
		
		//**문제발생
		s1=(short)b1; //형변환 연산자
		
		
		System.out.println(s1);
		
		
		byte b2;
		short s2;
		
		s2=389+100;
		b2=(byte)s2;
		
		System.out.println(b2);
		
		
		//기업은행 > 게좌
		long n1 = 3000000000L; //게좌 1
		int n2; //계좌 2
		
		//계좌 이체
		 //n2=n1;type mixmatch
		n2 = (int)n1;
		System.out.println(n2);
		
		
		float f1 = 3.14F;
		double d1 = 3.14;
		
		
		
		
	}//main

}
