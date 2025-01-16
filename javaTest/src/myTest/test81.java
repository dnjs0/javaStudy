package myTest;

import java.util.Scanner;

public class test81 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일 : ");
		String mail = scan.nextLine();
		int index = mail.indexOf("@");
//		System.out.println(index);
		
		System.out.print("아이디 : ");
		System.out.println(mail.substring(0,index));
		System.out.print("도메인 : ");
		System.out.println(mail.substring(index+1));
		
	}//main

}
