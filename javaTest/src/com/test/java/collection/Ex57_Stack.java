package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex57_Stack {
	public static void main(String[] args) {
		
		/*
		 * 컬렉션
		 * 	- 순수 배열을 기반(일부 아닌것도 있음)
		 * 	1. 사용법 개량
		 * 	2. 내부 구조 개량
		 * 
		 * 
		 * 
		 * Stack
		 * 	- 후입선출, LIFO, Last Input First Output
		 * 	- 저장소(배열)에 나중에 들어간 요소가 먼저 나온다
		 * 		ex) 메모리 구조(Stack)
		 * 		ex) 되돌리기(ctrl z), 다시하기(ctrl y)
		 * 		ex) 브라우저 > 뒤로가기, 앞으로 가기
		 * 
		 * Queue
		 * 	- 선입선출, FIFO, First Input First Output
		 * 	- 저장소(배열)에 먼저 들어간 요소가 먼저 나온다.
		 * 		ex) 줄서기, 주문하기
		 * 
		 * 
		 */
		
//		m1(); //stack
		m2(); //queue
		
	}//main

	private static void m2() {
		
		Stack<String> stack = new Stack<String>();	//파란색은 클래스
		Queue<String> queue = new LinkedList<String>();	//하늘색은 인터페이스
		
		//1. 요소 추가하기
		//	- boolean add(T value)
		queue.add("빨강"); //enqueue()한다고 함
		queue.add("노랑");
		queue.add("파랑");
		
//		//2. 요소 개수
//		System.out.println(queue.size());
//		
//		//3. 요소 열기(꺼내기)
//		System.out.println(queue.poll()); //빨강
//		System.out.println(queue.poll()); //노랑
//		System.out.println(queue.poll()); //파랑
//		System.out.println(queue.poll()); //업으면 null이 출력됨
//		System.out.println(queue.poll()); //오류 안남
//		
//		요소 유무 검사
		while(queue.size()>0) {
			System.out.println(queue.poll());
		}
//		
//		while(!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}
//		
		//4. 구경하기
		System.out.println(queue.peek());
		
		
		
		
	}

	private static void m1() {
		// Stack
		Stack<String> stack = new Stack<String>();
		
		//1. 요소 추가
		//	- T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		//2. 요소 개수
		//	- int size()
//		System.out.println(stack.size());
//		
//		//3. 요소 읽기
//		//	- T pop()
//		System.out.println(stack.pop()); //가장 마지막에 넣은 녀석 나옴, 파랑
//		System.out.println(stack.size()); //size가 하나 줄어들었다, 2
//		
//		System.out.println(stack.pop()); //가장 마지막에 넣은 녀석 나옴, 노랑
//		System.out.println(stack.size()); //size가 하나 줄어들었다, 1
//		
//		System.out.println(stack.pop()); //가장 마지막에 넣은 녀석 나옴, 빨강
//		System.out.println(stack.size()); //size가 하나 줄어들었다, 
		
//		System.out.println(stack.pop()); //아므것도 없는데 꺼내면 오류
		
		//EmptyStackException
//		if(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		
		//size()는 상수가 아니라 변수에 가깝다. -> 변수를 만들어서 size를 고정해야한다.
		
//		int size = stack.size();
//		for(int i=0; i<size; i++) {
//			System.out.println(stack.pop());
//		}
//		보통은 while 문을 돌린다
//		while(stack.size()>0) {
//			System.out.println(stack.pop());
//		}
//		
//		while(!stack.isEmpty())	{
//			System.out.println(stack.pop());
//		}
		
		//3. 빈배열인지 확인
		System.out.println(stack.isEmpty());
		
		//4. peek : 지금 나오는 공을 살짝 보다
		// 무슨데이터가 나오는지 미리 보는 행동
		//pop()의 대상 요소를 미리 보는 행동
		System.out.println(stack.peek()); //파란색
		
		
	}
	
}//class


















