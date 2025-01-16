package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex62_File {
	public static void main(String[] args) {
		
	//	m1();	
	//	m2();
	//	m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9(); 성적표
//		m10();
		m11(); //성적표 성적순 정렬
		
	}//main

	private static void m11() {
		System.out.println("=======================================================");
		System.out.println("                        성적표");
	
		System.out.println("=======================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		try {
			//File dir = new File("."); //현재 폴더 참조 객체
			//System.out.println(dir.getAbsolutePath()); //현재 위치 알려줌
													// C:\class\code\java\javaTest\.
			
			//컬렉션 == score.txt
			ArrayList<Score> list = new ArrayList<Score>();
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\data\\score.txt"));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
//				System.out.println(line);
				//1,홍길동,100,90,80 > 하나씩 쪼개기 : 파싱하기
				
				String[] temp = line.split(",");
				String no = temp[0];
				String name = temp[1];
				int kor = Integer.parseInt(temp[2]);
				int eng = Integer.parseInt(temp[3]);
				int math = Integer.parseInt(temp[4]);
				
				//1회전 == 텍스트 1줄 == 한사람 == Score객체 1개
				Score s = new Score(no,name,kor,eng,math);
				list.add(s);
				
//				int total = kor+eng+math;
//				double avg = total/3.0;
//				System.out.printf("%5s\t",no);
//				System.out.printf("%3s\t",name);
//				System.out.printf("%5d\t",kor);
//				System.out.printf("%5d\t",eng);
//				System.out.printf("%5d\t",math);
//				System.out.printf("%5d\t",total);
//				System.out.printf("%5.1f\t",avg);
//				System.out.println();
				
			}//while
			
			reader.close();

//			System.out.println(list);
			//성적순으로 정렬하기
			Collections.sort(list,new Comparator<Score>(){

				@Override
				public int compare(Score o1, Score o2) {
//					return o2.getTotal()-o1.getTotal();
					return o2.getMath()-o1.getMath();
				}
				
			});
			
			//출력
			for(Score s :list) {
				System.out.printf("%5s\t",s.getNo());
				System.out.printf("%3s\t",s.getName());
				System.out.printf("%5d\t",s.getKor());
				System.out.printf("%5d\t",s.getEng());
				System.out.printf("%5d\t",s.getMath());
				System.out.printf("%5d\t",s.getTotal());
				System.out.printf("%5.1f\t",s.getAvg());
				System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void m10() {
		//Scanner > 읽기 도구
		try {
			File file = new File(".\\data\\score.txt");
			Scanner scan = new Scanner(file);
			
//			String line = scan.nextLine();
//			System.out.println(line);
			
			//scan.hasNextLine();//그다음거 읽을수 있는지 없는지 판단
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m9() {
		//  성적표
		//		- 성적 데이터 > score.txt
		
		
		//데이터 구조 설계(*****) > 데이터베이스 구조 설계(ERD)
		//	- 데이터 수집 	> 무슨 데이터 사용 or 저장
		//					> 이름, 국어, 영어,  수학, 총점, 평균
		//	- 데이터 구조화
		//		- CSV형태
		//		- 한줄 > 1개의 데이터 집합
		//		- 한줄내의 구분자(,) >  각 세부 데이터 저	장
		//	- 더미 or 테스트 데이터 생성
		
		//자원의 경로를 찾을때
		//1. 절대경로 > 기준점이 고정이 되어있다.
		//2. 상대경로 > 현재 위치를 기준점으로 삼는다.
		
		System.out.println("=======================================================");
		System.out.println("                        성적표");
	
		System.out.println("=======================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		try {
			//File dir = new File("."); //현재 폴더 참조 객체
			//System.out.println(dir.getAbsolutePath()); //현재 위치 알려줌
													// C:\class\code\java\javaTest\.
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\data\\score.txt"));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
//				System.out.println(line);
				//1,홍길동,100,90,80 > 하나씩 쪼개기 : 파싱하기
				
				String[] temp = line.split(",");
				String no = temp[0];
				String name = temp[1];
				int kor = Integer.parseInt(temp[2]);
				int eng = Integer.parseInt(temp[3]);
				int math = Integer.parseInt(temp[4]);
				
				int total = kor+eng+math;
				double avg = total/3.0;
				System.out.printf("%5s\t",no);
				System.out.printf("%3s\t",name);
				System.out.printf("%5d\t",kor);
				System.out.printf("%5d\t",eng);
				System.out.printf("%5d\t",math);
				System.out.printf("%5d\t",total);
				System.out.printf("%5.1f\t",avg);
				System.out.println();
				
			}
			
			
			reader.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m8() {
		// 
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("파일 명 : ");
			String filename = scan.nextLine();
			
			String path = "C:\\class\\code\\java\\javaTest\\src\\com\\test\\java\\" + filename;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1; //줄번호 표시
			
			while((line = reader.readLine()) != null ) {
				System.out.printf("%3d : %s\r\n",number, line);
				number++;
			}
			reader.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m7() {
		// 파일 쓰기 > FileWriter or BufferedWriter
		// 파일 읽기 > BufferedReader of Scanner
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\data3.txt"));
			
//			String line = reader2.readLine();
//			System.out.println(line);
//			line = reader2.readLine();
//			System.out.println(line);
//			line = reader2.readLine();
//			System.out.println(line); //읽을것이 없으면 null
			
			
			String line = null;
			
			while((line = reader2.readLine()) != null) {
				System.out.println(line);
			}
			
			
			reader2.close();
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void m6() {
		// 
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\data3.txt"));
			
			writer.write("안녕하세요.");
			writer.newLine();
			writer.write("ㅂ반갑습니다.");
			
			writer.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m5() {
		// FileOutputStream - FileInputStream
		// FileWriter - FileReader
		// BufferedWriter - BufferedReader
		
		//FileReader
		//	- 문자 단위 읽기(byte)
		
		try {
		
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data2.txt");
			
			int code = -1;
			
			while((code= reader.read()) != -1) {
				System.out.print((char)code);
			}
			reader.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m4() {
		// 콘솔 메모장 구현하기(쓰기)
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.printf("저장할 파일명 : ");
			String filename = scan.nextLine();

			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\"+filename);
			
			boolean loop = true;
			
			while(loop) {
				String line = scan.nextLine();
				if(line.equals("q!")) {
					break;
				}
				writer.write(line);
				writer.write("\r\n");
			}
			
			writer.close();
			System.out.println("파일 저장이 완료 되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void m3() {
		// 파일 쓰기
		// FileOutputStream > FileWriter
		//	1. 문자 단위 쓰기(2byte) > 한글 편하게 사용가능
		//	2. 문자열 쓰기 지원
		
		try {
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\data2.txt", true);
			writer.write("한글도 작성이 가능합니다.\n");
			writer.write("Hello");
			
			writer.close();
			System.out.println("종료");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		
		}
		
		
	}

	private static void m2() {
		// 파일 입출력
		//	- 파일 읽기(입력)
		//	- 
		String path = "C:\\class\\code\\java\\file\\data.txt";
		
		File file = new File(path);
		
		try {
			//읽기 스트림 생성
			FileInputStream stream = new FileInputStream(file);
			
//			int code = stream.read(); 맨 첫번째 글자 하나만 읽어옴
//			System.out.println((char)code);
			
			
			//루프 돌림(자주쓰는 패턴)
			int code = -1;
			
			while((code= stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			
			stream.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		// 파일 입출력
		//	- 파일 쓰기(출력)
		
		String path = "C:\\class\\code\\java\\file\\data.txt";
		
		File file = new File(path);
		
		//스트림 생성
		//	- 읽기 스트림
		//	- 쓰기 스트림
		try {
			
			//쓰기 스트림 생성 모드
			//	1. Create Mode(기본값) (file, false)거나 (file)
			//		- 기존 내용을 없애고 새로운 내용으로 덮어쓰기
			//		- 파일이 있으면 덮어쓰기를 하고 파일이 없으면 생성 후 쓰기
			//	2. Append Mode(file, true)
			//		- 기존 내용에 이어서 새로운 내용을 추가하기
			//		- 파일이 있으면 이어쓰기를 하고 없으면 생성 후 쓰기
			
			
			//스트림(객체) 생성 or 스트림 열었다. -> 꼭 ! 닫아야한다고 생각해라
			//FileOutputStream > 바이트 단위 쓰기(1byte) 
			//						> 한글은 2byte이므로 글자가 깨질 수 있다.
			FileOutputStream stream = new FileOutputStream(file, true);
			
			//기존것을 삭제하고 입력->덮어쓰기가 됨
//			stream.write((int)'A');//문자 코드
//			stream.write('B');//문자 코드
//			stream.write('C');//문자 코드
			
			String txt = "\nHello JAva!";
			
			for(int i=0; i<txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write(c);
			}
			
			stream.close();
			System.out.println("종료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		FileInputStream input;
		
	}

}//class 
