package myTest;

public class test10 {
	public static void main(String[] args) {
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		
	}//main

	public static void digit(int num) {
		// TODO Auto-generated method stub
		System.out.printf(num/1000>0 ?"%d\n" :"%04d\n",num );
		
		
	}

}
