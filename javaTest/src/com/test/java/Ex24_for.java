package com.test.java;

public class Ex24_for {
	public static void main(String[] args) {
//		m3();
		m4();
		
	}//main

	private static void m4() {

		//별찍기
		
	}

	private static void m3() {
		for(int i =0; i<10; i++) {
			for(int j =0; j<10; j++) {
				//break or continue
//				if(i==5) {
				if(j==5) {
					continue;
				}
				
				System.out.printf("i : %d, j : %d\n",i, j);
			}
		}
		
	}

}
