package com.test.java;

import java.util.Scanner;

/**
 * 게시판 주업무 클래스입니다.
 * 
 * @see http://google.com
 */
public class BoardService {
	
	private Scanner scan;
	private String type;
	private int count;
	
	/**
	 * 기본 생성자입니다.
	 */
	public BoardService() {
		
	}

	/**
	 * 매개변수를 가지는 생성자입니다.
	 * @param scan 게시물 작성을 위한 스캐너
	 * @param type 게시물의 종류(local, global)
	 * @param count 게시물에 관련된 수치. {@code count > 0}
	 */
	public BoardService(Scanner scan, String type, int count) {
		this.scan = scan;
		this.type = type;
		this.count = count;
	}
	
	/**
	 * 게시물을 작성합니다.
	 * @param content 글내용
	 */
	public void add(String content) {
		//글쓰기
	}
	
	/**
	 * 게시물을 열람합니다.
	 * @param seq 게시물 번호
	 * @return 해당 게시물 내용
	 * @throws Exception 존재하지 않은 게시물 번호
	 */
	public String get(int seq) throws Exception {
		
		//throws Exception: 예외 미루기
		//throw new Exception(): 사용자 예외 발생하기
		
		if (seq < 0) {
			
			throw new Exception();
		}
		
		return "게시물 내용";
	}
	
	/**
	 * 게시물을 수정합니다.
	 * @param seq 수정할 게시물 번호
	 * @param content 수정할 게시물 내용
	 * @return 수정 성공 유무(성공 true, 실패 false)
	 * 
	 * <pre>{@code
	 * public boolean edit(int seq, String content) {
	 * 		List<String> list;
	 * 		return true;
	 * }
	 * }
	 * </pre>
	 * 
	 */
	public boolean edit(int seq, String content) {
		//글 수정 > 성공 유무
		return true;
	}

}
















