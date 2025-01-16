package com.test.java.obj;

public class Ex30_Class {
	public static void main(String[] args) {	
		
		//지도 > 우리집 좌표 저장(***)
		//Case1
		//가장 간단한 방법  : 직접 찍ㄱㅣ
		//식별자 문제 발생 : 같은 성질의 데이터를 서로 다른 이름으로 저장
		// 구조적인 문제 발생 : 구조화도 안되어있고 규칙도 없다 > 관리를 실패할 확률이 높음
		
		//우리집 좌표
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",x,y);
		
		//마트 좌표
		int x2= 300; //역할이 같은 데이터의 이름을 다르게 정의 > 별로임
		int y2 = 400;
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",x2,y2);
		
		//CASE2
		//배열 사용 : 비용저렴
		//식별자 문제 >해결 > 배열이라는 구조가 생겼기 때문 > 집합 역할
		//배열 단점 발생 : 요소의 성질을 첨자로 구별할 수 없다.> 방번호는 의미를 가지지 못함
		
		//우리집 좌표
		//정수 2개
		int[] a1 = {100,200};
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",a1[0],a1[1]);
		
		//마트좌표
		int[] a2 = {300,400};
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",a2[0],a2[1]);
		
		//자료형
		//기본형,원시형 > 자바가 처음부터 제공
		//클래스[사용자 정의형] > 기존의 자료형 조합 > 
		
		//Case3
		//클래스 사용
		//비용이 비싸다
		//데이터 저장 구조 > 관리가 용이하다
		//각 멤버의 이름을 명시적으로 지정>데이터의 성질 구분 용이
		
		//설계한 클래스로부터 객체를 만드는 방법
		//자료형 변수명 = new 생성자();
		//클래스명 객체명 = 객세생성연산자 생성자();
		
		//Point라는 설계도를 사용해서 p1이라는 객체를 생성한다.
		//붕어빵(print)를 사용해서 붕어빵 1개(p1)를 만들었다.
		
		//우리집 좌표
		Point p1 = new Point();
		
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",p1.x,p1.y);
	
		
		//마트 좌표
		Point p2 = new Point();
		
		p2.x = 300;
		p2.y = 400;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",p2.x,p2.y);
		
		
		Size s1 = new Size();
		
		s1.name = "모니터";
		s1.width = 1000;
		s1.height=500;
		
		System.out.println(s1.name+","+s1.width+","+s1.height);
		
		//객체 == 인스턴스
		//클래스의 구현체(실체화된 무언가)
		
		//p2 > 객체( = 객체 참조변수)
		//s1 > 객체
		
		//p2 > Point의 인스턴스이다.
		//s2 > Size의 인스턴스이다.
		
		
		com.test.java.Size s2 = new com.test.java.Size();
		s2.a = 10;
		System.out.println(s2.a);
	
	}//main
}//class

//클래스 선언하기(=설계도 만들기)
//클래스명 : 파스칼 표기법
class Point{

	//클래스 설계하기
	//1.변수 선언하기 > 객체의 속성
	//2. 메서드 선언하기 > 객체의 행동
	
	//클래스 멤버 변수
	public int x;
	public int y;
	
}


class Size{
	
	//배열은 같은 자료형이지만 클래스는 다채롭게 가능
	public String name;
	public int width;
	public int height;
	
	
}
