package com.test.java.obj;

public class Ex37_static {
	
	//1. 클래스 로딩, Class Loading -> 클래스들 모두 인식하는 과정 -> 읽어서 StaticMethod에 저장해둠
	//	-프로그램을 실행하기 전에 클래스 정의를 미리 읽어서 메모리에 얹는 작업 (설계도 인식 작업)
	//	-***클래스 로딩 과정 중(클래스 정의를 읽어나가는 중) static 키워드를 만나면 메모리에 구현한다.
	
	
	public static void main(String[] args) {
		
		/*
		 * static(정적) 키워드
		 * 	-지시자(제어자) 중 하나
		 * 	-클래스 or 클래스 멤버에 붙인다.
		 * 1.멤버 변수
		 * 2.멤버 메서드
		 * 
		 * 객체 멤버(변수, 메서드)
		 * 	-개인마다 각자 저장할 데이터 -> 객체 멤버 변수
		 * 	-개인마다 각자 하는 행동 -> 객체 멤버 메서드
		 * 
		 * 정적멤버(변수, 메서드)
		 * 	- 집합 모두가 공통으로 저장할 데이터 -> 정적 멤버 변수
		 * 	- 개인이 아닌 집합으로서의 행동 -> 정적멤버 메서드
		 * 
		 */
		
		//상황] 학생3명
		//- "역삼 중학교"

		Student.setSchool("역삼중");
		
		Student s1 = new Student();
		s1.setName("홍길돌");
		s1.setAge(15);
//		s1.setSchool("역삼중학교");
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
//		s2.setSchool("역삼중학교");
		
		Student s3 = new Student();
		s3.setName("하하하");
		s3.setAge(16);
//		s3.setSchool("역삼중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
	}//main
}//class

class Student {
	
	//멤버변수
	//- OOP > 속성(Property), 상태(State)
	//- 자바 > 속성(Property), 멤버변수, 필드(field)
	private String name; //객체 멤버 변수
	private int age;
	
//	private String school;
	private static String school; //정적 멤버 변수
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	
	public String info() {
		return String.format("%s[%d세],%s"
								,this.name
								,this.age
								,Student.getSchool());
	}
	
}
