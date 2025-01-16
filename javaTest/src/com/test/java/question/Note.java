package com.test.java.question;

public class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	// setter, getter 구현

	public void setSize(String size) {
		if(size.equals("A3") || size.equals("A4") || size.equals("A5") || size.equals("B3") || size.equals("B4") || size.equals("B5")) {
			this.size = size;
		}else {
			System.out.println("잘못된 크기를 입력하셨습니다.");
		}
	}

	public void setColor(String color) {
		if(color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색")) {
			this.color = color;
		}else {
			System.out.println("잘못된 색상을 입력하셨습니다.");
		}
	}

	public String setPage(int page) {
		String result = "";
		if(page>=10 &&page<=50) {
			result = "얇은";
		}else if(page>50 &&page<=100) {
			result = "보통";
		}else if(page>100 &&page<=200) {
			result = "두꺼운";
		}
		this.page = page;
		return result;
	}
	
	public void setOwner(String owner) {
		if(owner.length()>=2 &&owner.length()<=5) {
			this.owner = owner ;
		}else{
			System.out.println("잘못된 소유자 이름입니다.");
		}
	}
	
	public String info() {
		this.price = 500;
		if(this.size.equals("A3")) {
			this.price += 400;
		}else if(this.size.equals("A4")) {
			this.price += 200;
		}else if(this.size.equals("B3")) {
			this.price += 500;
		}else if(this.size.equals("B4")) {
			this.price += 300;
		}else if(this.size.equals("B5")) {
			this.price += 100;
		}
		
		if(this.color.equals("검정색")) {
			this.price += 100;
		}else if(this.color.equals("노란색")) {
			this.price += 200;
		}else if(this.color.equals("파란색")) {
			this.price += 200;
		}
		
		this.price += (this.page - 10) *10;
		
        return String.format("■ ■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■ ■\n"
        								+ "소유자 : %s\n"
        								+ "특성 : %s %s %s노트\n"
        								+ "가격 : %,d원",this.owner,this.color,this.setPage(page),this.size,this.price);
  }

}
