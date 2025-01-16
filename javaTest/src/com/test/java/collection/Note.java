package com.test.java.collection;

public class Note {
	
	//클래스를 만들면 당연히! 멤버변수를 만들어야지
	//예외가 있긴 한데 굉장히 독특한 경우
	
	//클라스 > 멤버 변수 + 생성자 + Getter/Setter + 메서드 + toString
	
	private String size;
	private String color;
	private int price;
	
	public Note(String size, String color, int price) {
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	//equals 오버라이딩!!!
	//자바 권장
	//	- 객체 비교 > equals() 사용 & hashCode() 사용
	//	- 사용자 정의 비교
	//		1. toString() 재정의
	//		2. hashCode() 재정의 
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Note [size=");
		builder.append(size);
		builder.append(", color=");
		builder.append(color);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object obj) {

		//n1.equals(n3)	> n1==n3
		//	- this > n1
		//	- obj > n3
		
		Note temp = (Note)obj;
		
		if(this.size.equals(temp.size)
				&& this.color.equals(temp.color)
				&& this.price == temp.price) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		//문자열은 값이 동일하면 주소값이 동일하다.
		String temp = this.size + this.color + this.price;
		
		return temp.hashCode();
	}

}
