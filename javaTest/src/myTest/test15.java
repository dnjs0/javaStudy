package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test15 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은 날 : ");
		String sunny_S = reader.readLine();
		System.out.print("흐린 날 : ");
		String foggy_S = reader.readLine();
		
		int sunny = Integer.parseInt(sunny_S);
		int foggy = Integer.parseInt(foggy_S);
		
		int total_apple = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.",total_apple);
		
	}//main

	private static int getApple(int sunny, int foggy) {
		int baby_tree = 0;
		int tall_tree = baby_tree + 5*sunny + 2*foggy;
		int apple = (tall_tree-100)/10;
		
		return apple;
	}

}
