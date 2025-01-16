package myTest;

import java.util.Scanner;

public class test38 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 횟수 : ");
		int count = scan.nextInt();
		int even = 0;
		int count_even = 0;
		int odd = 0;
		int count_odd = 0;
		
		
		for (int i = 0; i<count; i++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if(num %2 ==0) {
				even += num;
				count_even +=1;
			}else {
				odd += num;
				count_odd += 1;
			}
		}
		System.out.printf("짝수 %d개의 합 : %d\n",count_even, even);
		System.out.printf("홀수 %d개의 합 : %d\n",count_odd, odd);
		
	}//main

}
