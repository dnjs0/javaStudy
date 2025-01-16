package myTest;

public class test42 {
	public static void main(String[] args) {
		
		int today = (2024 * 365) + (12*30) + 13;
//		System.out.println(today);
		String week = "";
		switch(today%7) {
		case 1: week = "월"; break;
		case 2: week = "화"; break;
		case 3: week = "수"; break;
		case 4: week = "목"; break;
		case 5: week = "금"; break;
		case 6: week = "토"; break;
		case 0: week = "일"; break;
		}
		System.out.printf("2024년 12월 13일 %d일째 되는 날이고 %s요일 입니다.",today , week);
	}

}
