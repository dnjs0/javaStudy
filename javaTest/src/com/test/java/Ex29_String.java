package com.test.java;

import java.util.Scanner;

public class Ex29_String {
	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m13();
//		m14();
		m15();
		
		
		
	}//main

	private static void m15() {

		//문자열 분리
		String txt = "홍길동,아무개,라라라,호호호,후후후";
		String[] list = txt.split(","); //구분자는 사라짐
		
		for(int i = 0; i<list.length; i++) {
			System.out.printf("%d : %s\n",i,list[i]);
		}
		
		// | 는 \\넣어야 구분자가 될 수 있다
		String text = "아무개|홍길동";
		String[] list2 = text.split("\\|");
		for(int i = 0; i<list2.length; i++) {
			System.out.printf("%d : %s\n",i,list2[i]);
		}
		
	}

	private static void m14() {
		// 문자열 치환(바꾸기)
		// String replace(char old, char new);
		// String replace(String old, String new);
		
		String txt = "안녕하세요 홍길동입니다.";
		//홍길동-> 아무개
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String content = "게시판 글쓰기 입니다. 바보~";
		String stop = "바보";
		System.out.println(content.replace("바보", "**"));
		
		
		//모든 공백 없애기
		txt = "      하나            둘       셋      ";
		System.out.println(txt.trim()); //하나            둘       셋
		System.out.println(txt.replace(" ", "")); //하나둘셋
		
		txt ="오늘은 자바 메서드 수업입니다.";
		String word = "자바메서드"; //공백 다 없애고 찾기
		
		if (txt.replace(" ","").contains(word.replace(" ", ""))) {
			System.out.println("발견");
		}else {
			System.out.println("발견못함");
		}

		
	}

	private static void m13() {
		// 문자열 검색
		//int indexOf, int lastIndexOF
		//boolean contains(String s)
		
		String txt = "안녕하세요 홍길동입니다.";
		 if(txt.indexOf("홍길동")>-1) {
			 System.out.println("찾음");
		 }else {
			 System.out.println("못 찾음");
		 }
		 
		 if (txt.contains("홍길동")) {
			 System.out.println("찾음");
		 }
		
		
	}

	private static void m11() {
		// 문자열 추출
		//char charAt(int index)
		
		String txt = "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3,5)); //라마
		System.out.println(txt.substring(3));	//라마바사아자차카타파하
		
		System.out.println(txt.charAt(3)); //'라' > 문자코드 환산 가능
		System.out.println((int)txt.charAt(3)); //46972
		
		System.out.println(txt.substring(3,4)); //"라" >문자코드 환산 불가능
		System.out.println((int)txt.substring(3,4).charAt(0)); //46972
		
		//주민등록번호
		String jumin = "981217-2234567";
		//성별?
		System.out.println(jumin.charAt(7)=='1'?"남자":"여자");
		System.out.println(jumin.substring(7,8).equals('1')?"남자":"여자");
		
		//몇년생?
		System.out.println(jumin.charAt(0)+jumin.charAt(1)); //113 -> 문자코드값을 구한것
		System.out.println(""+jumin.charAt(0)+jumin.charAt(1)); //98
		System.out.println(jumin.substring(0,2));//98
		
		//몇월생?
		System.out.println(jumin.substring(2,4));//98
		
		//며칠생?
		System.out.println(jumin.substring(4,6));//98
		System.out.println();
		
		
		
		//수업중 예제
		//C:\class\code\java\javaTest\src\Ex29_String.java
		
		String path = "C:\\class\\code\\java\\javaTest\\src\\Ex29_String.java";
		
		//파일명 추출 > Ex29_String.java, 마지막에 있는 \ 찾기
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index+1);
		System.out.println(filename); //Ex29_String.java
		
		//파일명에서 확장자 없이 추출 > Ex29_String.java
		index = path.lastIndexOf("\\");
		int lastindex = path.lastIndexOf(".");//파일명에 '.'이 허용되기때문에 lastIndex로 찾아야함
		filename = path.substring(index+1,lastindex);
		System.out.println(filename); //Ex29_String
		
		//확장자만 추출
		index = path.lastIndexOf(".");
		filename = path.substring(index+1);
		System.out.println(filename); //java
		
	}

	private static void m10() {
		// 패턴 검색
		//boolean startsWith(String word)
		//boolean endsWith(String word)
		
		String input = "홍길동";
		
		//이름 : 홍 씨 인지
		System.out.println(input.startsWith("홍")); //true
		System.out.println(input.charAt(0)=='홍'); //true
		System.out.println(input.indexOf('홍')==0);//true
		
		//'동'으로끝나는지?
		System.out.println(input.endsWith("동")); //true
		System.out.println(input.charAt(input.length()-1)=='동'); //true
		System.out.println(input.indexOf('동')==input.length()-1);//true
		
		//파일이 자바소스인가? > 확장자가 ".java"인지 확인
		String filename = "Ex29_String.java";
		if(filename.endsWith(".java")) {
			System.out.println("자바소스");
		}else {
			System.out.println("다른 소스의 파일");
		}
		
		
	}

	private static void m9() {
		// 문자열 대소문자
		 String content = "오늘 수업은 Java 입니다.";
		 String word = "java";
		 
		 //메서드 체이닝
		 //문자열.메서드().메서드
		 if(content.toUpperCase().indexOf(word.toUpperCase())>-1) {
			 System.out.println("검색 결과 o");
		 }else {
			 System.out.println("검색 결과 x");
		 }
		
	}

	private static void m8() {
		// 게시판 글쓰기 > 금지어
		
		String stop = "바보"; //금지어, stop word
		String content = "안녕하세요 저는 자바를 배우는 학생입니다.";
		
		if(content.indexOf(stop)>-1) {//0이상이면 발견됨!
			System.out.println("금지어 쓰지마세요");
		}else {
			System.out.println("글쓰기 진행시켜");
		}
		
		
		String[] stopList = {"바보", "멍청이", "메롱"};
		content = "메롱 저는 자바를 공부하는 학생입니다.";
		
		for(int i = 0; i<stopList.length; i++) {
			if(checkStopword(stopList[i],content)) {
				System.out.println("금지어 발견!!");
				break;
			}
		}
		System.out.println("종료");
	}

	private static boolean checkStopword(String stop, String content) {
		
		if(content.indexOf(stop)>-1) {
			return true;
		}
		
		return false;
	}

	private static void m7() {
		//문자열 검색
		String txt = "안녕하세요 홍길동입니다.";
		
		int index = -1; //초기화를 -1로 함
		index = txt.indexOf('하');
		System.out.println(index); //2
		
		index = txt.indexOf('홍');
		System.out.println(index); //6
		
		index = txt.indexOf('프');
		System.out.println(index); //-1
		
		index = txt.indexOf("홍길동");
		System.out.println(index); //6
		
		txt = "안녕하세요 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요 홍길동입니다.";
		index = txt.indexOf("홍길동",10);
		System.out.println(index); //21
		
		index = txt.indexOf("홍길동",index+"홍길동".length());
		System.out.println(index); //36
		
		index = txt.indexOf("홍길동",index+"홍길동".length());
		System.out.println(index); //36
		
	}

	private static void m6() {
		String txt = "      하나     둘                    셋";
		System.out.println(txt);//      하나     둘                    셋
		System.out.println(txt.trim());//하나     둘                    셋
		
	}

	private static void m5() {
		// 영어소문자만 입력
		//검사하는 구문을 별도의 메서드로 만든다.
		Scanner scan = new Scanner(System.in);
		System.out.print("단어 : ");
		String word = scan.nextLine();
		
		if(checkLowerCase(word)) {
			System.out.println("올바른 단어");
		}else {
			System.out.println("올바르지 않은 단어");
		}
		
	}

	private static boolean checkLowerCase(String word) {
		// 영어 소문자면 true 소문자가 아니면 false
		
		for(int i =0;i<word.length(); i++) {
			char c = word.charAt(i);
			
			if(c<'a'|| c>'z') { //소문자가 아님
				return false;
			}
		}
		
		return true;
	}

	private static void m4() {
		// 단어(아이디)입력
		//영어 소문자만
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어 : ");
		String word = scan.nextLine();
		
		boolean result = false;
		
		for(int i =0; i<word.length(); i++) {
			char c = word.charAt(i);
//			System.out.println(c);
			
			//***유효성 검사는 잘못된 것을 찾는 조건을 만든다.***
			if(c <'a'||c>'z') {
				System.out.println("소문자가 아닙니다!");
				result = true;
				break;
			}
			
		}
		
		if(!result) {
			System.out.println("올바른 단어");
		}else {
			System.out.println("올바르지 않은 단어");
		}
		
	}

	private static void m3() {
		// 주민등록번호 입력
//		ex)971130-1234567
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요('-'필수) : ");
		String jumin = scan.nextLine();
		
		if(jumin.charAt(6) =='-') {
			System.out.println("올바른 주민등록번호");
		}else {
			System.out.println("올바르지 않은 주민등록번호");
		}
		
	}

	private static void m2() {
		// 문자열 추출
		String txt = "안녕하세요 홍길동입니다."; //0부터 13까지 \
		
		char c = txt.charAt(0);//안
		System.out.println(c);

		c = txt.charAt(10);
		System.out.println(c); //니

		c = txt.charAt(txt.length()-1);//마지막 문자
		System.out.println(c); //.
		
	}

	private static void m1() {
		
		String s1 = "홍길동";
		String s2 = new String("홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		String txt = "홍길동";
		System.out.println(txt.length()); //3
		System.out.println("홍길동".length()); //3
		System.out.println("홍ㅇㄹ )$".length()); //3
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 : ");
		String statement = scan.nextLine();
		
		System.out.printf("%s >> %d문자\n",statement, statement.length());
		System.out.println();
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		if(name.length() >= 2 &&name.length()<=5) {
			System.out.println("서버전송");
		}else {
			System.out.println("ㅇㅣ름 정확히 입력하세요");
		}
		
		
	}
}
