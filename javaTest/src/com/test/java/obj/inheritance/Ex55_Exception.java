package com.test.java.obj.inheritance;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Ex55_Exception { 
	public static void main(String[] args) {
		
		/*
		 * 예외, Exception
		 * 	- 런타임 오류
		 * 	- 컴파일 발견(x) > 실행 중 발견(o)
		 * 	- 개발자가 예측해야함 > 사전 조치
		 * 
		 * 예외처리, Exception Handling
		 * 1. 제어문 사용
		 * 		- 선조건 후처리
		 * 2. 전용 구문 사용 > try catch문
		 * 		- 선실행 후처리
		 */
		
//		m1();
//		m2();
//		m3();
//		m4();
//		try {
//			m5();
//		} catch (Exception e) {
//			System.out.println("예외 처리");
//		}
		
//		m6();
		m7();
		
	}//main

	private static void m7() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			try {
				System.out.print("숫자 : ");
				num = scan.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("숫자만 입력하세요");
				scan = new Scanner(System.in);
			}
		}
		if(num%2==0) {
				System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}
	
	private static void m6() {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		try {
			int num = scan.nextInt();
			
			if(num%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}catch(Exception e) {
			System.out.println("숫마잠 입력하세요");
		}
	}
		
	
	
	

	private static void m5() throws Exception {
		//예외 미루기
		int n = 0;
		System.out.println(100/n);
		
		
	}

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		//블럭 잡고 surround with
		try {
			//비즈니스 코드 영역
			System.out.println(100/num);
		} catch (Exception e) {
			//예외처리 영역
			System.out.println("0 입력");
		}finally {//return을 만나도 무조건 실행하고 감
			//자원 해제 영역, clean-up code ex)scan.close()
			//성공하든 실패하든 무조건 실행
			System.out.println("마무리");
//			scan.close();사용하지 않는것을 권장, 아예 닫아버림
		}
		System.out.println("종료");//return을 만나면 실행 안됨
		
		//scan.close(); 사용하지 않는것을 권장, 아예 닫아버림
		
	}

	private static void m3() {
		try {
			int num = 10; //입력
			System.out.println(100/num);//ArithmeticException
			
			int[] nums = {10,20,30};
			System.out.println(nums[10]); //ArrayIndexOutOfBoundsException
			
			Random rnd = null;
			System.out.println(rnd.nextInt(10)); //NullPointerException
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 - 김대리 연락");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류 - 박과장 연락");
		}catch(NullPointerException e) {
			System.out.println("널참조 오류 - 최대리 연락");
		}catch(Exception e) {//무조건 맨 마지막에!
			System.out.println("예외 처리 - 사용에 불편을 드려 죄송합니다. 빠른 시일내에 기능을 복구하겠습니다. 담당자 연락처 : 010-");
		}
		
	}

	private static void m2() {
		
		int num = 0; //입력
		try {
			System.out.println(100/num);
		}catch(Exception e){
			System.out.println("0으로 나누기 > 김대리 연락");
		}
		
		int[] nums = {10,20,30};
		
		try {
			System.out.println(nums[5]);
		}catch(Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		
		Random rnd = null;
		try {
			System.out.println(rnd.nextInt(10)); //널참조
		}catch(Exception e) {
			System.out.println("널 참조가 발생했습니다 >최대리 연락");
		}
		
		
		
	}

	private static void m1() {
		
		//요구사항] 숫자를 입력받아 계산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
//		double num = scan.nextDouble(); 
		
		// 정수 / 0 = 에러
		// 실수 / 0 = Infinity
		
		//제어문을 사용한 예외 처리
		//예외 조건
		if(num != 0) {
			//비즈니스 코드(업무 코드), 구현할 핵심 코드
			System.out.println("빨강");
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println("노랑");
		}else {
			//예외 처리 코드
			System.out.println("0을 입력하지 마세요.");
		}
		System.out.println();
		
		
		//에외 조선이 명시되어 있지 않다!!
		//try는 예외를 미리 알지 못한다. > 에러가 발생
		try {
			//비즈니스 코드(업무 코드), 구현할 핵심 코드
			System.out.println("빨강");
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println("노랑");
			
		}catch(Exception e){
			//e : 예외 객체
			//- 발생한 예외에 대한 여러가지 정보는 제공한다.
			System.out.println(e.getMessage()); // 에러메시지 제공
			e.printStackTrace(); //에러가 날때 나오는 메시지 제공
			
			
			//예외 처리 코드
			System.out.println("0을 입력하지 마세요.");
			
		}
		System.out.println("프로그램 종료");
	}

}//class














