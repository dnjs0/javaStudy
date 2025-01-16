package myTest;

public class test84 {
	public static void main(String[] args) {
		String content = "안녕 깅동아 잘가 길동아";
		String word = "길동";
		int num = 0;
		int index = -1;
		
		while(true) {
			index = content.indexOf(word,index);
			if(index > -1) {
				num ++;
				index = index+word.length();
			}else {
				break;
			}
		}
		
		System.out.printf("'길동'을 총 %d회 발견했습니다.",num);
	}//

}
