package com.test.java.obj.inheritance;

public class Ex41_Object {
	public static void main(String[] args) {
		/*
		 * 
		 * Object클래스
		 * 
		 * 
		 */
		
		//java.lang : 모든 패키지중 최상위 패키지 > 유일하게 import 안해도 됨
		//java.lang.Object에 들어가있음
		Object o1  =new Object();

		Test t1 = new Test();
		t1.a=10; //Object 자동 상속받음
		
		int[] nums = new int[3];
		Object o2 = new Test();
		
		Test t2 =new Test();
		
		int[] num2 = new int[3];
		
	}//main
}//class


class Test extends Object{
	public int a;
	public int b;
}
