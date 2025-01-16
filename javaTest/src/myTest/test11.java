package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		String string_n1 = reader.readLine();
		System.out.print("두번째 숫자 : ");
		String string_n2 = reader.readLine();
		
		int n1 = Integer.parseInt(string_n1);
		int n2 = Integer.parseInt(string_n2);
		
		


		String result_add = subtract(n1, n2);
		System.out.println(result_add);
		
		String result_subtract = add(n1, n2);
		System.out.println(result_subtract);
		
		String result_multiply = multiply(n1, n2);
		System.out.println(result_multiply);
		
		String result_divide = divide(n1, n2);
		System.out.println(result_divide);
		
		String result_mod = mod(n1, n2);
		System.out.println(result_mod);


		
		
	}//main

	public static String add(int n1, int n2) {
		return n1+" - "+n2+" = "+ (n1-n2);
	}
	
	public static String subtract(int n1, int n2) {
		return n1+" + "+n2+" = "+ (n1+n2);
	}
	
	public static String multiply(int n1, int n2) {
		return n1+" * "+n2+" = "+ (n1*n2);
	}
	
	public static String divide(int n1, int n2) {
		double d1 = n1;
		double d2 = n2;
		return n1+" / "+n2+" = "+ (d1/d2);
	}
	
	public static String mod(int n1, int n2) {
		return n1+" % "+n2+" = "+ (n1%n2);
	}



}
