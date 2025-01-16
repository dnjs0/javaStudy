package com.test.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex61_file {
	
	private static int fileCount; //파일 개수를 셀 누적 변수
	//static을 쓰는 이유  :m14()메서드가 static이기 때문 !
	private static int dirCount;
	private static int dirSize;
	
	
	static {
		fileCount = 0;
		dirCount = 0;
		dirSize=0;
	}
	
	public static void main(String[] args) {
		
		/**
		 * 1. 파일 / 디렉토리  조작
		 * 	- 탐색기로 하는 행동
		 * 
		 * 
		 * 2. 파일 > 입출력 (저장하는것 : 입력, 꺼내서 보여주는것 : 출력)
		 *	- 메모장 
		 * 
		 * 파일 입출력
		 * 	- 자바 프로그램 <- (데이터) -> 보조기억장치(HDD,SDD)
		 * 	-                   인코딩  ->          : 쓰기(저장, 출력)
		 * 	                    디코딩  <-          : 읽기(입력)
		 * 
		 * 저장장치
		 * 	- 데이터 0, 1 저장
		 * 	- 데이터 자료형 없음
		 * 
		 * 인코딩, Encoding
		 * 	- 문자 코드(응용 프로그램의 데이터)를 부호화(0,1) 시키는 작업
		 * 	- 자바 프로그램("홍길동",String) > 텍스트파일(0110101010101)
		 * 
		 * 디코딩, Decoding
		 * 	- 부호화 된 데이터를 문자코드로 변환하는 작업
		 * 	- 텍스트파일(0110101010101) > 자바 프로그램("홍길동",String)
		 * 
		 * 인코딩 디코딩 규칙
		 * 	- 저장 장치(네트워트)에서 데이터를 표현하는 규칙
		 * 	- 
		 * 	1. ANSI
		 * 	2. UTF
		 * 		- UTF-8
		 * 		- UTF-16
		 * 	3. ISO-8859-1
		 * 	4. EUC-KR
		 * 	5. MS949
		 * 
		 * 	ANSI(ISO-8859-1, EUC-KR, MS949) -> 같음
		 * 		- 영어(숫자, 특수문자 > ASCII(0~255)) : 1byte
		 * 		- 한글(한자, 일본어 등)  : 2byte
		 * 	
		 * 	UTF-8
		 * 		- 영어 : 1byte
		 * 		- 한글 : 3byte
		 * 
		 * 	UTF-16
		 * 		- 영어 : 2byte
		 * 		- 한글 : 2byte
		 * 
		 * 
		 * 파일 > 정보
		 * C:\class\code\java\file\data.txt
		 * 
		 * 자바 프로그램에서 외부 파일에 접근
		 * 1. 외부 파일을 참조하는 객체를 생성 > 중계인, 대리자
		 * 2. 참조 객체 조작 > 실제 파일을 대상 진행
		 * 
		 * 
		 */
		
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
//		m12();
//		m13();
//		m14(); 모르면 안됨,,,,,,,
		
	}//main
	//static인 이유->메인메서드가 static이기 때문이다.
	//정적 메서드에서는 this못씀
	private static void m14() {
		//크기 : 796,204,288 바이트
		//파일 : 13,804
		//풀더 : 2,537
		//재귀호출
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			count(dir);
			System.out.printf("총 파일의 개수 : %,d개\n",fileCount);
			System.out.printf("총 폴더의 개수 : %,d개\n",dirCount);
			System.out.printf("폴더의 크기 : %,d바이트 \n",dirSize);
		}
		
	}
	public static void count(File dir) {
		dirCount++;//메서드 호충당 폴더
		
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 해당 목록에서 파일만 추출해서 개수 세기
		for(File file : list) {
			if(file.isFile()) {
				fileCount++;
				dirSize += file.length();
			}
		}
		
		//3. 목록에서 자식 폴더를 찾아 1~3번을 반복한다.
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				count(subdir);
			}
		}
	}

	private static void m13() {
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		//크기 : 796,204,288 바이트
		//파일 : 13,804
		//풀더 : 2,537
		
		//재귀호출
		int count = 0; //파일 개수를 셀 누적 변수
		
		if(dir.exists()) {
			File[] list = dir.listFiles();
			for (File file : list) {
				if(file.isFile()) {
					count++;
				}
			}
			
			for(File subdir : list) {
				if(subdir.isDirectory()) {//너 폴더니?
					File[] sublist = dir.listFiles();
					for(File subfile : sublist) {
						if(subfile.isFile()) {
							count++;
						}
					}
					
					for(File subsubdir: sublist) {
						if(subsubdir.isDirectory()) {
							File[] subsublist = subsubdir.listFiles();
							
							for(File subsubfile : subsublist) {
								if(subsubfile.isFile()) {
									count++;
								}
							}
						}
					}
				}
			}
			System.out.printf("총 파일의 개수 : %,d개\n",count);
		}
		
		
	}

	private static void m12() {
		// ***자주 사용
		// 특정 폴더의 내용물 보기
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			//폴더의 내용물 > 자식(파일, 폴더)들의 이름들 변환
			//1. 방법
//			String[] list = dir.list();
//			
//			for(String item : list) {
//				
//				File file = new File(path + "\\"+item);
//				
//				System.out.println(item+" : "+file.isFile()); //false 면 폴더다! true 면 파일이다!
//			}
			
			//2. 방법
			//위 코드와 같은 내용 출력 -> 밑 코드를 더 많이 쓴다.
//			File[] list = dir.listFiles();
//			for(File item : list) {
//				System.out.println(item.getName()+" : "+item.isFile());
//			}
			
			//3. 방법
			File[] list = dir.listFiles();
			
			for(File item : list) {
				if(item.isDirectory()) { //폴더면 출력
					System.out.printf("📂 %s\n",item.getName());
				}
			}
			
			for(File item : list) {
				if(item.isFile()) { //폴더면 출력
					System.out.printf("🏄‍♂️ %s\n",item.getName());
				}
			}
			
		}
		
		
	}

	private static void m11() {
		
		File dir = new File("C:\\class\\code\\java\\file\\aaa");
		System.out.println(dir.delete());	//비어있는 폴더만 지울 수 있다.
		
	}

	private static void m10() {
		// 폴더명 수정 or 폴더 이동
		// - renameTo
		File dir = new File("C:\\class\\code\\java\\file\\일정");
		File dir2 = new File("C:\\class\\code\\java\\file\\schedule");
		
		System.out.println(dir.renameTo(dir2));
		
	}

	private static void m9() {
		//요구사항] 일정관리 > 날짜별 폴더 생성 
		// > [2025-01-01] ~ [2025-12-31]
		
		Calendar c = Calendar.getInstance();
		c.set(2025,0,1);
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR)); //1년이 며칠인지
		for(int i=0; i<c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			String name = String.format("%tF", c);
			System.out.println(name);
			//C:\class\code\java\file\일정
			File dir = new File("C:\\class\\code\\java\\file\\일정\\"+name);
			dir.mkdir();
			c.add(Calendar.DATE, 1);//누적
		}
		
		
	}

	private static void m8() {
		// 요구사항] 회원 > 회원명으로 폴더 만들기
		String[] member = {"홍길동","아무개","강아지","병아리","고양이"};
		String path = "C:\\class\\code\\java\\file\\회원";
		
		for(String name:member) {
			//회원\[개인폴더]홍길동님
			//회원\[개인폴더]아무개님
			File dir = new File(path + "\\[개인폴더]"+name+"님");
			System.out.println(dir.mkdir());
		}
	}

	private static void m7() {
		// 폴더 생성
		String path = "C:\\class\\code\\java\\file\\aaa";
		File dir = new File(path);
		if(!dir.exists()) {
			boolean result = dir.mkdir();
			System.out.println(result);
			
		}else {
			System.out.println("같은 이름의 폴더가 존재함");
		}
		
	}

	private static void m6() {
		// 파일 삭제	
		//	-보통 삭제 : 휴지통으로 이동
		//	- 자바 삭제 : 완전 삭제
		String path = "C:\\class\\code\\java\\move\\회원.txt";
		File file = new File(path);
		
		if(file.exists()) {
			boolean result =file.delete();
			System.out.println(result);
		}
		
	}

	private static void m5() {
		//파일 이동
		String path = "C:\\class\\code\\java\\file\\member.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\move\\회원.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
		
		
	}

	private static void m4() {
		// 파일명 수정
		//	- member.txt > 회원.txt
		//	- file.renameTo(file) -> file 객체 두개를 만들어야한다.
		
		//수정하려는 파일
		String path = "C:\\class\\code\\java\\file\\member.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\file\\회원.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
	}

	private static void m3() {
		// 파일 조작 : 생성, 복사(x), 이동, 파일명 수정, 삭제
		
		//새 파일 만들기 > 희망경로 적기
		String path = "C:\\class\\code\\java\\file\\member.txt";
		
		File file = new File(path);
		
//		System.out.println(file.exists());
		
		try {
			boolean result = file.createNewFile(); //동일한 이름의 파일이 있으면 동작을 하지 않는다.
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		//폴더 > 정보
		//	- 폴더는 파일이다.
		
		
		//폴더경로
		String path = "C:\\class\\code\\java\\file";
		
		//폴더 참조 객체
		File dir = new File(path);

		if(dir.exists()) {
			//폴더의 정보 확인
			System.out.println(dir.getName());			//data.txt
			System.out.println(dir.isFile());			//false
			System.out.println(dir.isDirectory());		//true
			System.out.println(dir.length());			//4096 > 무시
			System.out.println(dir.getAbsolutePath());	//C:\class\code\java\file.txt
			System.out.println(dir.lastModified());		//1735189365272, 1970년 기준으로 몇ms 
			System.out.println(dir.isHidden());			//false, 파일이 숨긴 파일이냐?
			System.out.println(dir.canRead());			//true
			System.out.println(dir.canWrite());			//true
			System.out.println(dir.getParent());		//C:\class\code\java
		}else {
			System.out.println("폴더가 존재하지 않습니다.");
		}
		
		
	}

	private static void m1() {
		//실제 파일 경로
		String path = "C:\\class\\code\\java\\file\\data.txt";
		
		//파일 참조 객체
		File file = new File(path);
		
		System.out.println(file != null);
		System.out.println(file);
		System.out.println(file.exists());
		System.out.println();
		
		if(file.exists()) {
			//파일의 정보 확인
			System.out.println(file.getName());			//data.txt
			System.out.println(file.isFile());			//true
			System.out.println(file.isDirectory());		//false
			System.out.println(file.length());			//16바이트 "안녕하세요." 3x5+1
			System.out.println(file.getAbsolutePath());	//C:\class\code\java\file\data.txt
			System.out.println(file.lastModified());	//1735189371228, 1970년 기준으로 몇ms 
			//unix > 년월일시분초
			Calendar c1 = Calendar.getInstance();
			c1.setTimeInMillis(file.lastModified());
			System.out.printf("%tF %tT\n",c1,c1);
			
			System.out.println(file.isHidden());		//false, 파일이 숨긴 파일이냐?
			System.out.println(file.canRead());			//true
			System.out.println(file.canWrite());		//true
			System.out.println(file.getParent());		//C:\class\code\java\file
		}else {
			System.out.println("data.txt가 없습니다.");
		}
		
		
	}
}//class
