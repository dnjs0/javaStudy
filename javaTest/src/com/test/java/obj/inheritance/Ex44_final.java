package com.test.java.obj.inheritance;

public class Ex44_final {
	
	/*
	 * final 키워드 : 한번 결정하면 바꿀 수 없다.
	 * 안정성 향상
	 * 1. 변수 적용(지역변수,멤버변수 ..)
	 * 		-final을 붙이면 값은 바꿀 수 없는 상수(Constant)가 된다.
	 * 		-초기화 이후 값을 변경할 수 없다.
	 * 2. 메서드 적용
	 * 		- 상속 시 오버라이빙 방지
	 * 3. 클래스 적용
	 * 		-상속을 방지 , class앞에 final붙이기
	 * 
	 */
	
	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		final int C = 49;
		
		a=10000;
//		C=222; ->컴파일 오류!
		
		Phone p1 = new Phone();
		p1.a = 19;
//		p1.B = 29; final 상수이기때문에 값을 바꿀 수 없다.
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age=20;
		s1.gender =Gender.MALE ; //->s : static , f : final, 초록색 : public
		
		Teacher t1 = new Teacher();
		t1.gender = Gender.FEMALE;
		
		
		
	}//main

}//class


class Phone{
	
	public int a;//변수
	public final int B;//상수, 초기화 해야함, 초기화 하고싶지않을때 생성자에서 수정
	//상수는 생성자에 한해서 초기화를 분리시킬 수 있다.
	
	public Phone() {
		this.a = 10;
		this.B = 20; //재정의를 아닌 초기화 했다고 생각함
//		this.B = 39; -> 이것은 재정의 이므로 컴파일 오류
//		B의 setter는 만들어지지 않는다.
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return B;
	}
	
	
}

class Gender{//많이 사용하니까 class 로 따로 빼기

	public static final int MALE = 1;
	public static final int FEMALE =2;}

class Student{
	
	
	
	public String name;
	public int age;
	public int gender;//열거형 > 남자 :1, 여자 :2
	
	private String tel;
	
	public void test() { //이클립스 아이콘 주의
		System.out.println(this.name);
		System.out.println(this.tel);
	}
	
}

class Teacher{
	public String name;
	public String address;
	
	public int gender; //남자 1 여자 2
	
}

final class FinalParent{
	public int a = 20;
	public final void hello() {
		System.out.println("안녕하세요.");
		this.a++;
	}
	
}
//class FinalChild extends FinalParent{
//	public void hello() { ->컴파일 오류, final이기때문에 오버라이딩 못함
//		System.out.println("하이");
//	}
	
//}
























