package com.test.java.question;

import java.util.Arrays;

public class MyArrayList {
	
	private String[] list;
	private int index; //중요 역할 > 현재 데이터가 들어갈 방 번호
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
		
		
	}
	//****toString 용도

	@Override
	public String toString() {
		String temp = "";
		
		temp += "\r\n";
		temp += String.format("length : %d\r\n", this.list.length);
		temp += String.format("index : %d\r\n", this.index);
		temp += "[\r\n";
		for(int i=0; i<this.list.length; i++) {
			temp += String.format("\t%d : %s,\r\n", i,this.list[i]);
		}
		temp += "]";
		temp += "\r\n";
		
		
		return temp;
	}

	public void add(String s) {
		
		//남는 공간이 있는지 확인
		//1. 없다면 > 공간 x2배
		//2. 있다면 > X
		if(checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = s;
		index ++;
		
	}

	private void doubleList() {
		
		String[] temp = new String[this.list.length*2];
		for(int i = 0; i<this.list.length; i++) {
			temp[i] = this.list[i]; //깊은 복사
		}
		this.list = temp; //배열 교체 , 주소값을 덮어쓴다.
		
		
		
	}

	private boolean checkLength() {
		//배열에 남는 공간이 있는지 확인
		if(this.list.length == this.index) {
			return true;//공간이 꽉차면 true
		}
		 
		return false;
	}
	
	public String get(int index) {
		// list.get(0);
		return this.list[index];
	}

	public int size() {
		
		return this.index;//배열안에 들어있는 데이터의 개수
	}

	public String set(int index, String value) {
		this.list[index]=value;
		return this.list[index];
		
	}

	public String remove(int index) {
		for(int i = index; i<=this.list.length-2; i++) {
			this.list[i]= this.list[i+1];
		}
		this.index--;
		return this.list[index];
	}

	public boolean add(int index, String value) {
		if(this.list[index].equals(value)) {
			return true;
		}
		
		return false;
	}
	
	

}
