package com.test.java.obj;

public class Monitor {
	
	private String model;
	private int size =24;
	private int price;
	
	
	public void setModel(String model) {
		//유효성 검사 or 가공/조작
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	public int getSize() {
		return size;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//가상 프로퍼티 , 계산된 프로퍼티
	public int getGrade() {
		
		if(this.price >=50000) {
			return 0;
		}else if(this.price>=30000) {
			return 0;
		}else {
			return 0;
		}
	}

	//클래스의 상태를 확인하는 메서드
	public String info() {
		
//		return this.model+":"+ this.size + ":" + this.price;
		return String.format("%s [%d원 , %d인치]"
								,this.model
								,this.price
								,this.size);
	}
	
	
}
