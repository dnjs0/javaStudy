package myTest;

import java.util.Scanner;

public class test49 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 : ");
		int num = scan.nextInt();
		
		for(int i = 0; i<7; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int m=num; m>i; m--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}//main

}
