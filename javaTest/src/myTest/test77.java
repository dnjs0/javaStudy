package myTest;

public class test77 {
	public static void main(String[] args) {
		
		int [][] nums =new int[5][5];
		int num=1;
		for(int i=0; i<5;i++) {
			int a = i;
			for(int j = 0; j<=i; j++) {
				nums[j][a]=num;
				a--;
				num++;
			}
			
		}
		
		for(int i=1; i<5;i++) {
			int a = 4;
			for(int j = i; j<5; j++) {
				nums[j][a]=num;
				a--;
				num++;
			}
			
		}
			
		
		//출력 : 항상 동일하게 -> 메서드로 빼기
		printArray(nums);
		
	}//main
	
	private static void printArray(int[][] nums) {
		for(int i =0; i<nums.length; i++) {
			for(int j =0; j<nums[0].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
	}

}
