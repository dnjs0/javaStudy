package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		String n_S = reader.readLine();
		int n = Integer.parseInt(n_S);
		
		String result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		
		
	}//main

	private static String getNumber(int n) {
		
		String result = n%2==0 ? "짝수" : "홀수";
		
		return result;
	}

}
