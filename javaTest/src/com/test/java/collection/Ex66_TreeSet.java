package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex66_TreeSet {
	public static void main(String[] args) {
		
		/*
		 * 컬렉션 이름
		 * 
		 * 
		 * [물리구조]	[사용법 > 인터페이스]
		 *  Array		List	(***)
		 *  Linked		List
		 *  Hash		Set		(***)
		 *  Tree		Set
		 *  Hash		Map		(***)
		 *  Tree		Map
		 * 
		 * 
		 * TreeSet
		 *  - 유일한 요소들을 가진 집합(중복 값 없음)
		 *  - 트리 구조 	> 이진 탐색 트리 구조(Binary Search Tree)
		 *  			> 내부 데이터가 자동으로 정렬된 상태
		 * 
		 * 
		 */
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(9);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(0);
		
		System.out.println(set);
		
		//범위나 순서 관련 기능 제공
		System.out.println(set.first());//첫번째 방
		System.out.println(set.last());//마지막 방
		
		System.out.println(set.headSet(4));//4를 만나기 전까지 가져와라, 방번호 아님! 요소임
		System.out.println(set.tailSet(7));//7을 포함한 뒷부분 가져와라
		System.out.println(set.subSet(4, 7));//4이상 7미만 가져와라
		
		//하나씩 출력하기
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		for(int n :set) {
			System.out.println(n);
		}
		
	}//main
}//class
