package myTest;

public class test09 {
	public static void main(String[] args) {
		
		String result1 = getName("홍길동");
		System.out.printf("고객: %s\n", result1);

		String result2 = getName("아무개");
		System.out.printf("고객: %s\n", result2);
		
	}//main
	
	public static String getName(String name) {
		String result =name +"님"; 
		return result;
	}
	


}
