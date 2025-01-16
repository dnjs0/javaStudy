package com.test.memo.service;

import java.util.Calendar;
import java.util.Scanner;

import com.test.memo.domain.Memo;
import com.test.memo.repository.MemoDAO;
import com.test.memo.view.MemoView;

public class MemoService {
	
	public static void add() throws Exception {
		
		//메모쓰기 > 순서?
		//1. 컨텍스트 > 제목 출력
		//2. 사용자에게 입력
		//3. 파일쓰기
		
		//1.
		MemoView.subMenu("메모쓰기");
		
		//2.
		//1●홍길동●메모입니다.●2025-01-02 12:05:40
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String memo = "";
		
		System.out.print("이름: ");
		name = scan.nextLine();
		
		System.out.print("메모: ");
		memo = scan.nextLine();
		
		//3.
		Calendar now = Calendar.getInstance();
		String regdate = String.format("%tF %tT", now, now);
		
		String seq = getMaxSeq();
		//System.out.println(seq);
		
		//이전: 파일쓰기 > memo.txt > 새로운 메모를 추가
		//현재: 컬렉셜에 Memo 객체를 추가하기 > 새로운 메모를 추가
		MemoDAO.mlist.add(new Memo(seq, name, memo, regdate));
		
		System.out.println();
		System.out.println("메모쓰기가 완료되었습니다.");
		
	}

	private static String getMaxSeq() throws Exception {
		
		return Integer.parseInt(MemoDAO.mlist.get(MemoDAO.mlist.size()-1).getSeq()) + 1 + "";
	}

	public static void read() throws Exception {
		
		//메모읽기 > 순서?
		//1. 컨텍스트 > 제목 출력
		//2. 파일읽기
		//3. 출력
		
		//1.
		MemoView.subMenu("메모읽기");
		
		MemoView.list();
		
		System.out.println();
		System.out.println("메모읽기가 완료되었습니다.");
		
		//메모읽기 > 선택(수정,삭제,귀환)
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("선택(1.수정,2.삭제,3.메뉴): ");
		
		String sel = scan.nextLine();
		
		if (sel.equals("1")) {
			edit();
			MemoView.pause();
		} else if (sel.equals("2")) {
			remove();
			MemoView.pause();
		} else {
			//메인메뉴로 이동~
		}
		
	}//read()

	public static void edit() throws Exception {
		
		//메모수정 > 순서?
		//1. 컨텍스트 > 제목 출력
		//2. 사용자 > 수정 메모 번호 입력
		//3. 파일읽기(선택 메모)
		//4. 출력(기존내용)
		//5. 수정내용 > 입력
		//6. 파일수정
		
		Scanner scan = new Scanner(System.in);
		
		//1.
		System.out.println();
		MemoView.subMenu("메모수정");
		System.out.println("수정을 원하지 않는 값은 그냥 엔터를 입력하세요.");

		//2.
		System.out.print("번호: ");
		String seq = scan.nextLine();
		
		//5.
		//1●홍길동●메모입니다.●2025-01-02 12:05:40
		String name = "";
		String memo = "";
		
		System.out.print("이름: ");
		name = scan.nextLine(); //name = "";
		
		System.out.print("메모: ");
		memo = scan.nextLine(); //memo = "";
		
		//Calendar now = Calendar.getInstance();
		//String regdate = String.format("%tF %tT", now, now);
		
		//6.
		//수정할 메모 찾기
		for (Memo m : MemoDAO.mlist) {
			
			if (m.getSeq().equals(seq)) {
				
				//수정하려는 메모?
				if (!name.equals("")) {
					m.setName(name);
				}
				
				if (!memo.equals("")) {
					m.setMemo(memo);
				}
				
			}
			
		}
		
		
	}

	public static void remove() throws Exception {
		
		//메모삭제 > 순서?
		//1. 컨텍스트 > 제목 출력
		//2. 번호 입력
		//3. 파일읽기 > 2번 메모만 제외 > 나머지 내용 > 파일쓰기
		Scanner scan = new Scanner(System.in);
		
		//1.
		System.out.println();
		MemoView.subMenu("메모삭제");

		//2.
		System.out.print("번호: ");
		String seq = scan.nextLine();
		
		//3.
		for (Memo memo : MemoDAO.mlist) {
			if (memo.getSeq().equals(seq)) {
				MemoDAO.mlist.remove(memo);
				break;
			}
		}
		
	}

}
