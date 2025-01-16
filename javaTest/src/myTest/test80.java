package myTest;

import java.util.Scanner;

public class test80 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String input = scan.nextLine();
		
		System.out.print("역순 결과 : ");
		for(int i =1; i<=input.length(); i++) {
			System.out.print(input.charAt(input.length()-i));
		}
		
	}//main

}
