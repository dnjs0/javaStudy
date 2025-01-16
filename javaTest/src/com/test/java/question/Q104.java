package com.test.java.question;

public class Q104 {
	public static void main(String[] args) {
		
		//MyArrayList
		MyArrayList list = new MyArrayList();
		
		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		System.out.println(list);
		System.out.println();

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(); 
		
		//개수
		System.out.println(list.size());
		System.out.println();
		
		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		
		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));
		System.out.println();
		
		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		
		//삽입
//		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		
	}//main
}//class
