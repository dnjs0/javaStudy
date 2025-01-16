package myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class test22 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("남자 이름 : ");
		String man = reader.readLine();
		System.out.print("여자 이름 : ");
		String woman = reader.readLine();
		
		Calendar now = Calendar.getInstance();
		
		System.out.print("만난날(년) : ");
		String year_S = reader.readLine();
		int year = Integer.parseInt(year_S);
		now.set(Calendar.YEAR, year);
		System.out.print("만난날(월) : ");
		String month_S = reader.readLine();
		int month = Integer.parseInt(month_S);
		now.set(Calendar.MONTH, month);
		System.out.print("만난날(일) : ");
		String date_S = reader.readLine();
		int date = Integer.parseInt(date_S);
		now.set(Calendar.DATE,date );
		
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n",man,woman);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n",now);
		now = Calendar.getInstance();
		now.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF\n",now);
		now = Calendar.getInstance();
		now.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF\n",now);
		now = Calendar.getInstance();
		now.add(Calendar.DATE, 500);
		System.out.printf("500일 : %tF\n",now);
		now = Calendar.getInstance();
		now.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF\n",now);
		
	}//main

}
