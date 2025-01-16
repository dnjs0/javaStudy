package myTest;

import java.util.Scanner;

public class test43 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("컴퓨터가 1~10 사이의 숫자 1개를 생각했습니다.");
		
		int try_num = 0;
		int random_num = (int)(Math.random()*10)+1;
		System.out.println(random_num);
				
				
		while(true) {
			System.out.print("숫자 : ");
			int your_num = scan.nextInt();
			if(your_num ==random_num) {
				System.out.println("맞았습니다.\n");
				try_num++;
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",random_num);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회 입니다.",try_num);
				break;
			}else {
				System.out.println("틀렸습니다.\n");
				try_num ++;
				if(try_num>8) {
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",random_num);
					System.out.println("모든 기회를 실패하였습니다.");
					break;
				}
			}
			
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
			
		
	}//main

}
