package myTest;

import java.util.Scanner;

public class test46 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String korean = "";
		
		System.out.println("1~9사이의 숫자를 입력하세요.");
		for(int i =0; i<10; i++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			korean = korean + numToKorean(num);
		}
		System.out.println(korean);
		
		
	}//main

	private static String numToKorean(int num) {
		// 숫자를 한글로 바꾸기
		String kor = "";
		if(num ==1) {
			kor = kor +"일";
		}else if(num==2) {
			kor = kor + "이";
		}else if(num==3) {
			kor = kor + "삼";
		}else if(num==4) {
			kor = kor + "사";
		}else if(num==5) {
			kor = kor + "오";
		}else if(num==6) {
			kor = kor + "육";
		}else if(num==7) {
			kor = kor + "칠";
		}else if(num==8) {
			kor = kor + "팔";
		}else if(num==9) {
			kor = kor + "구";
		}
		return kor;
		
	}

}
