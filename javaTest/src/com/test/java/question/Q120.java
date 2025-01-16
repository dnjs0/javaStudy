package com.test.java.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\이름수정.dat";
		String path2 = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\이름수정_변환.dat";
		
	
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			BufferedWriter writer = new BufferedWriter(new FileWriter(path2));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				line = line.replace("유재석", "홍길동");
				writer.write(line);
			}
			reader.close();
			writer.close();
			System.out.println("변환 완료");
			
		} catch (Exception e) {
			System.out.println("변환 실패");
			e.printStackTrace();
		}
		
		
	}//main

}//class
