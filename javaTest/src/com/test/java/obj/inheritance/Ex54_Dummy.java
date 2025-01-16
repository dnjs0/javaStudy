package com.test.java.obj.inheritance;

import java.util.Random;

public class Ex54_Dummy {
	public static void main(String[] args) {
		
		/*
		 * 프로젝트
		 * 	-주제 > 레시피 제공 사이트
		 * 			- 모든 음식 제공
		 * 			- 양식, 중식, 한식, 일식, 분식 ...
		 * 			- 한식 > 찌개 > 5개
		 */
		
		//학생관리 프로젝트
		// - 학교 종류 : 초등학교 , 중학교 , 대학교 ..?
		// - 학교 규모? : 전교생
		// - 학년, 반, 학급당 인원수, 남녀 성비?
		// -  학생 데이터[이름, 나이, 성별, 주소, 키, 등..]
		
		//데이터 생성
		// - 난수 생성
		// 더미 데이터 + 테스트 (실습)용 데이터
		// 90%				10%
		
		
//		m1();
		m2();
		
	}//main

	private static void m2() {
		// 학생 데이터(이름, 나이, 성별, 주소)
		//100명 > 출력
		int size = 100; //100먕
		Random rnd = new Random();
		
		String[] name1 = {"김", "이", "박","최","정","우","차","정","허"}; //9개
		String[] name2 = {"길", "동", "재", "석", "명","수","세","진","호","마","주","이","원"};//13개
		
		
		//서울시 강남구 역삼동 11번지
		String [] address1 = {"서울시",	"부산시", "인천시","강릉시"," 대구시","광주시","제주시"};
		String [] address2 = {"강남구","강서구","강동구","강북구","중구"};
		String [] address3 = {"역삼동","대치동","압구정동","천호동","서초동","명일동","상일동"};
		
		
		for(int i=0; i<size; i++) {
			
			String name = "";
			int age = 0;
			String gender = "";
			String address = "";
			
			//나이(14~16) -> 0~2사이의 정수 난수 +14
			age = rnd.nextInt(3)+14;
			
			//이름(난수)
			name = name1[rnd.nextInt(name1.length)] //0~8사이의 난수
					+ name2[rnd.nextInt(name2.length)]
							+ name2[rnd.nextInt(name2.length)]; //0~8사이의 난수
			
			//성별(숫자 난수), 0이면 남자 1이면 여자
			gender = rnd.nextInt(2) ==0?"남자":"여자";
			
			//주소
			address = address1[rnd.nextInt(address1.length)]+" "
					+address2[rnd.nextInt(address2.length)]+ " "
							+address3[rnd.nextInt(address3.length)]+ " "
							+(rnd.nextInt(300)+100)+"번지";
			
			System.out.printf("%s(%d세, %s) %s\n", name, age, gender,address);
		}
		
		
	}

	private static void m1() {
		System.out.println(Math.random()); //0~1사이의 난수
		
		Random rnd = new Random();
		
		System.out.println(rnd.nextDouble()); //0~1사이의 난수
		System.out.println(rnd.nextInt()); //-21억 ~ +21억 사이의 난수
		System.out.println(rnd.nextInt(10)); //0~9까지의 난수 (10미만의 난수)
		
	}
}//class













