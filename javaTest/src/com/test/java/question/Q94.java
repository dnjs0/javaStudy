package com.test.java.question;

import java.util.Calendar;

public class Q94 {
	public static void main(String[] args) {
		
		Bugles snack = new Bugles();

		snack.setSize(500);
		snack.setCreationTime("2024-12-19");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

		snack.eat();


		Bugles snack2 = new Bugles();

		snack2.setSize(300);
		snack2.setCreationTime("2024-12-11");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();
		
	}//main

}//class

class Bugles {
	   private int price;
	   private int weight;
	   private Calendar creationTime;
	   private int expiration;

	   //getter, setter 구현

	   public void eat() {

	   }

	public void setSize(int weight) {
		if(weight == 300 || weight ==500||weight ==850) {
			this.weight = weight;
			if(weight == 300) {
				this.price = 850;
				this.expiration = 7;
			}else if(weight == 500) {
				this.price = 1200;
				this.expiration = 10;
			}else if(weight == 850) {
				this.price = 1950;
				this.expiration = 15;
			}
		}
		
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setCreationTime(String date) {
		Calendar c = Calendar.getInstance();
		
		c.set(Integer.parseInt(date.substring(0,4)), expiration);
	}

	public int getExpiration() {
		return expiration;
	}
}
