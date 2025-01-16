package myTest;

import java.util.Scanner;

public class test33 {
	public static void main(String[] args) {
		
		System.out.print("년도 입력 : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year %4==0) {
			if(year%100==0) {
				if(year %400 ==0) {
					System.out.printf("%d는 '윤년'입니다.",year);
				}else {
					System.out.printf("%d는 '평년'입니다.",year);
				}
				
			}else {
				System.out.printf("%d는 '윤년'입니다.",year);
			}
			
		}else {
			System.out.printf("%d는 '평년'입니다.",year);
		}
		
		
	}//maiin

}
