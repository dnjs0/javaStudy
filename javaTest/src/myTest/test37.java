package myTest;

import java.util.Scanner;

public class test37 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		int sum =0;
		
		for (int i =1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d = %d",1,num,sum);
		
	}

}
