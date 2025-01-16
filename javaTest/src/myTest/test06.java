package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원) : ");
		String salary_S = reader.readLine();
		
		double salary = Double.parseDouble(salary_S);
		double tax = salary*0.033;
		
		System.out.printf("세후 금액(원) : %,.0f원\n", salary-tax);
		System.out.printf("세금(원) : %,.0f원", tax);
		
		
	}//main

}
