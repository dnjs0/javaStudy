package myTest;

import java.util.Scanner;

public class test82 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		String input = scan.nextLine();
		int sum = 0;
		
		System.out.print("결과 : ");
		for(int i = 0 ;i <input.length(); i++) {
			int num = Integer.parseInt(input.substring(i, i+1));
			System.out.printf("%d + ",num);
			sum += num;
		}
		System.out.printf("\b\b= %d",sum);
		
	}//main

}
