package com.test.java;

import java.util.Scanner;

public class Ex23_for {

	public static void main(String[] args) {
		
//		m1();
		
//		star();
//		star2();
//		star3();
//		star4();
//		
		
//		m2();
//		m3();
		
//		m4();
//		m5(); //**
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
		
		
		
	}//main
	
	
	private static void m12() {
		//2단 찍고 한줄 띄고 3단 찍고 ...
		
		for(int n =1 ; n<10; n++) {
			System.out.println("=============================");
			System.out.printf("            %d단 \n",n);
			System.out.println("=============================");
			for(int m =1; m<10; m++) {
				System.out.printf("%d x %d = %2d\n",n,m,n*m);
			}
			System.out.println();
		}
		
	}


	private static void m11() {
		//Hello.java
		//1. java.exe Hello.java > Hello.class(바이트, 실행)
		//2.java.exe Hello>실행
		System.out.println("일이삼\r사오");//사오삼
		
		
	}


	private static void m10() {
		// 난수 생성
//		System.out.println(Math.PI);
//		
//		System.out.println(Math.random());
		
		//가공
		System.out.println((int)(Math.random()*100));
		
	}


	private static void m9() {
		// break, continue
		
		for(int i = 1; i<=10; i++) {
			
			if(i == 5) {
				break; //i가  5를 만나면 멈춤
			}
			
			System.out.println(i);	

		}
		System.out.println();
		
		for(int i = 1; i<=10; i++) {
			
			if(i == 5) {
				continue; //5를 만나면 앞으로 가서 하던일을 마무리함
			}
			
			System.out.println(i);	

		}
		
	}


	private static void m8() {
//		for(int i =0; i<10; i--) {
//			System.out.println(i);
//		}
		
//		for(int i =0; true; i--) {
//			System.out.println(i);
//		}
		//사용자가 입력하는 모든 숫자의 합
		//종료 의사 표현 > 0 입력
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		for(;;) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if(num ==0) {
				break;
			}else {
				sum += num;
			}
		}
		System.out.println(sum);
		
	}


	private static void m7() {
		// 사용자가 보고싶은 숫자의 구구단을 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 : ");
		int num = scan.nextInt();
		
		for(int i =1; i <10; i++) {
			System.out.printf("%d x %d = %2d\n", num,i,num*i);
		}
		
	}


	private static void m6() {

		for(int i =1; i<10; i++) {
			System.out.printf("5 x %d = %2d\n",i,i*5);
		}
		
	}


	private static void m5() {
		// 사용자가 입력한 임의의 숫자 10개의 합을 구하시오.
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int i =1 ; i<=10; i ++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			sum +=  num;
		}
		System.out.printf("숫자의 총합 : %d", sum);
		
	}


	private static void m4() {
		// 1+ 사용자가 입력한 숫자까지의 합?
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		int total = 0;
		
		for(int i = 1; i <=num; i++) {
			total += i;
		}
		System.out.printf("1~%d까지의 숫자의 합은 %d입니다.",num, total);
		
	}


	private static void m3() {
		//1에서 부터 10까지의 합을 구하라!\
		int num = 0;
		for (int i =1; i<=10; i++) {
			num += i;
		}
		System.out.println(num);
		
	}


	private static void m2() {

		
		//루프 변수 중요!! > 수열에서 쓰임
		//숫자1~10까지 출력
		
		for(int i =1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println();
		for(int i =1;i<=10;i+=3) {
			System.out.println(i);
		}
		System.out.println();
		for(int i =5;i<=100;i+=5) {
			System.out.println(i);
		}
		
		
	}


	private static void star4() {
		for(int i = 1; i<9;i++) {
			
			for(int m = 1; m<=i-1;m++) {
				System.out.print(" ");
			}
			
			for(int n = 9; n>0;n--) {
				System.out.print("*");
			}
			
			
			System.out.println("*");
		}
	}
	
	private static void star3() {
		for(int i = 1; i<9;i+=2) {
			
			for(int n = 9; n>i;n-=2) {
				System.out.print(" ");
			}
			
			for(int m = 1; m<=i-1;m++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	private static void star2() {
		for(int i = 1; i<5;i++) {
			for(int m = 1; m<=i-1;m++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

		private static void star() {
		for(int i = 5; i>0;i--) {
			for(int m = i-1; m>0;m--) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
	}

	private static void m1() {
		for(int i = 0; i<5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	
	
}
 