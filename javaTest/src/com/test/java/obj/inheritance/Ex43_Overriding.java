package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex43_Overriding {
	public static void main(String[] args) {
		
		Time t1 = new Time(2,30);
		Time t2 = new Time(3,50);
		
		System.out.println(t1.info());
		System.out.println(t2.info());
		
		System.out.println(t1.toString());
		
		System.out.println(t2);
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());//Object가 물려준 toString을 오더라이딩(Date의 toString으로 재정의 했다.)
		//Source -> generate toString
		
		
		AAAAA a1 = new AAAAA();
		BBBBB b1 = new BBBBB();
		b1.test();
		b1.test();
		
	}//main
}//class

class AAAAA{
	public void test() {
		
	}
}

class BBBBB extends AAAAA{
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
}



//시간(시:분)
class Time{
	private int hour;
	private int minute;
	
	//Source > Generate Constructors using field
	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	
//	public Time(int hour, int minute) {
//		this.hour = hour;
//		this.minute = minute;
//	}
	
	public String info() {
		return this.hour + ":"+this.minute;
	}

//	@Override
//	//어노테이션( Annotation) -일종의(기능이있는) 주석
//	public String toString() {
//		return String.format("Time [hour=%s, minute=%s]", hour, minute);
//	}

	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	
	@Override //Source -> generate toString
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "]";
	}
	
//	public String toString() {
//		return this.hour + ":"+this.minute;
//	}
	
	
	
	
}//time











