package myTest;

import java.util.Scanner;

public class test36 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = scan.nextInt();
		System.out.print("종료 숫자 : ");
		int end = scan.nextInt();
		System.out.print("증감치 : ");
		int add = scan.nextInt();
		
		for(int i = start; i <=end; i+=add) {
			System.out.printf("%d\n",i);
		}
		
		
	}//main

}
