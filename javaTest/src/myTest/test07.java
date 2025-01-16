package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test07 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		int small_alpa =reader.read();
		int big_alpa = small_alpa -32;
		System.out.printf("소문자 '%c'의 대문자는 '%c' 입니다.",small_alpa, big_alpa);
		
		
	}//main

}
