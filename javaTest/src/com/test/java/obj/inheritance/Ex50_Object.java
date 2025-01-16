package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex50_Object {
	
	public static void main(String[] args) {
		
		//object 클래스
		//	- 모든 클래스의 부모 클래스이다.(Root Class)
		//	- 업캐스팅/ 다운캐스팅 > 모든 자료형을 담을 수 있다.*** 엄중특(엄청 중요한 특징)
		
		
	}//main
	
	private static void m1() {
		AA a1 = new AA();
		BB b1 = new BB();
		CC c1 = new CC();
		
		AA a2 = new BB(); //a2 = b1;
		AA a3 = new CC();
		
		//클래스 간의 관계
		Object o1 = new Object();
		Object o2= new AA();
		Object o3 = new BB();
		Object o4 = new CC();
		Object o5 = new Scanner(System.in);
		Object o6 = new Student();
		
//		((Scanner)o5).nextLine();
		
		
		//클래스 변수 = 자료형 값;
		//	-박싱(Boxing)발생
		
		Object o7 = 10; // new Integer(10);
		Object o8 = true;
	
		//언박싱(Unboxing)발생
		System.out.println((int)o7*2);
		
		
	}
	
}//class


class AA{//extends Objects
	
}
class BB extends AA{
	
}
class CC extends BB{
	
}
