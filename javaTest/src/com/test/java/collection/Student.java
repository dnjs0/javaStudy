package com.test.java.collection;

public class Student {
	
	//멤버 변수
	private String name;
	private String gender;
	
	//생성자 source -> generate constructor using field
	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	//Getter/Setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	//toString
	@Override
	public String toString() {
		return String.format("Student [name=%s, gender=%s]", name, gender);
	}
	
}
