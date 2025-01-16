package com.test.java.obj;

public class Ex34_Access {
	public static void main(String[] args) {
		
		Monitor m1 = new Monitor();
		
		m1.setModel("LG100"); //쓰기 프로퍼티
		System.out.println(m1.getModel()); //읽기 프로퍼티
		
		System.out.println(m1.getSize()); //읽기 전용 프로퍼티(setSize안만듦)
		
		m1.setPrice(20000); //쓰기 전용 프로퍼티
		
		//Monitor에 grade 멤버변수가 없다! >> 가상 프로퍼티
		System.out.println(m1.getGrade());
		System.out.println(m1.info());
		
		
	}//main

}
