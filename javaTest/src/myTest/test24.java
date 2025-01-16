package myTest;

import java.util.Scanner;

public class test24 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int hour = scan.nextInt();
		System.out.print("분 : ");
		int min = scan.nextInt();
		int whole_min = (60*hour) + min;
		
		int noodle = whole_min - 10;
		int chicken = whole_min - 18;
		int pizza = whole_min - 25;
		
		System.out.printf("짜장면 :%d시 %d분\n", noodle/60, noodle%60);
		System.out.printf("치킨 :%d시 %d분\n", chicken/60, chicken%60);
		System.out.printf("피자 :%d시 %d분\n", pizza/60, pizza%60);
		
		
	}//main

}
