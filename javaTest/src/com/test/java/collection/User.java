package com.test.java.collection;

import java.util.Calendar;

public class User {
	private String name;
	private int level;
	private Calendar regdate;
	private String city;
	
	public User(String name, int level, int year, int month, int date, String city) {
		this.name = name;
		this.level = level;
		this.regdate = regdate;
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		this.city = city;
	}
	
//	public User(String name, int level, Calendar regdate, String city) {
//		super();
//		this.name = name;
//		this.level = level;
//		this.regdate = regdate;
//		this.city = city;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Calendar getRegdate() {
		return regdate;
	}

	public void setRegdate(Calendar regdate) {
		this.regdate = regdate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", level=");
		builder.append(level);
		builder.append(", regdate=");
		builder.append(String.format("%tF", regdate));
		builder.append(", city=");
		builder.append(city);
		builder.append("]\n");
		return builder.toString();
	}
	
	

}
