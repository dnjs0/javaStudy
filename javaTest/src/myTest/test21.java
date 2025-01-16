package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class test21 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		String year_S = reader.readLine();
		int year = Integer.parseInt(year_S);
		
		Calendar now = Calendar.getInstance();
		int age = now.get(Calendar.YEAR) - year + 1;
		System.out.printf("나이 : %d",age);
		
	}//main

}
