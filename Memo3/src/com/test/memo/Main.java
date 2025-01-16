package com.test.memo;

import java.util.Scanner;

import com.test.memo.repository.MemoDAO;
import com.test.memo.service.MemoService;
import com.test.memo.view.MemoView;

public class Main {
	
	
	
	public static void main(String[] args) throws Exception {
		
		MemoDAO.load();
		
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		
		while (loop) {		
			MemoView.mainMenu();
			
			String sel = scan.nextLine();
			
			if (sel.equals("1")) {
				MemoService.add();
				MemoView.pause();
			} else if (sel.equals("2")) {
				MemoService.read();
				MemoView.pause();
			} 
			else {
				loop = false;
			}//if
			
		}//while
		
		MemoView.end();
		
		MemoDAO.save();
		
	}//main


}






























