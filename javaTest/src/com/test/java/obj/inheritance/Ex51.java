package com.test.java.obj.inheritance;

public class Ex51 {
	public static void main(String[] args) {
		
		//OOP > 객체를 위주로 작업 진행 > 객체와 객체간의 관계가 중요하다.
		
//		Hong hong = new Hong();
//		hong.name = "홍길동";
//		hong.age = 20;
//		
//		Lee lee = new Lee();
//		lee.name = "이순신";
//		lee.address = "서울시";
		
		//개인이 아닌 직원으로서의 길동
		StoreKeeper hong = new Hong(); //업캐스팅
		StoreKeeper lee = new Lee();
		
		
		
		
		Anyone one = new Anyone();
		one.name = "아무개";
		one.tel = "010-1234-5678";
		
		String item = one.create();
		
		///***객체가 객체에게 업무를 위임 > 일을 시킨다 > 갹체과 객체간의 관계
//		hong.save(item);
//		lee.store(item);
		
//		hong.store(item);
//		lee.store(item);
		
		//둘중 정답?
		hong.store(item);
//		hong.save(item);
		
//		System.out.println(hong.age);
		
		lee.store(item);
//		lee.save(item) 					//없음
//		System.out.println(lee.age);	//없음
//		System.out.println(lee.name);
//		System.out.println(lee.address); //얘한테만 있음 ->교집합 차집합 헷갈림
		
		
	}//main
}//class

interface StoreKeeper{
	void store(String item);
}



class Hong implements StoreKeeper{
	public String name;
	public int age;
	
	public void save(String item) {
		System.out.println(item + "을 저장합니다.");
	}

	@Override
	public void store(String item) {
		System.out.println(item + "을 저장합니다.");
		
	}
	
}

// Hong 클래스의 대체 클래스
class Lee implements StoreKeeper{
	public String name;
	public String address;
	
	public void store(String item) {
		System.out.println(item+"을 가져다 어딘가에 보관합니다.");
	}
	
	
}


class Anyone{
	public String name;
	public String tel;
	
	public String create() {
		return "노트북";
	}
	
}
