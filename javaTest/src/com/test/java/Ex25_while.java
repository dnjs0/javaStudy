package com.test.java;

import java.util.Scanner;

public class Ex25_while {
	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
	}//main

	private static void m5() {
		// 1+2+..+10 = 55
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
//			if(i != 10) {
//			System.out.printf("%d + ",i);
//			}else {
//				System.out.print(i+" = ");
//			}
			
			System.out.print(i+" + ");
			sum += i;
		}
		System.out.println("\b\b = "+sum);
	}

	private static void m4() {

		int n = 1;
		while(n<=10) {
			System.out.println(n);
			n++;
		}
		System.out.println();
		
		n=1;
		do {
			System.out.println(n);
			n++;
		}while(n<=10);
		
		
		
	}

	private static void m3() {
		// 자판기
		//메뉴 출력 > 선택> 결과 ~반복
		//돈 투입 > 가격 처리 > 잔돈 환급
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		
		
		while(loop) {
			showMenu();
			
			System.out.print("투입 금액 : ");
			int money = scan.nextInt(); //1000(엔터) , 엔터 안버림!!
			//scan.skip("\r\n"); //엔터 버림
			scan.nextLine(); //엔터버림
			System.out.print("메뉴 선택 : ");
			String sel = scan.nextLine(); //홍길동(엔터), 엔터 버림
			
			
			//가격 알려주기
			if(sel.equals("1")) {
				
				if(checkMoney(scan, money, 700)) {
					System.out.println("700원입니다.");
					System.out.printf("잔돈 %d를 반환합니다.\n",money-700);
					pause(scan);
				}else {
					continue;
				}
			}else if(sel.equals("2")) {
				if(checkMoney(scan, money, 600)) {
					System.out.println("600원입니다.");
					System.out.printf("잔돈 %d를 반환합니다.\n",money-600);
					pause(scan);
				}else {
					continue;
				}
			}else if(sel.equals("3")) {
				if(checkMoney(scan, money, 500)) {
					System.out.println("500원입니다.");
					System.out.printf("잔돈 %d를 반환합니다.\n",money-500);
					pause(scan);
				}else {
					continue;
				}
			}else {
				System.out.println("자판기를 종료합니다.");
				loop = false; //break와 비슷함
			}
		}
		
	}

	public static boolean checkMoney(Scanner scan, int money , int price) {
		if(money < price) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("투입금액을 반환했습니다.");
			pause(scan);
//			continue; //남은코드 무시하고 처음으로 돌아가기
			return false;
		}else {
			return true;
		}
	}
	
	public static void pause(Scanner scan) {
		System.out.println();
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine(); // 일시중지
	}

	public static void showMenu() {
		System.out.println("==============");
		System.out.println("    자판기");
		System.out.println("==============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("4. 종료");
		System.out.println("==============");
//		System.out.print("선택 : ");
//		String sel = scan.nextLine();
//		return sel;
	}

	private static void m2() {
		// 1~100까지의 합

		int num=1;
		int sum = 0;
		while(num<=100) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
	}

	private static void m1() {

		//1~10까지 출력하기
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int i =1;
		while(i <=10) {
			System.out.println(i);
			i++;
		}
		
	}

}
