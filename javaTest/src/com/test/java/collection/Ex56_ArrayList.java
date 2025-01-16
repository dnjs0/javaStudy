package com.test.java.collection;

import java.util.ArrayList;
import java.util.Random;

public class Ex56_ArrayList {
	public static void main(String[] args) {
		/**
		 * 자바
		 * -제어문
		 * -배열(+컬렉션)
		 * -클래스
		 * 
		 * 컬렉션, Collection , 가공된 배열
		 * 	- JCF, Java Collection Framework
		 * 	- (개조된) 배열, (향상된) 배열
		 * 	- 개조 ? 향상 ? 
		 * 		1. 성능 향상
		 * 		2. 사용법 향상
		 * 		3. 모든 컬렉션은 길이가 가변이다 > 배열의 길이가 늘었다 줄었다 가능
		 * 
		 * 컬렉션 종류
		 * 	1. List 계열(List 인터페이스)
		 * 		- ArrayList(*****)
		 * 		- LinkedList
		 * 		- Queue
		 * 		- Stack
		 * 		- Vector(-)
		 * 
		 * 	2. Set 계열(Set 인터페이스)
		 * 		- HashSet(***)
		 * 		- TreeSet
		 * 
		 * 	3. Map 계열(Map 인터페이스)
		 * 		- HashMap(*****)
		 * 		- TreeMap
		 * 		- Properties
		 * 		- HashTable(-)
		 * 
		 * 
		 * 
		 * ArrayList 클래스
		 * 	- 왜 가장 많이 사용할까? > 순수 배열과 가장 유사하게 생김
		 * 	- 구현한 인터페이스
		 * 		- List<E>
		 * 		- Collection <E>
		 * 		- Iterable <E>
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
		
		
	}//main

	private static void m6() {
		// ArrayList의 길이는 가변이다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList<Integer> list = new ArrayList<Integer>(초기 배열 크기);
		
		
		System.out.println(list.size()); //길이 : 0
		list.add(100);	//new Object[4]; 4개짜리 배열을 호출한다.
		list.add(200);
		list.add(300);
		System.out.println(list.size()); //길이 : 3
		
		list.add(400);	//4개 배열 꽉참
		list.add(500);	//new Object[8]배열(2배) 새로 만들어서 기존 4개배열을 깊은복사한다, 더블링 현상

		list.trimToSize(); //데이터가 안들어가 있는 방을 size에 맞춰서 제거한다, size만큼 깊은 복사
							//자주하면 안됨 -> 배열이 클수록 깊은복사할때 비용이 든다.
							//trim : 빈칸 제거
		
		for(int i=0;i<1000; i++) {
			//loop를 돌때마다 버려지는 배열이 너무 많다, 복사하는 작업을 많이한다. -> 낭비 -> 처음부터 1000개로 시작해주세요
			//ArrayList<Integer> list = new ArrayList<Integer>(10000);
			list.add(i);
		}
		System.out.println(list.size());
		System.out.println(list);

		
	}

	private static void m5() {
		
		//성적표
		//	- 성적(번호, 학생명, 국어, 영어, 수학, 총점, 평균)
		//	- 성적 x N개(학생수)
		
		//자료형?
		//	- 성적 : 클래스 > Score.java
		//	- 성적 x N개 : 배열 vs ArrayList > 길이로 두개중 선택함
		//	
		
		//학생(성적) 명단
		ArrayList<Score> list = new ArrayList<Score>();
		
		Random rnd = new Random();
		String[] names = {"홍길동","아무개","강아지","고양이","병아리"};
		
		//60~100사이의 난수 = 0~40 +60
		
		
		//학생(성적) 객체 생성 + 값 할당
		for(int i=0; i<names.length; i++) {
			Score s =new Score(i+1,names[i], 
								rnd.nextInt(40)+60,
								rnd.nextInt(40)+60,
								rnd.nextInt(40)+60); //번호,이름,국어,영어,수학
			
			list.add(s); //명단에 추가
			
		}//for

		//출력
		System.out.println("========================================================== ");
		System.out.println("                         성적표");
		System.out.println("========================================================== ");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(Score s : list) {
			
			System.out.printf("%5d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n",s.getSeq(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		}
		
		//정렬
		//1. 고정폭 > 왼쪽, 가운데
		//2. 가변폭 > 왼쪽
		
		//1. 숫자
		//	1.1 수치 > 오른쪽 정렬
		//	1.2 식별자 > 왼쪽, 가운데
		
		
		
	}

	private static void m4() {
		
		//배열
		//	- int[] nums
		//	- String[] txts
		//	- Student[] list	객체배열
		//	- Calender[] list
		
		
		//cup.java
		
		Cup[] list1 = new Cup[3]; //cup을 만든것이 아닌 상자만 만든것
		
		
		System.out.println(list1[0]);
		list1[0] = new Cup("white",10000);
		list1[1] = new Cup("green",3000);
		list1[2] = new Cup("yellow",8000);
		
		for(Cup c :list1) {
			System.out.println(c);
		}
		System.out.println();
		
		ArrayList<Cup> list2 = new ArrayList<Cup>();
		
		list2.add(new Cup("white", 10000));
		list2.add(new Cup("green",3000));
		list2.add(new Cup("yellow",8000));
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		int[] ns1 = new int[5];
		int[][] ns2 = new int [2][3];
		int[][][] n3 = new int [2][3][4];
		
		//ns1
		ArrayList<Integer>ms1 = new ArrayList<Integer>();
		ms1.add(100);
		
		//ns2
		ArrayList<ArrayList<Integer>>ms2 
		=new ArrayList<ArrayList<Integer>>();
		
		ms2.add(ms1);
		System.out.println(ms2);
		ms2.add(new ArrayList<Integer>());
		ms2.add(new ArrayList<Integer>());
		
		ms2.get(2).add(200); //[2]에 200 넣음
		System.out.println(ms2);
		
		
		
		//ns3
		ArrayList<ArrayList<ArrayList<Integer>>>ms3 
		=new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		ms3.add(new ArrayList<ArrayList<Integer>>());
		ms3.get(0).add(new ArrayList<Integer>());
		ms3.get(0).get(0).add(200);
		System.out.println(ms3);
		
		
		
		
		
	}

	private static void m2() {
		//ArrayList 사용법(메서드)
		
		//String[] list
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기
		//	- boolean add(T value)
		//	- 항상 배열의 맨 끝에 추가 > Append Mode
		list.add("사과");
		list.add("귤");
		list.add("바나나");
		list.add("포도");
		list.add("파인애플");
		
		//2. 요소 개수
		//	- int size()
		System.out.println(list.size());
		
		//3. 요소 읽기
		//	- T get(int index)
		System.out.println(list.get(2));
		System.out.println(list.get(list.size()-1));
		System.out.println();
//		System.out.println(list.get(5)); -> IndexOutOfBoundsException
		
		
		//ArrayIndexOutOfBoundsException > 배열 첨자 오류
		//StringIndexOutOfBoundsException > 문자열 첨자 오류
		//IndexOutOfBoundsException > 컬렉션 첨자 오류
		
		//4. 요소 수정하기
		// list[2] = "키위";로 바꾸기
		// - T set(int index, "키위")
		
		String temp = list.set(2, "키위");
		System.out.println(temp); //바나나(이전값)
		System.out.println(list.get(2));//키위(바뀐값)
		System.out.println(list);
		System.out.println();
		
		//5. 요소(방) 삭제하기
		//	- 방 없애기 > 배열의 길이 줄이기
		// 	- T remove(int index) > 방번호를 찾아서 삭제
		//	- boolean remove(T value) > 값을 찾아서 삭제
		//	- 시프트 발생 > 삭제된 방 이후로 모든 요소의 방번호 -1
		System.out.println(list.size());
		System.out.println(list.get(3));
//		list.remove(2);//shift 발생
		list.remove("키위");//방번호 모를때 사용, 키위가 중복될 경우 첫번째 키위만 삭제 -> 번호로 지우는것이 일반적
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list);
		System.out.println();
		
		//6. 요소 추가하기
		//	- 요소를 원하는 위치에 추가
		//	- Insert Mode > 새치기
		//	- void add(int index, T value)
		//	- 시프트 발생 > 삽입된 방 이후의 모든 요소는 방번호 + 1 
		//	
		System.out.println(list);
		list.add(0, "딸기");
		System.out.println(list);
		System.out.println();
		
		//7. 요소 검색
		//	- int indexOf(T value)
		//	- int lastIndexOf(T value)
		
		System.out.println(list.indexOf("귤")); //2
		System.out.println(list.indexOf("망고")); //못찾으면 -1
		System.out.println();
		
		//8. 탐색
		//	
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}
		System.out.println();
		
		//for 문
		//	- 일반 for 문
		//	- 향상된 for 문 for(변수 : 집합(list))
		//	- 순차적으로 list값 출력, 방 번호는 출력 안됨
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//덤프 > Arrays.toString()
		System.out.println(list); //toString 오버라이딩
		System.out.println();
		
		//9. 초기화
		//	- 모든 요소 삭제 > 모든방.remove()
		//	- void clear()
		//	- 상자의 재사용을 위해 자주 쓰임
		
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println();
		
		//10. 빈배열 확인
		//	- boolean isEmpty()
		System.out.println(list.isEmpty());
		System.out.println(list.size()==0);
		
		
	}

	private static void m1() {
		// 배열
		//	- 요소의 타입 명시 > int
		//	- 길이 명시(요소의 개수) > 3
		
		int[] nums1 = new int[3];
		
		//요소 접근 > 배열의 첨자(index) 사용
		nums1[0] = 100;	//배열명[인덱스] <-이런 표기법을 인덱서(Indexer)라고 함
		nums1[1] = 200;
		nums1[2] = 300;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1.length);
		System.out.println();
		
		
		//컬렉션의 특징
		//	- 타입 명시 없음 > Object 배열
		//	- 길이 명시 없음 > 사이즈가 변경이 가능하다.
//		ArrayList nums2 = new ArrayList(); -> 안쓰는 버전
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		//요소접근
		nums2.add(100); //nums2[0] =100; 과 같은 코드
		nums2.add(200); //방 길이가 자동으로 늘어나면서 nums2[1] =200;와 같은 코드
		nums2.add(300); //방 길이가 자동으로 늘어나면서 nums2[2] =300;와 같은 코드
		
		System.out.println(nums2.get(0)); //nums2[0]
		System.out.println(nums2.get(1)); //nums2[1]
		System.out.println(nums2.get(2)); //nums2[2]
		System.out.println(nums2.size()); //nums2.length
		
		nums2.add(400);
		nums2.add(500);
		System.out.println(nums2);
		
		for(int i=0; i<nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
		
	}

}//class
