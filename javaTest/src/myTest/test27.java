package myTest;

import java.util.Scanner;

public class test27 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String s = scan.nextLine();
		
		if(s.equals("f") || s.equals("F")) {
			System.out.println("Father");
		}else if(s.equals("m")||s.equals("M")) {
			System.out.println("Mother");
		}else if(s.equals("s")||s.equals("S")) {
			System.out.println("Sister");
		}else if(s.equals("b")||s.equals("B")) {
			System.out.println("Brother");
		}else{
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
	}//main

}
