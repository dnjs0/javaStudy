package com.test.java;

import java.util.Calendar;

public class Ex27 {
	public static void main(String[] args) {
		//달력 만들기
		//1.해당 년월의 마지막 일
		//2. 해당 월의 1일의 요일
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;  // Calendar.MONTH는 0부터 시작하므로 +1
		
		printCalendar(year, month);
		
		
	}//

	private static void printCalendar(int year, int month) {
		
		int lastDay = getLastDay(year,month);
		int dayOfWeek = getDayOfWeek(year, month);
		System.out.println("Lastday : " + lastDay);
		System.out.println("DayfWeek : " + dayOfWeek);
		
		System.out.println("-----------------------------------------------------");
		System.out.printf("                 %d년 %d일\n",year, month );		
		System.out.println("-----------------------------------------------------");
		System.out.print("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t\n");
		
		// 첫 주 빈 공간 출력
		for(int i =0; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for(int i =1; i<=lastDay; i++) {
			System.out.printf("%3d\t",i);
			if((i+dayOfWeek)%7==0) {
				System.out.println();
			}
		}
		
	}
	
	

	private static int getDayOfWeek(int year, int month) {
		
		//기준점 필요 서기 1년 1월 1일은 월요일~서기 2024년 12월 1일
		int date = 1; //2024년 12월 16일
		int sum = 0;
		
		//1. 서기 1년 1월 1일은 월요일~서기 2023년 12월 31일 > 1년 365일
		for(int i=1; i<year; i++) {
			sum += 365;
			
			if (isLeafYear(i)) {
				sum ++; //윤년
			}
		}
		//2024년 1월~2024년 11월
		for(int i=1 ; i<month; i++) {
			sum += getLastDay(year,i);
		}
		
		//2024년 16일
		sum += date;
		
		
		return sum%7;
	}

	private static int getLastDay(int year, int month) {
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29:28;
		}
		return 0;
	}

	private static boolean isLeafYear(int year) {
		
		if(year % 4==0) {
			if(year%100 ==0) {
				if(year%400 ==0) {
					return true;
				}else {
					return false;
				}
				
			}else {
				return true;
			}
			
		}else {
			return false;
		}
	}

}
