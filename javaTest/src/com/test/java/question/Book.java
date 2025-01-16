package com.test.java.question;

public class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter
	public String getTitle() {//읽기
		return title;
	}

	public void setTitle(String title) {//쓰기
		//유효성 검사
		if(title.length()>50) {
			System.out.println("제목은 50자 이내로 입력.");
			return;//빈 리턴문 > 메서드 종료
		}
		for(int i = 0; i<title.length();i++) {
			char c = title.charAt(i);
			
			if((c<'가' || c>'힣')
					&&(c<'A' || c>'Z')
					&&(c<'a' || c>'z')
					&&(c<'0' || c>'9')
					&& c != ' ') {
				System.out.println("제목을 올바른 문자로 작성하시오");
				return;
			}
		}
		
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0||price>1000000) {
			System.out.println("가격이 올바르지 않습니다.");
			return;
		}
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page<0) {
			System.out.println("페이지가 올바르지 않습니다.");
		}
		this.page = page;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubYear() {
		return pubYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String info() {
		
	         return String.format("제목: %s\r\n"
	         		+ "가격: %d\r\n"
	         		+ "저자: %s\r\n"
	         		+ "출판사: %s\r\n"
	         		+ "발행년도: %s년\r\n"
	         		+ "ISBN: %s\r\n"
	         		+ "페이지: %d장"
	         		,this.title
	         		,this.getPrice()
	         		,this.getAuthor()
	         		,this.publisher
	         		,this.getPubYear()
	         		,this.getIsbn()
	         		,this.getPage());
	   }
}
