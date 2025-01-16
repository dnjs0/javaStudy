package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test30 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		int alpa = reader.read();
//		System.out.println(alpa);
		
		if(alpa >= 65 && alpa<=122) {
			if(alpa>=65 &&alpa<=90) {
				System.out.printf("'%c'의 소문자는 '%c'입니다.",alpa,alpa+32);
			}else {
				System.out.printf("'%c'의 대문자는 '%c'입니다.",alpa,alpa-32);
				
			}
			
		}else {
			System.out.println("영문자만 입력하시오");
		}
		
		
	}//

}
