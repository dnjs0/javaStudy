package myTest;

import java.util.Scanner;

public class test50 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 : ");
		int num = scan.nextInt();
		
		for(int i =0; i<num;i++) {
			
			for(int n = num; n>i;n--) {
				System.out.print(" ");
			}
			
			for(int m = 0; m<=i-1;m++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}

}
