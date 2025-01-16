package com.test.java.file;

public class Score {
	//1.홍길동 100 98 88
	private String no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	public Score(String no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	
	public double getAvg() {
		return this.getTotal()/3.0;
	}
}
