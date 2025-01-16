package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test14 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수 : ");
		String staion_S = reader.readLine();
		System.out.print("환승역의 횟수 : ");
		String change_S = reader.readLine();
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시  :");
		String time_S = reader.readLine();
		
		int station = Integer.parseInt(staion_S);
		int change = Integer.parseInt(change_S);
		int time = Integer.parseInt(time_S);
		
		int total_time = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분 입니다.", total_time);
		
		
	}

	private static int getTime(int station, int change, int time) {
		
		int total_time = (station*2)+((time+2)*change);
		
		return total_time;
		
	}

}
