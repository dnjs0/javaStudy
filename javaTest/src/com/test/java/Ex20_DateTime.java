package com.test.java;

import java.util.Date;
import java.util.Calendar;

public class Ex20_DateTime {
	
	public static void main(String[] args) {
		
		//m1();
		//Date클래스
		Date now = new Date(); //now변수 안에 현재 시간이 들어가있음
		//System.out.println(now);
		
		//m2();
		
//		m3();
		
		//m4();
		
//		m51();
		
		//m6();
		
//		m7();
		
		m8();
		
	}//main

	private static void m8() {
		// 내가 짠 코드의 실행소요시간
		
		long start = System.currentTimeMillis(); //천분의 1초
		long start2 = System.nanoTime();//10억분의 1초
		//~~
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		System.out.printf("소요시간 : %dms\n", end-start);
		System.out.printf("소요시간 : %dns", end2-start2);
		
	}

	private static void m7() {
		//현재시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//전용메서드(현재시각 tick)
		System.out.println(System.currentTimeMillis());
	}

	private static void m6() {
		//시간 + 시간 = 시간
		//시간 - 시간 = 시간
		
		//2시간 + 1시간= 3시간
		
		int h1 = 2;
		int h2 = 1;
		
		//2시간 30분 + 40분 = 3시간 40분
		
		int hour=2;
		int min = 30;
		min = min + 40;
		System.out.println(min);
		min = min%60;
		System.out.println(min/60);
		System.out.println(hour);
		hour = hour + (min/60);
		System.out.println(hour);
		
		System.out.printf("%d시간 %d분",hour,min);
		
		
		
		
		
	}

	private static void m51() {
		//시각-시간=시간
		
		//내가 태어나서 살아온 시간

		
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1999, 5, 1, 14, 56, 0);
//		System.out.println(now-birthday); > 오류
		
		//2024년 12월 11일 14시 30분 00초
		//-1999년 6월 1일 14시 30분 00초
		//----------------------------------
		
		
		//tick
		//Epoch Time , Unix Time
		//기준 날짜 : 1970년 1월 1일
		System.out.println(now.getTimeInMillis());
		System.out.println(birthday.getTimeInMillis());
		long gap = now.getTimeInMillis()-birthday.getTimeInMillis();
		System.out.printf("살아온 시간 : %,dms\n",gap);
		System.out.printf("살아온 시간 : %,dh\n",gap/1000/60/60);
		System.out.printf("살아온 날 : %,d일\n",gap/1000/60/60/24);
		
		//수료일까지 며칠?
		Calendar end = Calendar.getInstance();
		end.set(2025, 4, 26);
		
		gap = end.getTimeInMillis() - now.getTimeInMillis();
		System.out.printf("수료일까지 남은 일수 : %d일 \n", gap/1000/60/60/24);
		
		//오늘 집에 가려면 몇시간 남았는디
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY,17);
		out.set(Calendar.MINUTE,50);
		
		System.out.printf("집에 가는 남은 시간 = %d시간\n", (out.getTimeInMillis()-now.getTimeInMillis())/1000/60/60);
		
		System.out.printf("집에 가는 남은 시간 = %f시간\n", (out.getTimeInMillis()-now.getTimeInMillis())/1000.0/60/60);
		
		System.out.printf("집에 가는 남은 시간 = %d분\n", (out.getTimeInMillis()-now.getTimeInMillis())/1000/60);
		
		
	}

	private static void m4() {
		// 시간 연산
		//*시각+시간
		//*시각-시간
		//*

		//오늘 만난 커플 > 100일?
		//오늘(시각) + 100일(시간) = 기념일(시각)
		//Calender 	+	int		=	Calender
		
		Calendar now = Calendar.getInstance();
		
		//산술 연산자는 피연산자로 기본형을 가진다. 참조형은 안된다.
		//시각 +시간 메서드
		//-void add(캘린더 상수, 더할 값)
		
		now.add(Calendar.DATE, 100);
		System.out.printf("100일차 : %tF\n",now);
		
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -7);
		System.out.printf("일주일 전 : %tF\n",now);
		
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 3);
		System.out.printf("3년뒤: %tF\n",now);
		
		now = Calendar.getInstance();
		now.add(Calendar.MINUTE, 6);
		System.out.printf("6분후 : %tT\n",now);
	}

	private static void m5() {
		//현재 시각 얻어오기
		//특정 시각 얻어오기
		
		//올해 크리스마스
		//1. 현재 시각 얻어오기
		//2. 특정 시각으로 수정하기
		//
		
		Calendar christmas = Calendar.getInstance(); //지금
//		//올해를 내년으로 바꾸기
//		christmas.set(Calendar.YEAR, 2025);
//		//11일 > 25일로 바꾸기
//		christmas.set(Calendar.DATE, 25);
//		//현재시각을 0시 0분으로 바꾸기
//		christmas.set(Calendar.HOUR_OF_DAY, 0);
//		christmas.set(Calendar.MINUTE, 0);
//		christmas.set(Calendar.SECOND, 0);
		
//		christmas.set(2025, 12, 25);
		
//		christmas.set(2024, 12, 25, 0, 0);
		
		christmas.set(2027, 5, 45, 5, 2, 8);
		
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		
		
		//메서드명 패턴(접두어)
		//1. getXXX() > 가져온다. 읽기 메서드
		//2. setXXX() > 넣는다. 쓰기 메서드
		//3. isXXX() > 확인용. 반환값이 boolean
		
		//Calendar 메서드
		//1. int get(int) : 요소 넣기
		//2. void set(오버로딩) : 요소 쓰기(=수정하기)
		
		
		
	}

	private static void m2() {
		//Calendar 클래스
		Calendar now = Calendar.getInstance();
		
		System.out.println(now); //집합데이터여서 자잘한게 다 나옴
		System.out.println(now.get(Calendar.YEAR)); //캘린더 상수 이용, 2024 > 연도
		System.out.println(now.get(Calendar.MONTH)); //11 > 월(0~11)
		System.out.println(now.get(Calendar.DATE)); //11 > 일
		System.out.println(now.get(Calendar.HOUR)); //0 > 시(12H)
		System.out.println(now.get(Calendar.MINUTE)); //22 > 분
		System.out.println(now.get(Calendar.SECOND)); //57 > 초
		System.out.println(now.get(Calendar.MILLISECOND)); //905 > 밀리초
		System.out.println(now.get(Calendar.AM_PM)); //1 > (AM : 0 , PM : 1)
		System.out.println(now.get(Calendar.DAY_OF_YEAR)); //346 > 올해 며칠째
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); //11 > 이번달들어서 며칠째인지 = DATE
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); //4 > 요일(수요일), (1:일요일~7:토요일)
		System.out.println(now.get(Calendar.WEEK_OF_YEAR)); //50 > 올해 몇주차인지
		System.out.println(now.get(Calendar.WEEK_OF_MONTH)); //2 > 이번달 몇주차인지
		System.out.println();
		System.out.println();

		System.out.printf("오늘은 %d년 %02d월 %02d일 입니다.\n",now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DATE));
		
		System.out.printf("지금은 %02d시 %02d분 %02d초 입니다.\n",
				now.get(Calendar.HOUR_OF_DAY),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND));
		System.out.printf("지금은 %s %02d시 %02d분 %02d초 입니다.\n",
				now.get(Calendar.AM_PM)==0 ? "오전" : "오후",
				now.get(Calendar.HOUR),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND));
		
		
//		//printf() > 형식문자(날짜/시간)
		System.out.printf("%tF\n", now); //2024-12-11
		System.out.printf("%tT\n", now); //12:47:54
		System.out.printf("%tA\n", now); //수요일

		
	}
	
	

}
