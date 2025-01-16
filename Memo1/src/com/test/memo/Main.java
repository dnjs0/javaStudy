package com.test.memo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	
	//모든 디능에 공통으로 사용되는 사용 경로
	private final static String PATH;
	
	
	static {
		PATH = ".\\data\\memo.txt";
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		
		
		while(loop) {
			System.out.println("============================================");
			System.out.println("                  메모장");
			System.out.println("============================================");
			System.out.println("1. 메모쓰기");
			System.out.println("2. 메모읽기");
//			System.out.println("3. 메모수정");
//			System.out.println("4. 메모삭제");
			System.out.println("5. 종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("선택 : ");
			String sel = scan.nextLine();

			if(sel.equals("1")) {
				//메모쓰기
				add();
				pause();
			}else if(sel.equals("2")) {
				//메모읽기
				read();
				pause();				
//			}else if(sel.equals("3")) {
//				//메모수정
//				edit();
//				pause();
//			}else if(sel.equals("4")) {
//				//메모삭제
//				remove();
//				pause();
			}else {
				//종료
				loop = false;
			}//if
		}//while
		
		System.out.println();
		System.out.println("메모장을 종료합니다.\n");
		
		
		
	}//main

	private static void pause() {
		//한턴 쉬기
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		System.out.println("메뉴로 돌아가려면 엔터를 입력하세요");
		scan.nextLine();
		
	}

	private static void add() throws Exception {
		// 메모쓰기 > 순서 생각해보기
		//1. 컨텍스트 > 제목 출력 
		//2. 사용자에게 메모를 입력받기
		//3. 파일 쓰기
		
		//1.
		System.out.println("--------------------------------------------");
		System.out.println("                  메모쓰기");
		System.out.println("--------------------------------------------");
		
		//2.
		//1●홍길동●메모입니다.●2025-01-02 12:05:40
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String memo = "";
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		
		
		System.out.println();
		
		
		System.out.print("적을 내용 : ");
		memo = scan.nextLine();
		System.out.println();
		
		//3. 
		Calendar now = Calendar.getInstance();
		String regdate = String.format("%tF %tR", now, now);
		
		String seq = getMaxSeq();
//		System.out.println(seq); 4
		
		//파일쓰기 > memo.txt > 새로운 메모를 추가
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true));
		
		writer.write(String.format("%s●%s●%s●%s\r\n", seq,name, memo, regdate));
		
		writer.close();
		
		System.out.println();
		System.out.println("메모쓰기가 완료되었습니다."
				+ "");
	}

	private static String getMaxSeq() throws Exception {
		//파일 읽기 > memo.txt > 마지막 메모의 seq +1 반환
		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		String line = null;
		String temp = null;
				
		while((line = reader.readLine()) != null) {
//			System.out.println(line);
			temp = line;
		}
//		System.out.println(temp); //막줄
		
		reader.close();
		
		return Integer.parseInt(temp.split("●")[0])+1+"";//새로운 메모의 번호

	}

	private static void read() throws Exception {
		// 메모 읽기
		//1. 컨텍스트 > 제목 출력
		//2. 파일 읽기
		//3. 출력
		
		//1
		System.out.println("--------------------------------------------");
		System.out.println("                  메모읽기");
		System.out.println("--------------------------------------------");
		
		System.out.println();
		System.out.println("[번호]\t[이름]\t[날짜]\t\t\t[메모]");
		
		//2
		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		
		String line = null;
		while((line = reader.readLine())!= null) {
			
			//3.
			//1●홍길동●메모입니다.●2025-01-02 12:05:40
			String[] temp = line.split("●");
			
//			System.out.println(Arrays.toString(temp));
			
			System.out.printf("%5s\t%s\t%s\t%s\n",temp[0],temp[1], temp[3],temp[2]);
			
		}
		
		reader.close();
		
		System.out.println();
		System.out.println("메모읽기가 완료되었습니다.");
		
		//메모 읽기 > 선택(수정, 삭제, 귀환)
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("선택(1. 수정, 2. 삭제, 3. 메뉴) : ");
		
		String sel = scan.nextLine();
		
		if(sel.equals("1")) {
			edit();
			pause();
		}else if(sel.equals("2")) {
			remove();
			pause();
		}else {
			//메인메뉴로 이동
		}
		
		
		
	}

	private static void edit() throws Exception{
		// 메모수정
		//1. 컨텍스트 > 제목 출력
		//2. 사용자에게 수정할 메모 번호 입력
		//3. 파일 읽기(선택메모)
		//4. 출력(기존 내용)
		//5. 수정내용 > 입력
		//6. 파일 수정
		
		Scanner scan = new Scanner(System.in);
		
		//1.
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("                  메모수정");
		System.out.println("--------------------------------------------");
		System.out.println("수정을 원치 않으면 엔터를 입력하세요");
		
		//2.
		System.out.print("번호 : ");
		String seq = scan.nextLine();
		System.out.println();
		
		//5
		String name= "";
		String memo = "";
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		
		
		System.out.println();
		
		
		System.out.print("적을 내용 : ");
		memo = scan.nextLine();
		System.out.println();
		
		//3. 
//		Calendar now = Calendar.getInstance();
//		String regdate = String.format("%tF %tR", now, now);
		
		
		//6 내용 수정
		 //파일 입출력 > 쓰기. 읽기,내용 수정?, 내영 삭제하기?
		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		
		String line = null;
		String editText = "";//누적변수
		while((line= reader.readLine())!= null) {
			String[ ] temp = line.split("●");
			String temp2 =  "";
			
			if(temp[0].equals(seq)) {
				//수정대상 메모
				temp2 += temp[0];
				temp2 += "●";
				if(name.equals("")) {
					
					temp2 += name;
				}else {
					temp2 += name; //수정함
				}
				temp2 += "●";
				
				if(memo.equals("")) {
					
					temp2 += temp[2];
				}else {
					temp2 += memo;
				}
				
				temp2 += "●";
				
				temp2 += temp[3];
				temp2 += "\r\n";
				
			}else {
				
				//상관없는 메모
				temp2 = line +"\r\n";
			}
//			System.out.println(temp2);
			editText += temp2;
			
			
		}
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
		
		writer.write(editText);
		
		writer.close();
		
	}

	private static void remove() throws Exception {
		// 메모삭제 > 순서?
		//1. 컨텍스트 > 제목 출력
		//2. 번호 입력
		//3. 파일 읽기 > 2번 메모만 제외 > 나머지 내용으로 파일 덮어쓰기
		
		Scanner scan = new Scanner(System.in);
		
		//1.
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("                  메모삭제");
		System.out.println("--------------------------------------------");
		System.out.println("삭제를 원치 않으면 엔터를 입력하세요");
		
		//2.
		System.out.print("번호 : ");
		String seq = scan.nextLine();
		System.out.println();
		
		
		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		
		String line = null;
		String editText = "";//누적변수
		while((line= reader.readLine())!= null) {
			String[ ] temp = line.split("●");
			if(temp[0].equals(seq)) {
				//삭제할 메모
				
			}else {
				//보존할 메모
				editText += line;
			}
		}//while
		
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
		
		writer.write(editText);
		
		writer.close();
		
	}
}//class
