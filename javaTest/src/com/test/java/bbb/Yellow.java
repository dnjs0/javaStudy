package com.test.java.bbb;

import com.test.java.aaa.Red;

public class Yellow {
	
	public void test() {
		//Red와 다른 패키지의 클래스 > Yellow(같은 동네 사람)
				Red r1 = new Red();
				
				r1.a = 10; //public
				//r1.b = 20; //private
				//r1.c = 30; //default ->패키지가 달라졌으므로 안보임
				//r1.d = 40;//protected  ->패키지가 달라졌으므로 안보임ㄴ
		
	}

}
