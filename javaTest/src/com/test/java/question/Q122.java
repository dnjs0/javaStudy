package com.test.java.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Q122 {
	public static void main(String[] args) {
		String path = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\성적.dat";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;
			
			String pass = "";
			String non_pass= "";
			
			while((line = reader.readLine()) != null) {
				String temp[] = line.split(",");
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor+eng+math;
				double avg = total/3.0;
				if(avg >=60) {
					pass += name+"\n";
				}else {
					non_pass += name+"\n";
				}
			}
			System.out.println("[합격자]");
			System.out.println(pass);
			System.out.println("[불합격자]");
			System.out.println(non_pass);
			
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}//main

}//class
