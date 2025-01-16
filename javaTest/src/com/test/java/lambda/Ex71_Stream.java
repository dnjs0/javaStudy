package com.test.java.lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;

public class Ex71_Stream {
	public static void main(String[] args) {
		
		/*
		 * 자바 스트림
		 * 1. 입출력 스트림
		 * 	- 파일 입출력, 콘솔 입출력, 네트워크 입출력 등...
		 * 2. 스트림
		 * 	- Java 8(JDK 1.8) + 람다식과 같이 나왔다.
		 *  - 배열(컬렉션)의 탐색(+조작) 기술(**************)
		 *  - 파일 입출력 지원
		 *  - 디렉토리 탐색 지원
		 *  - 기타 등등...
		 *  - 익명 객체를 요구 하는 경우가 많다 > 람다식 사용  +함수형 인터페이스
		 *  
		 *  표준 API 함수형 인터페이스
		 *  1. Consumer
		 *  	- (매개변수) -> {}
		 *  2. Supplier
		 *  	- () -> {return 값;}
		 *  3. Function
		 *  	- (매개변수) -> {return 값;}
		 *  	- 매개변수와 반환값이 동일한 자료형
		 *  4. Operator
		 *  	- (매개변수) -> {return 값;}
		 *  	- 매개 변수와 반환값이 동일한 자료형
		 *  5. Predicate
		 *  	- (매개변수) -> {return 값;}
		 *  	- 반환값이 boolean
		 *
		 *______________________________________________________________
		 * 
		 * 파이프, Pipe
		 * 	- 스트림 객체 메서드
		 * 	1. 중간 파이프 > 또 다른 스트림 객체를 반환
		 * 	2. 최종 파이프 > 반환값이 없거나(void) 혹은 스트림이 아닌 값
		 *
		 *	
		 * 최종 처리
		 *	- forEach(Consumer)
		 *	- 최종 파이프
		 *	- 앞의 스트림으로 부터 요소를 차례대로 받아서 최종 처리하는 작업을 하는 메서드(파이프)
		 *	
		 *
		 *
		 * 필터링
		 * 	- filter(Predicate)
		 * 	- 중간 파이프
		 * 	- 앞의 스트림으로 부터 요소를 차례대로 받아서 조건을 검사한 후 조건을 만족하는 요소는 남기고, 불만족하는 요소는 버리는 작업을 하는 파이프
		 *
		 * 중복 제거
		 * 	- distinct()
		 *  - 중간 파이프
		 *  - 앞의 스트림으로 부터 중복 요소들을 제거한다.
		 *  - 유일한 요소들로만 구성된 스트림을 반환한다.
		 *  - Set 성질과 유사
		 * 
		 * 변환(******)
		 *  - map(function), mapXXX(function)
		 *  - 중간 파이프
		 *  - 앞의 스트림으로부터 요소를 받아 그 요소를 다른 형태로 변환 후 새로운 스트림을 반환한다.
		 *
		 * 정렬
		 *  - sorted(Comparator)
		 *  - 중간 파이프
		 *  - 사용법 : 배열이나 컬렉션의 sort() 메서드와 동일
		 *  
		 * 매칭
		 *  - allMatch(), anyMatch(), noneMatch()
		 *  - 최종파이프
		 *  - boolean allMatch(Predicate) : 모든 요소가 조건을 만족하는지? > and 연산자
		 *  - boolean anyMatch(Predicate) : 일부 요소가 조건을 만족하는지? > or 연산자
		 *  - boolean noneMatch(Predicate) : 묘든 요소가 조건을 불만족 하는지?
		 *  
		 * 집계/통계, Reduce
		 *  - count()
		 *  - max()
		 *  - min()
		 *  - sum()
		 *  - avg()
		 *  - 최종파이프
		 *  - 앞의 스트림의 요소를 취합해서 하나의 통계값을 반환
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
//		m6();
//		m7();
		m8();
		
	}//main

	private static void m8() {
		
		//count()
		long count = Data.getIntList().stream().count();
		System.out.println(count);
		System.out.println();
		
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender() ==1).count());
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender() ==2).count());
		System.out.println();
		
		//max(), min()
		List<Integer> nums = Data.getIntList(); //0 ~ 99
		
		int max = -1; //nums안의 모든 숫자중 가장 작은 숫자 : -1
		int min = 100;
		
		
		for(int n : nums) {
			if(n>max) {
				max=n;
			}
		}
		System.out.println("최대값 : " +max);
		
		
		for(int n:nums) {
			if(n<min) {
				min = n;
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println();
		
		
		//Optional<Integer>
		//	- Integer or int 타입과 동일한 자료형
		//	- 기본형은 null을 가질 수 없다.
		//	- 참조형은 null을 가질 수 있다. > null을 가질 수 있는 int
		
		System.out.println(nums.stream().max((a,b) -> a-b));
		System.out.println(nums.stream().min((a,b) -> a-b));
		
		Optional<Integer> result = nums.stream().max((a,b) -> a-b);
		if(result.isPresent()) {
			System.out.println(result.get());
		}else {
			System.out.println("최대값 존재 안함");
		}
		
		int a1 =10;
		Integer a2 = 20; //new Integer(20);
		Optional<Integer> a3 = Optional.of(30); //wrap
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a3.get());
		
		
		//*** 기본형(8개)는 null을 가질 수 없다.
		//*** 참조형은 null을 가질 수 있다.
		
		String str1 = "";
		int a4 =10;
		
		System.out.println();
		System.out.println();
		
		Optional<User> user = Data.getUserList().stream().max((user1, user2)-> user1.getHeight()-user2.getHeight());
		System.out.println(user.get());
		System.out.println();
		
		if(user.isPresent()) {
			System.out.println(user.get().getName());
			System.out.println(user.get().getHeight());
		}
		
		// 스트림 요소 자료형 > 숫자 / 문자열 / 날짜시간
		//	- count(), max(), min() > 적용 가능
		
		// 스트림 요소 자료형 > 숫자 전용 기능
		//	- sum(), average()
		
		System.out.println();
		nums = Data.getIntList(10);
		System.out.println(nums);
		
		//nums.stream() == Stream<Integer> -> 숫자만 할수있는 행동(sum,average)는 제공하지 않는다.
		//nums.stream().mapToInt(n -> n) == IntStream
		
//		System.out.println(nums.stream().sum);
		int num = nums.stream().mapToInt(n -> n).sum();
		System.out.println(num);
		System.out.println(nums.stream().mapToInt(n -> n).average().getAsDouble());
		System.out.println();
		
		//User> 남자 평균 키?
		double height = Data.getUserList().stream()
							.filter(user2 -> user2.getGender() == 1)
							.mapToInt(user2 -> user2.getHeight())
							.average()
							.getAsDouble();
		System.out.println(height);
		
		
	}

	private static void m7() {

		int nums[] = {2,4,6,8,10};
		
		//요구사항] 배열에 짝무한 존재하는지> (예 / 아니오)
		
		boolean result = true;
		
		for (int n :nums) {
			if(n% 2 == 1) {
				result = false;
				break;
			}
		}
		
		if(result) {
			System.out.println("짝수만 존재");
		}else {
			System.out.println("홍수가 발견됨");
		}
		
		result = Arrays.stream(nums).allMatch(num ->num % 2==0);
		
		if(result) {
			System.out.println("짝수만 존재");
		}else {
			System.out.println("홍수가 발견됨");
		}
		
		nums = new int[] {2,3,5,6,8,10};
		
		//홀수가 1개 이상 존재하는지?
		result = Arrays.stream(nums)
								.anyMatch(num -> num%2==1);
		System.out.println(result);
		
		Data.getUserList()
						.forEach(user -> System.out.println(user));
		
		//모든 남자의 키가 160이상입니까?
		Data.getUserList().stream()
						.filter(user -> user.getGender()==1)
//						.allMatch(user -> user.getHeight() >=160);
						.anyMatch(user -> user.getHeight() >=160);
			
		System.out.println(result);
				
		
	}

	private static void m6() {
		
		//숫자
		Data.getIntList(10).stream()
								.sorted() //오름차순 정렬
								.forEach(n -> System.out.println(n));
		System.out.println();
		
		Data.getIntList(10).stream()
							.sorted((a,b)-> b-a) //내림차순 정렬(b-a), (a-b)하면 오름차순
							.forEach(n -> System.out.println(n));
		System.out.println();
		
		Data.getIntList(10).stream()
							.sorted(Comparator.naturalOrder()) //오름차순
							.sorted(Comparator.reverseOrder()) //내림차순
							.forEach(n -> System.out.println(n));
		System.out.println();
		
		//문자열
		Data.getStringList(10).stream()
								.sorted() //오름차순
								.sorted(Comparator.reverseOrder()) //내림차순
								.sorted((a,b)->b.compareTo(a)) //내림차순
								.forEach(s -> System.out.println(s));
		System.out.println();
		
		
		//날짜
		Data.getItemList().stream()
								.sorted((a,b) -> a.getDate().compareTo(b.getDate())) //오름차순
								.forEach(item -> System.out.println(item));
		System.out.println();
		
		//종합
		Data.getIntList().stream().distinct().filter(n -> n%2==0).map(n -> n*10).sorted().forEach(n -> System.out.println(n));
		System.out.println();
		
		
		
		
	}

	private static void m5() {
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		//5글자 이상이면 긴 단어, 아니면 짧은 단어
		for(String word : list) {
			if(word.length()>=5) {
				System.out.println("긴단어");
			}else {
				System.out.println("짧은 단어");
			}
		}
		System.out.println();
		
		list.stream()
				.map(word -> word.length())//변환(문자열 -> 숫자)
				.forEach(length -> System.out.println(length));
		System.out.println();
		
		list.stream()
				.map(word -> word.length()>= 5 ?"긴단어":"짧은단어")
				.forEach(result -> System.out.println(result));
		System.out.println();
		
		Data.getUserList().stream()
								//.map(user -> user.getName())
		
//								.map(user -> user.getAge())
//								.map(age -> age >=25?"고참":"신입")
		
								.map(user -> user.getGender()== 1 ?"남자":"여자")
								.forEach(user -> System.out.println(user));
				
		System.out.println();
		
		
		//name > Member 객체로 변환
		String[] names = {"홍길동","강아지","아무개","고양이","병아리"};
		
		Arrays.stream(names)
						.map(name -> new Member(name,20))
						.forEach(m -> System.out.println(m));
		System.out.println();
		
		
		//User > (변환) > Member
		Data.getUserList().stream()
							.map(user -> new Member(user.getName(), user.getAge()))
							.forEach(m -> System.out.println(m));
		
	}

	private static void m4() {
		Data.getIntList().stream().filter(num -> num %3 ==0)
									.filter(num -> num%5 ==0)
									.forEach(num ->System.out.println(num));
		System.out.println();
		System.out.println();
		
		List<Integer> list = Data.getIntList();
		System.out.println(list.size());
		
		//위의 집합에서 중복값을 제거한 후 출력하세요.
		//Case 1.
		//List(원본) > 옮겨담기(복사) > Set(결과본)
		Set<Integer> set = new HashSet<Integer>();
		for(int n:list) {
			set.add(n); //중복값 배제
		}
		System.out.println(set.size());
		
		//Case 2.
		Set<Integer> set2 = new HashSet <Integer>(list); //Set > List
		System.out.println(set2.size());
		
		
		System.out.println();
		System.out.println();
		
		//반대
		//Set 보유 > list 변환
		//List<Integer> list2 = new ArrayList<Integer>(set2);//List > Set
		
		//Case 3
		System.out.println(list.stream().count()); //count 보면 long -> 최종파이프라는 뜻
		System.out.println(list.stream().distinct().count());//distinct : 중복값제거
		System.out.println();
		System.out.println();
		
		
		Data.getStringList().stream()
								.filter(word -> word.length() >4)
								.distinct()
								.forEach(word -> System.out.println(word));
		
		//Member.java
		ArrayList<Member> ulist = new ArrayList<Member>();
		
		ulist.add(new Member("홍길동", 20));
		ulist.add(new Member("아무개", 23));
		ulist.add(new Member("호호호", 38));
		ulist.add(new Member("강아지", 10));
		ulist.add(new Member("고양이", 3));
		ulist.add(new Member("병아리", 2));
		ulist.add(new Member("호호호", 38)); //중복값으로 보냐, 아니냐 -> new 때문에 다른 객체라고 생각해서 
											//distinct 해도 중복제거 되지 않음
		
		ulist.stream()
					.distinct()
					.forEach(n -> System.out.println(n));
		
	}

	private static void m3() {
		//스트림을 얻어오는 방법
		//	- stream() 메서드를 사용한다.
		//1. 배열로부터 얻어올 수 있다.
		//2. 컬렉션으로 부터							빈도 많음
		//-----------------------------------------------------
		//3. 숫자 범위								빈도 적음
		//4. 파일로부터
		//5. 디렉토리로 부터
		
		//1.
		int[] nums1 = {10,20,30,40,50};
		Arrays.stream(nums1);
		Arrays.stream(nums1).forEach(num ->System.out.println(num));
		System.out.println();
		
		//2.
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		LinkedList<Integer> nums3 = new LinkedList<>();
		nums3.add(1000);
		nums3.add(2000);
		nums3.add(3000);
		nums3.stream().forEach(num-> System.out.println(num));
		System.out.println();
		
		HashSet<Integer> nums4 = new HashSet<Integer>();
		nums3.add(1000);
		nums3.add(2000);
		nums3.add(3000);
		nums3.stream().forEach(num-> System.out.println(num));
		System.out.println();
		
		HashMap<String, Integer>map;
		//map.stream;
		//map.keySet().stream()
		//map.values.stream
		
		
		//3.
		//- Stream<T>
		//- IntStream
		//- DoubleStream
		
		IntStream.range(1, 11)
						.forEach(item -> System.out.println(item));
		System.out.println();
		
		try {
			//4. 파일 > 읽기작업
			Path path = Paths.get(".\\data\\score.txt");
			Files.lines(path).forEach(str -> System.out.println(str));
			//readLine 과 같음
			System.out.println();
			
			//5. 디렉토리 > dir.listFiles()
			Path path2 = Paths.get("C:\\class\\dev\\eclipse");
			Files.list(path2).forEach(p -> {
				System.out.println(p.getFileName());
			});
			//Stream<path>
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		//배열(컬렉션) 순차 탐색 + 출력
		List<String> list = Data.getStringList(10);
		
		System.out.println(list);
		System.out.println();
		
		//1. for 문(while 문)
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%s\t", list.get(i));
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문 == foreach
		for(String word : list) {
			System.out.printf("%s\t", word);
		}
		System.out.println();
		System.out.println();
		
		//3. iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s\t", iter.next());
		}
		System.out.println();
		System.out.println();
		
		//4. stream
		Stream <String> stream = list.stream();
		
		//애플 아케이드 > c1.accept("애플아케이드") 호출
		// 국내 >  c1.accept("국내") 호출
		// ...
		// 향상된 for 문의 안쪽 loop 와 유사한 동작 방식
		stream.forEach(param -> System.out.println(param));
		System.out.println();
		System.out.println();
		
		
		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);
		
		Stream<Integer> stream2 = nums.stream();
		stream2.forEach(num -> System.out.println(num));
		System.out.println();
		
		//커서와 비슷한 방식이므로 한번 더 돌릴수 없다.
		//한번 더돌리려면 stream 또 열어야한다.
		// = nums.stream()
		
		
		// 배열.stream().pipe().pipe().pipe().pipe().pipe().pipe(); 와 같이 될 수도 있다.
		//함수형 프로그래밍
		stream2 = nums.stream();
		stream2
			.filter(num -> num%2==0)
			.forEach(num -> System.out.println(num)); 
		//filter 에서 짝수만 넘김, forEach는 최종파이프 > 반환값 void, int 등 단일값 return
		System.out.println();
		
		nums.stream().filter(num -> num >= 50 && num %2==0)
						.forEach(num -> System.out.println(num));
		System.out.println();
		
		nums.stream().filter(num -> num >=50)
						.filter(num -> num%2==0)
						.forEach(num -> System.out.println(num));
		System.out.println();
		
		list.stream()
//						.filter(word -> word.length()>=3)
						.filter(word -> word.startsWith("경"))
						.forEach(word -> System.out.println(word));
		
	}

	private static void m1() {
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1)); //100개의 숫자 출력
		
		int[] nums2 = Data.getIntArray(10); //10개만 출력
		System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3); //100개의 숫자 출력
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4); //5개의 숫자 출력
		
		String[] txt1 = Data.getStringArray();
		System.out.println(Arrays.toString(txt1)); //단어 100개 반환
		
		String[] txt2 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt2)); //단어 5개 반환
		
		User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist)); //이름,나이,몸무게, 키,성별

		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));//이름 크기 색 날짜
		
		
		
		
	}

}//class



















