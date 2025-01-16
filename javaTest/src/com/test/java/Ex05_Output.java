package com.test.java;

public class Ex05_Output {
	public static void main(String[] args) {
		
		System.out.println(100);
		System.out.print(43);
		System.out.print(23);
		System.out.println();
		//성적표 출력하기
		
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 34;
		
		String name2 = "아무개";
		int kor2 = 30;
		int eng2 = 92;
		int math2 = 64;
		
		System.out.println("===============================");
		System.out.println("            성적표");
		System.out.println("===============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println();
		System.out.println("--------------------------------");
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.println(kor1+"\t"+eng1+"\t"+math1);
		System.out.println(name2+"\t"+kor2+"\t"+eng2+"\t"+math2);
		
		
		 String name = "홍길봉"; //키보드로 받아낼 값
		 System.out.printf("안녕하세요. %s님\r\n", name);
		 System.out.printf("안녕하세요. %s님. 안녕히가세요, %s님",name,name);
		
		 System.out.printf("내 점수는 %d이다.",34);		
		 System.out.printf("내 점수는 %d이다.",34);	
		 System.out.println();
		 
		 int num =100;
		 System.out.printf("%d\n",num);
		 System.out.printf("(%10d)\n",num);
		 System.out.printf("(%-10d)\n",num);
		 
		 
		 double num2 =3.19;
		 System.out.printf("%f\n",num2);
		 System.out.printf("%.1f\n",num2);
		 System.out.printf("%.0f\n",num2);
		 
		 int price =1234567;
		 System.out.printf("%d\n",price);
		 System.out.printf("%,d\n",price);
		 
		
		 
		 double num3 = 1234567.1234567;
		 System.out.printf("금액 : %20f원\n", num3);
		 
		 
		 //메뉴판 출력
		 System.out.println("=================================");
		 System.out.println("           음료 가격");
		 System.out.println("=================================");
		 System.out.printf("콜라 : \t\t\t%,6d\n",2500);
		 System.out.printf("사이다 : \t\t%,6d\n",3000);
		 System.out.printf("스무디 : \t\t%,6d\n",500);
		 System.out.printf("아이스아메리카노 : \t%,6d\n",12500);
		 
		 
		 
	}//main

}//Class
