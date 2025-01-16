package myTest;

import java.util.Scanner;

public class test29 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("연산자 : ");
		String operation = scan.next();
		
		switch(operation) {
		case "+":
			System.out.printf("%d %s %d = %d",num1,operation, num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d %s %d = %d",num1,operation, num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d %s %d = %d",num1,operation, num2, num1*num2);
			break;
		case "/":
			System.out.printf("%d %s %d = %.1f",num1,operation, num2, (float)num1/num2);
			break;
		case "%":
			System.out.printf("%d %s %d = %d",num1,operation, num2, num1%num2);
			break;
		default : 
			System.out.println("연산이 불가능합니다.");
			break;
		}
	}//main

}
