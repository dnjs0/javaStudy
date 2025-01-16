package myTest;

public class test53 {
	public static void main(String[] args) {
		
		for(int l=0; l<5; l+=4) {
			for(int n =1; n<10; n++) {
				for(int m =2; m<6;m++) {
					System.out.printf("%d x %d = %d\t",(m+l), n, n*(m+l));
				}
				System.out.println();
			}
			System.out.println();
		}

		
	}//main

}
