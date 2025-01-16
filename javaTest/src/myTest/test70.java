package myTest;

public class test70 {
	public static void main(String[] args) {
		
		int [][] nums =new int[5][5];
		int num=1;
		for(int i = 0; i<nums.length; i+=2) {
			for(int j=0; j<nums[0].length;j++) {
				nums[i][j] = num;
				num++;
			}
			num += 5;
		}
		
		num=10;
		for(int i = 1; i<nums.length; i+=2) {
			for(int j=0; j<nums[0].length;j++) {
				nums[i][j] = num;
				num--;
			}
			num += 15;
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
