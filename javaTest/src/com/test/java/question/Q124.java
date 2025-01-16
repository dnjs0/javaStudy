package com.test.java.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {
	public static void main(String[] args) {
		String order_path = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\검색_주문.dat";
		String name_path = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\검색_회원.dat";
				
		try {
			BufferedReader  readName = new BufferedReader(new FileReader(name_path));
			BufferedReader  readOrder = new BufferedReader(new FileReader(order_path));
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			String line = null;
			String num = "";
			String address="";
			
			
			while((line= readName.readLine()) != null) {
				 String[] temp =line.split(",");
				 if(temp[1].equals(name)) {
					 num = temp[0];
					 address = temp[2];
					 break;
				 }
			}
			if(!num.equals("")) {
				System.out.println("==============구매내역=============");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
				while((line = readOrder.readLine())!= null) {
					String[] temp = line.split(",");
					if(temp[3].equals(num)) {
						System.out.printf("%5s\t%s\t%4s\t%5s\t%s\n",temp[0],name,temp[1],temp[2],address);
					}
				}
			}
			
			
			readName.close();
			readOrder.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
