package com.test.java.obj;

import java.util.Arrays;

public class Ex35_Class {
	//Employee.java

	public static void main(String[] args) {
		
		Employee e2 = new Employee();
		e2.setName("아무개");
		e2.setDepartment("영업부");
		
		
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setDepartment("영업부");
		e1.setBoss(e2); //부하 <->상사 상하관계
		
		System.out.println(e1.info());
		
		//Parent.java
		//Child.java

		Parent p1 = new Parent();
		p1.setName("홍길동");;
		p1.setAge(65);
		
		Parent p2 = new Parent();
		p2.setName("아무개");;
		p2.setAge(61);
		
		Child c1 = new Child();
		c1.setName("홍바보");
		c1.setAge(20);
		
		c1.setFather(p1);
		c1.setMother(p2);
		
		
		
	//Person.java
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.addNick("홀쭉이");
		hong.addNick("젓가락");
		hong.addNick("철사");
		
		
//		String[] nick = new String[3];
//		nick[0] = "홀쭉이";
//		nick[1] = "젓가락";
//		nick[2] = "철사";
//
//		hong.setNick(nick);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
//		System.out.println(Arrays.toString(hong.getNick()));
		System.out.println(hong.getNick(0));
		System.out.println(hong.getNick(1));
		System.out.println(hong.getNick(2));
		
	}
	
	
	
}
