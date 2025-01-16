package myTest;

public class test41 {
	public static void main(String[] args) {
		int sum = 0;
		boolean loop = true;
		int i = 1;
		
		while(loop) {
			System.out.printf("%d + ",i);
			sum += i;
			i ++;
			if(sum>1000) {
				System.out.println("= " +sum);
				break;
			}
			
		}
		
	}

}
