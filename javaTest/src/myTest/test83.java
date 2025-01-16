package myTest;

import java.util.Scanner;

public class test83 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		
		for(int i =0; i<10; i++) {
			System.out.print("파일명 :");
			String file = scan.nextLine();
			int index = file.lastIndexOf(".");
			if(file.substring(index+1).equals("mp3")) {
				mp3++;
			}else if(file.substring(index+1).equals("jpg")) {
				jpg++;
			}else if(file.substring(index+1).equals("java")) {
				java++;
			}else if(file.substring(index+1).equals("hwp")) {
				hwp++;
			}else if(file.substring(index+1).equals("doc")) {
				doc++;
			}
		}
		System.out.printf("mp3 : %d개\n",mp3);
		System.out.printf("jpg : %d개\n",jpg);
		System.out.printf("java : %d개\n",java);
		System.out.printf("hwp : %d개\n",hwp);
		System.out.printf("doc : %d개\n",doc);
		
	}//main

}
