package myTest;

import java.util.Scanner;

public class test76 {
	public static void main(String[] args) {
		
		String[][] score = new String[10][3];
		int num =0;
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		
		for(int i =0; i<score.length;i++) {
			if(kor >= 100-((i+1)*10)) {
				score[i][0] = "■";
			}else {
				score[i][0] = "";
			}
			if(eng >= 100-((i+1)*10)) {
				score[i][1] = "■";
			}else {
				score[i][1] = "";
			}
			if(math >= 100-((i+1)*10)) {
				score[i][2] = "■";
			}else {
				score[i][2] = "";
			}
		
		}

		for(int i =0; i<score.length; i++) {
			for(int j =0; j<score[0].length; j++) {
				System.out.print(" " +score[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("국어\t영어\t수학");
		
	}//main

}
