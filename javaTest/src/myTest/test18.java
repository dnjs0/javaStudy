package myTest;

public class test18 {
	public static void main(String[] args) {
		int count = 0;
		count = positive(10);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20, -30);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개\n",count);
		
		
		
	}//main

	private static int positive(int num1) {
		int count = 0;
		count = num1>0 ? count+1:count;
		return count;
	}
	private static int positive(int num1, int num2) {
		int count = 0;
		count = num1>0 ? count+1:count;
		count = num2>0 ? count+1:count;
		return count;
	}
	private static int positive(int num1, int num2, int num3) {
		int count = 0;
		count = num1>0 ? count+1:count;
		count = num2>0 ? count+1:count;
		count = num3>0 ? count+1:count;
		return count;
	}
	private static int positive(int num1, int num2, int num3, int num4) {
		int count = 0;
		count = num1>0 ? count+1:count;
		count = num2>0 ? count+1:count;
		count = num3>0 ? count+1:count;
		count = num4>0 ? count+1:count;
		return count;
	}
	private static int positive(int num1, int num2, int num3, int num4, int num5) {
		int count = 0;
		count = num1>0 ? count+1:count;
		count = num2>0 ? count+1:count;
		count = num3>0 ? count+1:count;
		count = num4>0 ? count+1:count;
		count = num5>0 ? count+1:count;
		return count;
	}
	

}
