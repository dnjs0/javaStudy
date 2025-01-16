package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test03 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비(cm) : ");
		String length_S = reader.readLine();		
		System.out.print("높이(cm) : ");
		String height_S = reader.readLine();		
		
		int length = Integer.parseInt(length_S);
		int height = Integer.parseInt(height_S);
		
		int area = length*height;
		int total_length = 2*(length+height);
		
		System.out.printf("사각형의 넓이는 %d㎠입니다. \n사각형의 둘레는 %dcm입니다.",area, total_length);
		
		
	}//main

}
