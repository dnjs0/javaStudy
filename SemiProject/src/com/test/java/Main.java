package com.test.java;

import java.util.List;

//개발 문서(Documentation)
//- 작성한 코드에 대한 기술 설명서
//- 개발 문서 > 문서화 도구 사용 생성
//- JDK > javadoc.exe

//자바 주석
//1. 단일 라인 주석
//2. 다중 라인 주석 /* */
//3. 문서 주석

/*
	
	버전
	- X.X.X
	- major.minor.patch
	- major: 판올림. 하위 호환성 지원 안하는 경우도 포함
	- minor: 기능 추가. 기능 변화
	- patch: 오류 수정, 보안 패치 등. 자잘한 기능 수정
	
	
	문서 주석의 대상
	- 접근 지정자: public, protected
	1. 클래스
	2. 멤버 변수
	3. 멤버 메서드
	
	
	문서 주석의 역할
	1. 개발 문서를 만드는 역할
	2. IDE에서의 도움말 역할

*/

/**
 * 메인 클래스입니다.
 * 
 * @author 홍길동
 * @version 0.0.1
 * 
 */
public class Main {
	
	/**
	 * 사이트에서 관리하는 회원 리스트입니다.
	 */
	public static List<String> userList;
	
	/**
	 * 사이트에서 관리하는 게시판의 목록입니다.
	 */
	public static List<String> boardList;
		
	/**
	 * 메인 메서드입니다.
	 * @param args
	 */
	public static void main(String[] args) {
		
		BoardService service = new BoardService();
		
	}

}











