package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex58_HashMap {
	public static void main(String[] args) {
		
		/*
		 * 순서가 있는 집합
		 * 	- List > ArrayList, Stack, Queue
		 * 
		 * 순서가 없는 집합
		 * 	- Set
		 * 	- Map
		 * 
		 * ArrayList
		 * 	- 요소를 접근할때 첨자(index, 방번호)를 쓴다.
		 * 	- 순서가 있는 집합
		 * 		ex) 1강의실, 2강의실, 3강의실 .. numbering
		 * 	- 스칼라 배열(Scalar Array)
		 * 	- 요소 = 첨자(index) + 값(value)
		 * 	- 첨자(index)는 유일하다.
		 * 	- 값(value)은 중복이 가능하다.
		 * 
		 * HashMap
		 * 	- 요소를 접근할때 키(key, 방이름)를 사용한다.
		 * 	- 순서가 없는 집합
		 *		ex) 햇님반, 달님반, 별님반
		 * 	- 연관 배열, 사전 구조(Dictionary)
		 *	- 요소 = 키(key) + 값(value)
		 *	- 키(key)가 유일하다.
		 *	- 값(value)은 중복이 가능하다. > 키가 유일하기 때문이다.
		 * 
		 * 
		 */
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
		
		
	}//main

	class InnerClass{
		//자바는 클래스 안에 클래스를 만들 수 있다.
		//내부 클래스 라고 함
		//이 클래스는 HashMap 클래스 내에서만 쓸 수 있다.
		//비추천
	}
	
	private static void m5() {
		//한 학급의 명단을 만들자
		//3명
		
		//순서 > 루프 or 개별관리
		Student s1 = new Student("홍길동","남자");
		Student s2 = new Student("아무개","남자");
		Student s3 = new Student("호호호","여자");
		
		ArrayList<Student>	list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student s: list) {
			System.out.println(s.getName());
		}
		
		//HashMap적용~,~
		HashMap<String, Student> map = new HashMap<>();
		
		map.put("반장", s1);
		map.put("부반장", s2);
		map.put("체육부장", s3);
		
		//이반 반장이 누구니?
		System.out.println(map.get("반장"));
		
		
		
	}

	private static void m4() {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "강아지");
		map.put(1, "고양이");
		map.put(2, "병아리");
		
		System.out.println(map);
		
		for(int i=0 ; i<map.size(); i++) {//BABO 
			System.out.println(map.get(i));
		}
		
		HashMap<Boolean, String> map2 = new HashMap<Boolean, String>();
		
		map2.put(true, "정답");
		map2.put(false, "오답");
		//boolean 일 경우 두개밖에 못만듦 -> hashmap의 키는 거의 무조건 string이다.
		
	}

	private static void m3() {
		HashMap<String,String> map = new HashMap<>();
		
		//1. 요소 추가
		map.put("Red", "빨강");
		map.put("Yellow", "노랑");
		map.put("Blue", "파랑");
		
		//Loop 탐색, 해시값이 없어서 for문은 못돌림
		Set<String> keys = map.keySet(); //키 배열
		System.out.println(keys);
		
		for(String key : keys) {//키 탐색
			System.out.println(key);
		}
		
		Collection<String> values = map.values(); //값 배열
		System.out.println(values);
		
		for(String value : values) {//값 탐색
			System.out.println(value);
		}
		
		for(String key : keys) {//키와 값 탐색
			System.out.println(key+":"+map.get(key));
		}
		
		
	}

	private static void m2() {
		HashMap<String,String> map = new HashMap<>();
		
		//1. 요소 추가
		map.put("Red", "빨강");
		map.put("Yellow", "노랑");
		map.put("Blue", "파랑");
		
		//요소 개수
		System.out.println(map.size());
		
		
		//3. 요소 넣기
		System.out.println(map.get("red"));
		System.out.println(map.get("yellow"));
		System.out.println(map.get("blue"));
		System.out.println(map.get("green"));
		
		//4. 요소 수정
		map.put("Blue", "푸른"); //키가 있으면 수정, 키가 없으면 삽입
		System.out.println(map);
		
		//5. 요소 삭제
		map.remove("Blue");
		System.out.println(map);
		
		//6. 검색
		//	- indexOf , lastIndeOf > 방번호가 없으므로 존재 x
		//	- contains
		System.out.println(map.containsKey("Red"));
		System.out.println(map.containsValue("빨강"));
		
		//7. 초기화
		map.clear();
		System.out.println(map);
		System.out.println(map.size());
		
		
		
	}

	private static void m1() {
		// 학생 1명의 국어, 영어, 수학 점수 저장하는 데이터 집합
		//	1. 배열 사용
		//	2. ArrayList
		//	3. Class
		//	4. HashMap
		
		//1. 배열
		//	- 같은 성격의 데이터를 모아놓은 집합
		//	- 장점 : 집합, 방번호(루프사용 가능)
		//	- 단점 : 방번호는 의미가 없다, 데이터 식별이 불편
		int[] s1 = new int[3];
		
		s1[0] = 100;
		s1[1] = 90;
		s1[2] = 80;
		
		System.out.println(s1[0]+s1[1]+s1[2]);
		
		//2. ArrayList
		//	- 장점 : 집합, 방번호(루프사용 가능), 과목 동적 추가/삭제 가능
		//	- 단점 : 방번호는 의미가 없다, 데이터 식별이 불편
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		
		s2.add(100);
		s2.add(90);
		s2.add(80);
		
		System.out.println(s2.get(0)+s2.get(1)+s2.get(2));
		
		
		//3. Class
		//	- 장점 : 집합이다, 요소를 이름으로 구분 > 가독성을 높여줌
		//	- 단점 : 클래스 선언 비용 발생
		Subject s3 = new Subject(100,90,80);
		s3.setKor(100);
		System.out.println(s3.getTotal());
		
		//4. HashMap
		//	- 장점 : 집합,요소를 이름(key)으로 구분 > 가독성을 높여줌, 클래스 처럼 선언 비용이 들지 않음
		//	- 단점 : 글래스 처럼 선언을 하지 않음
		HashMap<String, Integer> s4= new HashMap<String, Integer>();
		s4.put("kor", 100); //int kor
		s4.put("eng", 90); 
		s4.put("math", 80); 
		
		System.out.println(s4.get("kor")+s4.get("eng")+s4.get("math"));
		
		HashMap<String, Integer> s5= new HashMap<String, Integer>();
		s5.put("kor", 100); //int kor
		s5.put("eng", 90); 
		s5.put("math", 80); 
		
		System.out.println(s5.get("kor")+s5.get("eng")+s5.get("math"));
		
		
		
	}//m1
	
}//class

class Subject{
	private int kor;
	private int eng;
	private int math;
	
	public Subject(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
}






