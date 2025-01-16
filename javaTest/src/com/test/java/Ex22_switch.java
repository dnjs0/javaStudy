package com.test.java;

import java.util.Scanner;

public class Ex22_switch {

	public static void main(String[] args) {
		
//		m1();
		
//		m2();
		
//		m3();
		
		m4();
		
	}//main

	private static void m4() {

		int n1=10;
		if(n1>0) {
			int n2 = 20;
			System.out.println(n2);
		}
		if(n1>0) {
			int n2 = 30;
			System.out.println(n2);
		}
		
		
	}

	private static void m3() {
		Scanner scan = new Scanner(System.in);

		System.out.println("==================");
		System.out.println("       자판기");
		System.out.println("==================");
		System.out.println("1. 콜라 ");
		System.out.println("2. 사이다 ");
		System.out.println("3. 박카스 ");
		System.out.println("-------------------");
		System.out.print("번호 선택 : ");
		
		String sel = scan.nextLine();
		
		int price = 0;
		
		if(sel.equals("1") || sel.equals("2")) {
			price = 800;
		}else if(sel.equals("3")) {
			price = 500;
		}
		System.out.printf("선택한 음료의 가격은 %d원 입니다.\n",price);

		
		switch(sel){
		case "1":
		case "2": //case1와 2의 가격을 같게 하고 싶을때
			price = 600;
			break;
		case "3":
			price = 500;
			break;
			
		}
		System.out.printf("선택한 음료의 가격은 %d원 입니다.\n",price);
		
	}

	private static void m2() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게 : ");
		int weight = scan.nextInt();
		
		if(weight>=50 && weight <100) {
			System.out.println("저체중");
		}else{
			if(weight<50) {
				System.out.println("저체중입니다.");
			}else if(weight>= 100) {
				System.out.println("과체중입니다.");
			}
		}
		
		
		
		
		
	}

	private static void m1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("1과 2중에서 입력하세요");
			break;
		}
		
	}
	
	
}
