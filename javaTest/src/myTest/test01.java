package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test01 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도 : ");
		String yearS = reader.readLine();
		int yearI = Integer.parseInt(yearS);
		int age = 2024-yearI;
		System.out.printf("나이 : %d세", age);
		
		
	}//main

}
