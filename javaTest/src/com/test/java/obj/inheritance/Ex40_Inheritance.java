package com.test.java.obj.inheritance;

public class Ex40_Inheritance {
	public static void main(String[] args) {
		//
		//상속 Interitance
		//- 부모가 가지는 재산을 자식에게 물려주는 행동
		//- 부모(클라스)가 가지는 재산(멤버 변수, 멤버 메서드)을 자식(클래스)에게 물려주는 행동
		//
		//-상속 관계에 있는 클래스 호칭
		// 	-부모 클래스 <- 자식 클래스
		//  -슈퍼 클래스 <- 서브 클래스
		//	-기본 글래스 <- 확장 클래스
		//	-기본 클래스 <- 파생 클래스
		
		Parent p1 = new Parent();
		
		p1.a =13;
		p1.b = 20;
		p1.ccc();
		
		Child c1 = new Child();
		c1.a=10;
		c1.b = 20;
		c1.ccc();
		
		
		c1.d=40;
		c1.e = 50;
		c1.fff();
		
		CCC c = new CCC();
		c.a=10;
		c.b= 20;
		c.c = 30;
		
	}//main

}//class

//부모 글래스
class Parent {
	public int a;
	public int b;
	
	public void ccc() {
		System.out.println("ccc"+this.a);
	}
	
}

//자식 클래스
class Child extends Parent{
	public int d;
	public int e;
	
	public void fff() {
		System.out.println("fff"+this.e+this.d);
	}
	
}



//사이트 > 일반유저, 관리자

//User와 Administrator의 부모 역할하는 클래스 만들기
class Member{
	public String id;
	public String password;
}


class User extends Member{
	public String name;
	public String email;
	public int point;
	
	
}

class Administrator extends Member{

	public int level;
	
}

class AAA{
	public int a;
}


class BBB extends AAA{
	public int b;
	
}

class CCC extends BBB{
	public int c;
	
}


