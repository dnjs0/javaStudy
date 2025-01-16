package com.test.java.collection;

import java.util.TreeMap;

public class Ex67_TreeMap {
	public static void main(String[] args) {
		
		/*
		 * TreeMap
		 * 	- 이진 탐색 트리 구조 > 내부 데이터 정렬
		 * 	- 키 + 값
		 * 	- 평상시엔 빠른 hash map 사용하다가 정렬된 map 필요할때 사용
		 * 
		 * List
		 *  - ArrayList : 기본 사용
		 *  - LinkedList : 잦은 조작
		 *  - Stack : 후입선출
		 *  - Queue : 선입선출
		 *  - Vector >>> ArrayList 대체
		 *  
		 *  Set
		 *   - HashSet : 기본 사용
		 *   - TreeSet : 정렬
		 *   
		 *  Map
		 *   - HashMap : 기본 사용
		 *   - TreeMap : 정렬 
		 *   - HashTable >>> HashMap 대체
		 * 
		 */
		
		TreeMap<String,String> map = new TreeMap<>();
		map.put("red","빵강");	//키 - 값
		map.put("yellow","노랑");
		map.put("blue","파랑");
		map.put("white","하양");
		map.put("black","검정");
		
		System.out.println(map); //키로 자동 정렬
		
		//List > 없는 방을 호출하면 무조건 오류가 난다(IndexOutofBoundException)
		//Map > 없는 방을 호출하면 null 반환한다.
		System.out.println(map.get("white"));
		System.out.println(map.get("green"));//null
		
		System.out.println(map.firstKey());//black
		System.out.println(map.lastKey());
		
		System.out.println(map.firstEntry());//키와 값 모두 출력
		System.out.println(map.lastEntry());//yellow=노랑
		
		System.out.println(map.headMap("m"));//키 값이 a~l 로 시작하는 애들 출력
		System.out.println(map.tailMap("m")); //키 값이 m~z 로 시작하는 애들 출력
		System.out.println(map.subMap("m", "w"));//m 이상 w 미만
		
		System.out.println();

		
		
	}//main
}//class
