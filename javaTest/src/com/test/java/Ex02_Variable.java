package com.test.java;

public class Ex02_Variable {
	public static void main(String[] args) {
		//9가지 자료형 : byte, short, int, long
		//				float, double,char,boolean
		//				String
		
		//시험성적 : byte, char
		byte testScore = 67;
		char testGrade = 'C';
		System.out.println("저는 시험에서 "+testScore+"점을 맞았고 이것은 "+testGrade+"등급입니다.");
		
		//지금의 시간 오늘의 날짜 : ,short, int
		short time = 1510;
		int todayDate = 20241206;
		System.out.println("지금 시간은 "+time+"이며, 오늘의 날짜는 "+todayDate+"입니다.");
		 
		//세계인구 : long, double,float
		long population = 1882548675438967289L;
		double koreaPopulation = 43980734984D;
		float americaPop = 4390820987F;
		System.out.println("세계인구는 "+population+"명 보다 적습니다.");
		System.out.println("우리나라 인구는 "+koreaPopulation+"명 보다 적습니다.");
		System.out.println("미국 인수는 "+americaPop+"정도입니다.");
		
		//몸무게 : float
		int catNum = 2;
		float firstCatWeight = 5.23F;
		float secondCatWeight = 4.89F;
		System.out.println("저는 고양이를 "+catNum+"마리 키웁니다.");
		System.out.println("그중 첫째 고양이의 몸무게는 "+firstCatWeight+"kg 이고, 둘째 고양이의 몸무게는 "+secondCatWeight+"kg 입니다.");
		
		//거짓말탐지기 : boolean
		boolean goHome = true;
		System.out.println("지금 집에 가고 싶나요? "+goHome);
		
		//현재주소 : String
		String nowAddress = "서울 강남구 역삼역쪽에 있는 쌍용학원";
		System.out.println("저는 지금 "+nowAddress+"에 있습니다.");
		
		//3.14
		double pi = 3.14159265832984923842D;
		System.out.println("원주율은 "+pi+"입니다.");
		
		//char, string
		char New='뉴';
		char Jean='진';
		char Jeans='스';
		String favSong = "How Sweet";
		System.out.println("저는 요즘 "+New+Jean+Jeans+" 노래를 듣곤 합니다.");
		System.out.println("특히 "+favSong+"를 많이 듣습니다.");
		
		byte whatTime =  3;
		System.out.println("지금은 "+whatTime+"시 입니다.");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
	}

}
