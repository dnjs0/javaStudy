package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ex64_Sort {
	public static void main(String[] args) {
		
		
		//Sort ~정렬 정리~
		
		//정렬할수있는것
		// 배열 or 컬렉션(List) : 순서가 있는 집합
		
		//정렬 도구
		//1. 직접 구현 > 알고리즘
		//2. JDK 제공 기능 > Array.sort()
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
		
		
	}//main

	private static void m5() {

		//User.java
		
//		Calendar c = Calendar.getInstance();
//		c.set(2020, 0,10);
//		User u1 = new User("홍길동",1,c, "서울");
		
//		User u1 = new User("홀길동",1,2020,8,10,"서울");
//		System.out.println(u1);
		
		ArrayList<User> list  = new ArrayList<User>();
		
		//내 맘대로 순서 정하기
		//서울, 인천, 대전, 부산, 제주
		// 부장,과장, 대리, 사원
		list.add(new User("홍딜동",1,2024,2,10,"서울"));
		list.add(new User("아무개",3,2024,3,20,"인천"));
		list.add(new User("강아지",5,2021,3,30,"서울"));
		list.add(new User("고양이",3,2022,10,20,"부산"));
		list.add(new User("병아리",1,2023,7,30,"대전"));
		list.add(new User("사과",2,2024,8,3,"제주"));
		list.add(new User("호랑이",4,2021,9,6,"제주"));
		list.add(new User("코끼리",4,2020,12,19,"대전"));
		list.add(new User("이구아나",5,2024,11,3,"부산"));
		list.add(new User("타조",5,2021,4,11,"서울"));
		
		//Arrays.sort(배열, Comparator)
		//Collections.sort(컬렉션, Comparator)
		
		Collections.sort(list, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				
//				return o1.getLevel()-o2.getLevel();
				//문자열과 날짜 비교는 compareTo로 한다!
//				return o1.getRegdate().compareTo(o2.getRegdate());
//				return o1.getCity().compareTo(o2.getCity());
				//서울(1), 인천(2), 대전(3), 부산(4), 제주(5)
				
				int city1 = -1; //첫번째 User의 지역
				int city2 = -1; //두번째 User의 지역
				
				city1 = getCityNumber(o1.getCity());
				city2 = getCityNumber(o2.getCity());
				
				return city1-city2;
				
			}//compare

			private int getCityNumber(String city) {
				//지역명 > (매핑) > 숫자
				if(city.equals("서울")) return 1;
				else if(city.equals("인천")) return 2;
				else if(city.equals("대전")) return 3;
				else if(city.equals("부산")) return 4;
				else if(city.equals("제주")) return 5;
				return 0;
			}
			
		});
		
		
		//람다식
		list.sort((u1,u2)->u1.getLevel()-u2.getLevel());

		
		
		System.out.println(list);
		
	}

	private static void m4() {
		
		String[] names = {"홍길동","사자","꿩","바다코끼리","강아지","아무개","두루미","병아리","고양이"};
		
		//오름차순(문자 코드 우위 비교)
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	
		//오름차순(글자수)
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

//				return o1.length()-o2.length();
				if(o1.length() > o2.length()) {
					return 1;
				}else if(o1.length() < o2.length()) {
					return -1;
				}else {
					return o1.compareTo(o2);
				}
			}
			
		});
		
		System.out.println(Arrays.toString(names));
	}

	private static void m3() {
		// 익명으로 내림차순 만들기
		Integer[] nums1 = {1,3,5,6,2};
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		
		Arrays.sort(nums1,comparator);
		System.out.println(Arrays.toString(nums1));
		System.out.println();
		
		//일반적인 모습
		Arrays.sort(nums1, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		System.out.println(Arrays.toString(nums1));
	}

	private static void m2() {
		Integer[] nums1 = {1,3,5,6,2};
		
		String[] names1 = {"유재석","아무개","강아지","병아리","고양이"};
		
		//내림차순?
		Comparator<Integer> comparator = new MyComparator();
		Arrays.sort(nums1, comparator);
		
		System.out.println(Arrays.toString(nums1));
		
		Comparator<String> comparator2 = new MyStringComparator();
		Arrays.sort(names1, comparator2);
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
	}

	private static void m1() {
		
		//정렬대상
		// 1. 숫자
		// 2. 문자(열)
		// 3. 날짜 시간
		
		// 1.a 숫자 + 배열
		int[] nums1 = {1,3,5,6,2};
		
		//오름차순 정렬
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
		
		//내림차순 정렬 -> 지원 안해줌, 직접구현해야함
		
		//1.b 숫자 + 컬렉션(list)
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		Collections.sort(nums2);
		
		System.out.println(nums2);
		System.out.println();
		
		//2.a 문자열+ 배열
		String[] names1 = {"유재석","아무개","강아지","병아리","고양이"};
		
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
		
		//2.b 문자열+ 컬렉션
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("홍길동");
		names2.add("아무개");
		names2.add("강아지");
		names2.add("고양이");
		names2.add("병아리");
		
		Collections.sort(names2);
		System.out.println(names2);
		System.out.println();
		
		//3.a 날짜시간 + 배열
		Calendar c1 = Calendar.getInstance(); 
		Calendar c2 = Calendar.getInstance();
		Calendar c3 = Calendar.getInstance();
		Calendar c4 = Calendar.getInstance();
		Calendar c5 = Calendar.getInstance();
		
		c1.add(Calendar.DATE, 0);
		c2.add(Calendar.DATE, -3);
		c3.add(Calendar.DATE, 5);
		c4.add(Calendar.DATE, -2);
		c5.add(Calendar.DATE, 4);
		
		Calendar[] dates1 = new Calendar[5];
		dates1[0] = c1;
		dates1[1] = c2;
		dates1[2] = c3;
		dates1[3] = c4;
		dates1[4] = c5;
		
		Arrays.sort(dates1);
		for(Calendar c : dates1) {
			System.out.printf("%tF\n",c);
		}
		System.out.println();
		
		ArrayList<Calendar> dates2 = new ArrayList<Calendar>();
		
		dates2.add(c1);
		dates2.add(c2);
		dates2.add(c3);
		dates2.add(c4);
		dates2.add(c5);
		
		Collections.sort(dates2);
		
		
		for(Calendar c : dates2) {
			System.out.printf("%tF\n",c);
		}
		System.out.println();
		
	}
}//class

//Comparator
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// compare > 2개의 매개변수를 비교 > 크다/작다/같다 > 우위 비교
		//	- o1 > o2 : 양수
		//	- o1 < o2 : 음수
		//	- o1 = o2 : 0
		
//		if(o1 > o2) {
//			return -1;
//		}else if(o1 < o2) {
//			return 1;
//		}else {
//			return 0;
//		}

		return o2-o1;
		
	}
	
}

class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
//		return o1.compareTo(o2); 가나다 순
		return o2.compareTo(o1);
	}
	
}
