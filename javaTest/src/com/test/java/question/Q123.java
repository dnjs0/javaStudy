package com.test.java.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\단일검색.dat";
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader(path));
			String line = null;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			while((line = reader.readLine()) != null) {
				String temp[] = line.split(",");
				if(temp[1].equals(name)) {
					System.out.printf("[%s]\n번호 : %s\n주소 : %s\n전화 : %s\n",temp[1],temp[0],temp[2],temp[3]);
					break;
				}
			}
			
			reader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	} //main

}//class
