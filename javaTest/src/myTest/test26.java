package myTest;

import java.util.Scanner;

public class test26 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = scan.nextInt();
		
		if(score>=0 && score <=100) {
			if(score>=90 && score<=100) {
				System.out.printf("입력하신 %d점은 성적 A입니다.",score);
			}else if(score>=80 && score<=89) {
				System.out.printf("입력하신 %d점은 성적 B입니다.",score);
			}else if(score>=70 && score<=79) {
				System.out.printf("입력하신 %d점은 성적 C입니다.",score);
			}else if(score>=60 && score<=69) {
				System.out.printf("입력하신 %d점은 성적 D입니다.",score);
			}if(score>=0 && score<=59) {
				System.out.printf("입력하신 %d점은 성적 F입니다.",score);
			}
			
		}else {
			System.out.println("0부터 100사이의 정수를 입력하세요!");
		}
		
	}//main

}
