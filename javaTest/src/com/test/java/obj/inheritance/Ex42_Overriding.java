package com.test.java.obj.inheritance;

public class Ex42_Overriding {

	public static void main(String[] args) {
		
		/*
		 * 메서드 오버로딩 Method Overloading
		 * 	-메서드의 이름을 동일하게 만들어서 n개 선언
		 * 
		 * 메서드 오버라이딩 Method Overriding
		 * 	- 클래스 상속할 때 발생
		 * 	- 메서드재정의 > 상속받은 메서드를 수정하는 기술
		 * 
		 * 
		 */
		
		OverridingParent hong = new OverridingParent();
		hong.name = "홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name = "홍철수";
		jhong.hello();
		jhong.test();
		
		
		
	}//main
}//

class OverridingParent{
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요 저는 %s입니다.\n",this.name);
	}
	
}
class OverridingChild extends OverridingParent{
	
	public void hello() {
		System.out.printf("하이~ 전 %s입니다.\n",this.name);
	}
	
	public void test() {
		this.hello();
		super.hello();//super : 부모 메서드 호출
	}

}


class AAAA {
	public int a =10;
	private int b =20;
	
	public void test() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
} 


class BBBB extends AAAA {
	public int c =30;
	private int d =40;
	
	public void test2() {
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.a);
//		System.out.println(this.b); -> 컴파일 에러남! , getter 와 setter 로 봐야함
	}
	
}



















