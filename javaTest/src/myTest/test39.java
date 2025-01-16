package myTest;

import java.util.Scanner;

public class test39 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = scan.nextInt();
		System.out.print("종료 숫자 : ");
		int end = scan.nextInt();
//		System.out.println(start);
//		System.out.println(end);
		
		int sum = 0;
		for(int i =start; i<=end; i++) {			
			System.out.print(i+" + ");
			sum += i;
		}
		System.out.println("\b\b = "+sum);
		
	}//main

}
