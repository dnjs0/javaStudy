package com.test.java.question;

public class Q92 {

	public static void main(String[] args) {

		//Book.java
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(4500);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
		

	}// main
}
