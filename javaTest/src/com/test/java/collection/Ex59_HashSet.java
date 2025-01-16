package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex59_HashSet {
	public static void main(String[] args) {
		
		/**
		 * HashSet
		 * 
		 * 	1. List
		 * 		- 순서가 있는 집합
		 * 		- 첨자(방번호)
		 * 		- 데이터 중복을 허용
		 * 
		 * 	2. Map
		 * 		- 순서가 없는 집합
		 * 		- 키(방이름)
		 * 		- 데이터 중복을 허용
		 * 
		 * 	3. Set
		 * 		- 순서가 없는 집합
		 * 		- 요소의 식별자가 없다. > 방 번호와 방 이름 둘다 없다.
		 * 		- 방을 구분할 수가 없다.
		 * 		- 데이터 중복을 허용하지 않는다. (***) > 방을 구분할 수 없기 때문이다.
		 * 
		 */

//		m1(); 
//		m2();
//		m3();
//		m4();
//		m5();
		
	}//main

	private static void m5() {
		
		// 책장이나 가방에 노트 보관해야한다.
		//	1. 동일한 타입의 노트가 허용되는 상황 > list
		//	2. 동일한 타입의 노트는 허용되지 않는 상황 > set
		
		Note n1 = new Note("A4","white", 1000);
		Note n2 = new Note("A4","black", 1000);
		Note n3 = new Note("A5","white", 800);
		Note n4 = new Note("A4","white", 1000);
		
		HashSet<Note> set = new HashSet<Note>();
		
		set.add(n1);
		set.add(n2);
		set.add(n3);
		set.add(n4);
		
		System.out.println(set);
		
	}

	private static void m4() {

		//데이터의 비교
		//	1. 값 비교	> 기본형
		//	2. 주소값 비교 > 참조형(클래스, 배열, 문자열)

		//값 비교
		//	- 기본형의 비교
		int a = 10;
		int b = 10;
		int c = 5;
		c += 5;
		
		System.out.println("기본형의 비교");
		System.out.println(a==b); //값의 비교가 발생한다.
		System.out.println(a==c); //값의 비교가 발생한다.
		System.out.println();
		
		//참조형의 비교
		//	- 문자열(참조형)의 비교는 연산자 절대 안되고 equals()를 사용한다.
		Note n1 = new Note("A4","white", 1000);
		Note n2 = new Note("A5","black", 800);
		Note n3 = new Note("A4", "white",1000);
		Note n4 = n1; //얕은 복사, 주소값 복사
		
		System.out.println("참조형의 비교");
		//연산자를 사용한 비교 > 주소값을 비교한다.
		System.out.println(n1==n3);
		System.out.println(n1==n2);
		System.out.println(n1==n4);
		System.out.println();
		
		//equals() 메서드의 결과는 == 연산자와 동일하다. -> 왜써야함?
		//equals()를 그대로 사용하지 말고 오버라이드 해서 사용해라!!!!!!!!!!!
		//Note에서 오버라이딩
		System.out.println(n1.equals(n3));
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n4));
		System.out.println();
		
		System.out.println(n1.hashCode()); //664740647 > 메모리 주소값 -> 재정의 한 후 똑같은 객체의 값이 동일
		System.out.println(n2.hashCode()); //문자열은 값이 동일하면 주소값이 동일하다.
		System.out.println(n3.hashCode()); //n1,n3, n4의 해시코드가 같아짐
		System.out.println(n4.hashCode()); //n1과 같은 주소값
		
		
	}

	private static void m3() {
		
		//마트 경품 추첨
		//	- 중복 당첨 허용X > Set
		//	- 중복 당첨 허용O > List or Map > List
		
		String[] list = {"홍길동","아무개","고양이","강아지","병아리","사자","호랑이","개구리","타조","햄스터"};
		
		Random rnd = new Random();
		
		HashSet<String> result1 = new HashSet<String>();
		ArrayList<String> result2 = new ArrayList<String>();
		
		while(result1.size()<5) {
			result1.add(list[rnd.nextInt(list.length)]);
		}
		
		
		//while(result2.size()<5) {
		for(int i =0;i <5; i++) {
			result2.add(list[rnd.nextInt(list.length)]);
		}

		System.out.print("중복 허용 : ");
		System.out.println(result1);
		System.out.print("중복 허용 안됨 : ");
		System.out.println(result2);
		
	}

	private static void m2() {
		// set의 특징, 장점
		
		//로또 번호 > 난수생성 + 유일한 숫자들로만
		Random rnd = new Random();
		
		//Case1.
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
//		for(int i = 0; i<6; i++) {
//			int n = rnd.nextInt(45)+1;
//			//n이 유일한 숫자인지 확인해야한다.
//			if(checkNumber(lotto,n)) {
//			
//				lotto.add(n);
//			}else {
//				i--;
//			}
//			
//		}
		
		while(lotto.size()<6) {
			int n = rnd.nextInt(45)+1;
			//n이 유일한 숫자인지 확인해야한다.
			if(checkNumber(lotto,n)) {
			
				lotto.add(n);
			}
			
		}
		
		System.out.println(lotto);
		
		
		System.out.println();
		
		//Case2
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
//		for(int i=0; i<6; i++) {
//			//i<6을 할 경우 중복되는 숫자는 안넣어지기 때문에 값이 모자랄수있다.
//			int n = rnd.nextInt(45)+1;
//			lotto2.add(n);
//		}
		
		while(lotto2.size()<6) {
			int n = rnd.nextInt(45)+1;
			lotto2.add(n);
		}
		
		System.out.println(lotto2);
		
		
	}//m2

	private static boolean checkNumber(ArrayList<Integer> lotto, int n) {
		// 
		for(int i=0; i<lotto.size();i++) {
			if(lotto.get(i)==n) {
				return false;
			}
		}
		
		return true;
	}

	private static void m1() {
		
		HashSet<String> set = new HashSet<String>();
		
		//1. 요소 추가
		set.add("사과");
		System.out.println(set.add("딸기")); //true
		set.add("바나나");
		set.add("딸기"); //오류는 안나지만 추가되지는 않는다.
		System.out.println(set.add("딸기")); //false
		System.out.println();
		
		//2. 요소 개수
		System.out.println(set.size());
		System.out.println();
		
		//3. 요소 읽기 > 방 구분이 불가능하므로 원하는 요소 지정 불가능 
		//				- 읽기 메서드가 없다.
		//				- set.get(식별자);
		
		//읽기 도구 제공(************) 매우 중요
		//	- Iterator, 화살표
		// 	- 컬렉션.iterator()
		//	- set.iterator() 가 존재하면 해당 컬렉션은 이터레이터를 지원받는다.
		//	- FOF(First Of File)에서 부터 커서가 내려오면서 읽음
		 
		Iterator<String> iter = set.iterator();
//		System.out.println(set);
//		System.out.println(iter.hasNext()); //true
//		System.out.println(iter.next()); //사과
//		
//		System.out.println(iter.hasNext()); //true
//		System.out.println(iter.next()); //바나나
//		
//		System.out.println(iter.hasNext()); //true
//		System.out.println(iter.next()); //딸기
//		
//		System.out.println(iter.hasNext()); //false
//		System.out.println(iter.next()); //에러 > 커서가 가리키는곳에 아무것도 없기 때문
	
		//반복문으로 만들기
		//화살표가 EOF(End Of File)을 가리키고 있기때문에 두번 호출할 수 없다.
		//또 읽기위해서는 새로 만드는 수 밖에 없다.
		//iter = set.iterator(); 
		//향상된 for문과 같다
		//while(iter.hasNexxt()){
		//		System.out.println();
		//}
		
		
//		while(iter.hasNext()) { 
//			String item = iter.next(); //<-여기서 한번 커서 이동
//			item = iter.next();//<-여기서 한번 더 커서 이동
//			System.out.println(item);//<- 한개 건너뛰고 출력하게 됨
//		}
	
		for(String item : set) {//<-실행될때마다 iterator 가 새로 만들어진다.
			System.out.println(item);
		}
		System.out.println();

		for(String item : set) {//<-두번 호출 가능
			System.out.println(item);
		}
		System.out.println();
		System.out.println();
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		
		//1.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//2.
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//3.
		Iterator<String> iter2 = list.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
	}
	
	

}//class













