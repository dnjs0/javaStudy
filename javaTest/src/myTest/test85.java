package myTest;

import java.util.Scanner;

public class test85 {
	public static void main(String[] args) {
		//한글자씩 떼기
		String jumin = "";
		int sum =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호 : ");
		jumin = scan.nextLine();
		
		jumin  = jumin.replace("-", "");
		
		for(int i = 0; i<jumin.length(); i++) {
			sum += Integer.parseInt(jumin.substring(i, i+1))*(i%8+2);
		}
		sum %= 11;
		sum = 11 - (sum%10);
		
		if(sum == Integer.parseInt(jumin.substring(jumin.length()-1,jumin.length()))) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
	}//main

}
