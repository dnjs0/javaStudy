package com.test.java.bbb.ccc;

import com.test.java.aaa.Red;

public class Blue extends Red {
	
	public void test() {
		//Red> com.test.java.aaa
		//Blue> com.test.java.bbb.ccc
		
		//타지에 사는 자식
		this.a = 10; //public
		//this.b = 10; //private
		//this.c = 30; //default
		this.d = 40; //protected
		
	}

}
