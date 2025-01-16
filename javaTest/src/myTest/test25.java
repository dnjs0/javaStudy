package myTest;

import java.util.Scanner;

public class test25 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		int gap = 0;
		
		if(num1 > num2) {
			if(num2>=0) {
				gap = num1-num2;
			}else {
				gap = num1+num2;
			}
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가) 차이가 납니다.",num1,num2,gap);
			
		}else if(num2> num1) {
			if(num1>=0) {
				gap = num2-num1;
			}else {
				gap = num2+num1;
			}
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가) 차이가 납니다.",num2,num1,gap);
			
		}else {
			System.out.println("두 숫자는 동일합니다.");
			
		}
		

		
	}//main

}
