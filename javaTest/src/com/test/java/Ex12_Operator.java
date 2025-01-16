package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_Operator {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//나이 입력 > 18세 이상 68세 미만
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.print("나이 : ");
//		int age = Integer.parseInt(reader.readLine());
//		
//		
//		System.out.print("성별(m,f) : ");
//		String gender = reader.readLine();
//		
//		System.out.println((age >= 18 && age < 60) && gender.equals("m"));

		
		int sum = 1 +2*3;
		System.out.println(sum);
		
		
		int n1 =100;
		int n2; //n1 값 복사하기
		int n3;
		
		
		
		//연산자 연산방향
		n3=n2=n1;
		System.out.println(n2);
		System.out.println(n3);
		
		int n = 10;
		n += 1; //누적 n = n+1
		System.out.println(n);
		
		
		n=10;
		int result = 0;
		result = 10 + ++n;
		
		System.out.println(result);
		
		n=10;
		int result2 = 0;
		result2 = 10 + n++;
		
		
		System.out.println(result2);
		
		
		int a = 34;
		a++;
		System.out.println(true ? 100 : 200);
		
		System.out.printf("숫자 %d는 %s입니다.\n",n,n%2==0? "짝수":"홀수");
	}//main

}
