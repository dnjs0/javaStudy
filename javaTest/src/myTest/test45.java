package myTest;

import java.util.Scanner;

public class test45 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("최대 숫자 : ");
		int num = scan.nextInt();

		if(num>999) {
			System.out.println("최대 3자리까지만 입력하세요!");
		}else {
			for(int i =1; i<=num;i++) {
				game369(i);
				System.out.print(" ");
			}
		}
		
	}

	private static void game369(int num) {
		if(num / 100 >0) {
			System.out.print(three_digit_number(num));
		}else if(num / 10 >0) {
			//두자리 정수면
			System.out.print(two_digit_number(num));
		}else{
			//한자리 정수면
			System.out.print(one_digit_number(num));
		}
	}

	private static String one_digit_number(int num) {
		// 한자리수 369
		String zzak = "";
		if(num ==3 | num ==6 | num ==9) {
			zzak = zzak + "짝";
		}else {
			zzak = zzak +num;
		}
		return  zzak;
		
	}

	private static String two_digit_number(int num) {
		// 두자리 수 일때
		String zzak = "";
		if(num/10 ==3 | num/10==6 | num/10==9) {
			zzak = zzak + "짝";
			num = num -(num/10*10);
			zzak = zzak + one_digit_number(num);
		}else {
			zzak = zzak +(num/10);
			num = num -(num/10*10);
			zzak = zzak + one_digit_number(num);
		}
		return  zzak;
		
	}

	private static String three_digit_number(int num) {
		// 세자리 정수 일때
		String zzak = "";
		if(num/100 ==3 | num/100==6 | num/100==9) {
			zzak = zzak + "짝";
			num = num -(num/100*100);
			zzak = zzak + two_digit_number(num);
		}else {
			zzak = zzak +(num/100);
			num = num -(num/100*100);
			zzak = zzak + two_digit_number(num);
		}
		
		return zzak;
		
	}//main

}

