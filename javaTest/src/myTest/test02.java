package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test02 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		String num1_S = reader.readLine();
		System.out.print("두번째 숫자 : ");
		String num2_S = reader.readLine();
		
		int num1 = Integer.parseInt(num1_S);
		int num2 = Integer.parseInt(num2_S);
		
		System.out.printf("%,d + %,d = %,d\n",num1, num2,num1+num2);
		System.out.printf("%,d - %,d = %,d\n",num1, num2,num1-num2);
		System.out.printf("%,d * %,d = %,d\n",num1, num2,num1*num2);
		System.out.printf("%,d / %,d = %,.1f\n",num1, num2,(double)num1/num2);
		System.out.printf("%d %% %d = %d\n",num1, num2,num1%num2);
		
	}//main

}
