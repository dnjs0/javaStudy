package com.test.java.aaa;

public class Yellow {
	public void test() {
		//Red와 같은 패키지의 클래스 > Yellow(같은 동네 사람)
		Red r1 = new Red();
		
		r1.a = 10; //public
		//r1.b = 20; //private
		r1.c = 30; //default
		r1.d = 40;//protected
	}

}
