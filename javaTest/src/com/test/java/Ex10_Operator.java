package com.test.java;

public class Ex10_Operator {
	public static void main(String[] args) {
		//연산자 operator
		
		//산술 연산자 : - + * / %
		
		int a = 10;
		int b =3;
		
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		System.out.printf("%d %% %d = %d\n",a,b,a%b);
		
		double c =10;
		double d =3;
		System.out.printf("%f / %f = %.3f\n",c,d,c/d);
		System.out.printf("%f %% %f = %.3f\n",c,d,c%d);
		
		
		System.out.printf("%d %% %f = %f\n",a,d,a%d);
		System.out.printf("%f %% %d = %f\n",c,b,c%b);
		
		
		int a1 = 100000000;
		int a2=200;
		int a3 = a1 +a2;
		long a4 = (long)a1+a2;
		System.out.println(a3);
		
		
		byte a8 = 10;
		byte a9 = 20;
		
		//byte a10 = a8+a9;
		
		
	}//main

}
