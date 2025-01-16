package com.test.java;

import java.util.Calendar;

public class Ex28 {
	public static void main(String[] args) {
		
		int year = 2024;
		int month = 12;
		
		printCalendar(year, month);
		
	}//main

	private static void printCalendar(int year, int month) {
		
		Calendar c1 = Calendar.getInstance();
		c1.set(year, month-1,1);
		
		int lastDay = c1.getActualMaximum(Calendar.DATE); //그 달의 마지막 일을 알려줌
		int dayOfWeek = c1.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.println("-------------------------------------------------");
        System.out.printf("              %d년 %d월\n", year, month);
        System.out.println("-------------------------------------------------");
        System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");

        // 첫 주 빈 공간 출력
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("\t");
        }

        // 날짜 출력
        for (int i = 1; i <= lastDay; i++) {
            System.out.printf("%3d\t", i);
            if ((i + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // 마지막 줄 개행
    }
		
}


