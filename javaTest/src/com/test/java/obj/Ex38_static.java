package com.test.java.obj;

public class Ex38_static {
	public static void main(String[] args) {
		
		//요구사항]
		//1. 펜을 생산하시오
		//2. 생산된 펜이 몇개인지
		
		//Case 1. : 직접 개수만큼 입력
		//	- 간편함
		//	-pen 과 count 의 관계성 독립
		//	-count++ 누락 위험!!
		
		/*
		int count =0;
		
		Pen p1 = new Pen("Monami","Black");
		count++;
		Pen p2 = new Pen("Monami","Black");
		count++;
		Pen p3 = new Pen("Monami","Black");
		count++;
		
		System.out.println("볼펜의 개수 : "+count);
		*/
		
		
		//case 2
		//	-pen 클래스와 count 변수간의 관계 강화
		//	-count 변수가 많다.공용데이터를 객체변수로 만들었기 때문
//		Pen p1 = new Pen("Monami","Black");
//		p1.count++;
//		Pen p2 = new Pen("Monami","Black");
//		p1.count++;
//		Pen p3 = new Pen("Monami","Black");
//		p1.count++;
//		
//		System.out.println("볼펜의 개수 : "+p1.count);
//		System.out.println("볼펜의 개수 : "+p2.count);
//		System.out.println("볼펜의 개수 : "+p3.count);
		
//		case 3
//			-pen클래스와 count 변수간의 관계 명확
//			- 개인 데이터와 공용 데이터의 구현
//			
//		Pen p1 = new Pen("Monami","Black");
//		Pen.count++;
//		
//		Pen p2 = new Pen("Monami","Black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("Monami","Black");
//		Pen.count++;
//		
//		System.out.println("볼펜의 개수 : "+Pen.count);
		
		//case4
		//	-count를 pen클래스에 넣음
		Pen p1 = new Pen("Monami","Black");
		Pen p2 = new Pen("Monami","Black");
		Pen p3 = new Pen("Monami","Black");
		System.out.println("볼펜의 개수 : "+Pen.count);
		
		
		
	}//main
}//class




//case4에서 쓴 pen
class Pen{
	
	private String model;
	private String color;
	public static int count = 0;
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}

	public String info() {
		return String.format("[model : %s, color ; %s]", this.model,this.color);
	}
}

//case3에서 쓴 pen
//class Pen{
//	
//	private String model;
//	private String color;
//	public static int count = 0;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//
//	public String info() {
//		return String.format("[model : %s, color ; %s]", this.model,this.color);
//	}
//}

//case2에서 쓴 pen
//class Pen{
//	
//	private String model;
//	private String color;
//	public int count = 0;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//
//	public String info() {
//		return String.format("[model : %s, color ; %s]", this.model,this.color);
//	}
//}


//case 1에서 쓴 Pen
//class Pen{
//	
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//
//	public String info() {
//		return String.format("[model : %s, color ; %s]", this.model,this.color);
//	}
//}
