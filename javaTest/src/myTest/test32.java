package myTest;

import java.util.Scanner;

public class test32 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int hour_in = scan.nextInt();
		System.out.print("분 : ");
		int min_in = scan.nextInt();
		System.out.println();
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int hour_out = scan.nextInt();
		System.out.print("분 : ");
		int min_out = scan.nextInt();
		System.out.println();
		int in_out  = ((hour_out*60)+min_out)-((hour_in*60)+min_in);
		if(in_out>30) {
			System.out.printf("주차 요금은 %d원 입니다.",(in_out-30)/10*2000);
		}else {
			System.out.println("무료주차입니다!");
		}
		
	}//main

}
