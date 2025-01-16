package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test13 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 : ");
		String kor_S = reader.readLine();
		System.out.print("영어 : ");
		String eng_S = reader.readLine();
		System.out.print("수학 : ");
		String math_S = reader.readLine();
		
		int kor = Integer.parseInt(kor_S);
		int eng = Integer.parseInt(eng_S);
		int math = Integer.parseInt(math_S);
		
		String result = test(kor, eng,math);
		System.out.println(result);
		
	}

	private static String test(int kor, int eng, int math) {
		int average = (kor+eng+math)/3;
		return average>=60 ?"합격입니다.":"불합격입니다.";
	}//main

}
