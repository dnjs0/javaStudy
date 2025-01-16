package myTest;

import java.util.Calendar;
import java.util.Scanner;

public class test23 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아빠 생일(년) : ");
		int dad_year = scan.nextInt();
		System.out.print("아빠 생일(월) : ");
		int dad_month = scan.nextInt();
		System.out.print("아빠 생일(일) : ");
		int dad_date = scan.nextInt();
		
		Calendar dad = Calendar.getInstance();
		dad.set(dad_year, dad_month, dad_date);

		System.out.print("딸 생일(년) : ");
		int girl_year = scan.nextInt();
		System.out.print("딸 생일(월) : ");
		int girl_month = scan.nextInt();
		System.out.print("딸 생일(일) : ");
		int girl_date = scan.nextInt();
		
		Calendar girl = Calendar.getInstance();
		girl.set(girl_year, girl_month, girl_date);
	
		long gap = girl.getTimeInMillis()-dad.getTimeInMillis();
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",gap/1000/60/60/24);
		
	}//main

}
