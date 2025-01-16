package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test04 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("섭씨(℃) : ");
		String tempC_S = reader.readLine();
		
		double tempC = Double.parseDouble(tempC_S);
		double tempF = (tempC*1.8)+32;
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.",tempC, tempF);
		
		
	}//main

}
