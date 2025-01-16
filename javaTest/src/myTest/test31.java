package myTest;

import java.util.Scanner;

public class test31 {
	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5; i++) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			if (num%2==0) {
				even += 1;
			}else if (num%2 ==1) {
				odd +=1;
			}
		}
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n",even, odd);
		System.out.print(even>odd ? "짝수가 홀수보다 "+(even-odd)+"개 더 많습니다.": "홀수가 짝수보다 "+(odd-even)+"개 더 많습니다.\n");
		
		//?
//		System.out.println(even);
//		System.out.println(odd);
//		if(even>odd) {
//			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.",(even-odd));
//		}else if(odd>even) {
//			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.",(odd-even));
//		}
		
		
	}//main

}
