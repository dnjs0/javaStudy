package myTest;

public class test17 {
	public static void main(String[] args) {
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
		
		
	}//main

	private static void position(String string, String string2, String string3, String string4) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s",string, string2, string3, string4);
		
	}

	private static void position(String string, String string2, String string3) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n\n",string, string2, string3);
		
	}

	private static void position(String string, String string2) {
		System.out.printf("사원 : %s\n대리 : %s\n\n",string, string2);
	}

	private static void position(String string) {
		System.out.printf("사원 : %s\n\n",string);
		
	}

}
