package com.test.memo.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.test.memo.domain.Memo;

//데이터 담당
public class MemoDAO {
	
	
	//모든 기능 공통 > 파일 경로
	private final static String PATH;
	
	//memo.txt > (대신) > 컬렉션
	public static ArrayList<Memo> mlist;
	
	static {
		PATH = ".\\data\\memo.txt";
		mlist = new ArrayList<>();
	}
	
	
	public static void load() throws Exception {
		
		//memo.txt > ArrayList<Memo>
		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		
		String line = null;
		
		while ((line = reader.readLine()) != null) {
			
			//line = "1●홍길순●수정된 메모입니다.●2025-01-02 12:05:40"
			// > Memo 객체
			String[] temp = line.split("●");
			
			Memo memo = new Memo(temp[0], temp[1], temp[2], temp[3]);
			mlist.add(memo);
			
		}
		
		reader.close();
		
	}
	
	public static void save() throws Exception {
		
		//ArrayList<Memo> > memo.txt
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
		
		for (Memo memo : mlist) {
			
			writer.write(String.format("%s●%s●%s●%s\r\n"
							, memo.getSeq()
							, memo.getName()
							, memo.getMemo()
							, memo.getRegdate()));
			
		}
		
		writer.close();	
		
	}
	
}
