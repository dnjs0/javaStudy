package myTest;

import java.util.Calendar;
import java.util.Scanner;

public class test34 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = scan.nextInt();
		System.out.print("월 : ");
		int month = scan.nextInt();
		System.out.print("일 : ");
		int day = scan.nextInt();
		
		Calendar date = Calendar.getInstance();
		date.set(year, month-1, day);
//		System.out.printf("%tF\n",date);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK)); //4 > 요일(수요일), (1:일요일~7:토요일)
		
		if(date.get(Calendar.DAY_OF_WEEK)>1 && date.get(Calendar.DAY_OF_WEEK)<7) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			int move_saturday = 7 - date.get(Calendar.DAY_OF_WEEK);
			date.set(Calendar.DATE,date.get(Calendar.DATE)+move_saturday);
			System.out.printf("이동한 날짜는 %tF입니다.",date);
		}else {
			System.out.printf("입력하신 날짜는'휴일(토/일)'입니다.\n");
			System.out.println("결과가 없습니다.\n");
		}
		
		
	}//main

}
