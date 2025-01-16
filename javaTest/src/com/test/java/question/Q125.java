package com.test.java.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q125 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\괄호.dat";
		
		try {
			
			BufferedReader reader = new BufferedReader (new FileReader(path));
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}//main

}//class
