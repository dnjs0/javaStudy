package com.test.java.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q126 {
	public static void main(String[] args) {
		String path  = "C:\\Users\\user\\Downloads\\파일 입출력 문제\\출결.dat";
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			ArrayList<Employee> list = new ArrayList<>();
			String line= null;
			
			while((line =reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				Employee e = getEmployee(list, temp[1]);
				
				if(e == null) {
					e = new Employee(temp[1],0,0);
					list.add(e);
					
				}
				if(temp[2].compareTo("9:00")>0) {
					e.in++;
				}
				if(temp[3].compareTo("18:00")<0) {
					e.out++;
				}
			}
			System.out.println("[이름]\t[지각]\t[조퇴]");
			
			for(Employee e:list) {
				System.out.printf("%s\t%4d회\t%4d회\n",e.name,e.in,e.out);
			}
			
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}//main

	private static Employee getEmployee(ArrayList<Employee> list, String name) {
		for(Employee e: list) {
			if(e.name.equals(name)) {
				return e;
			}
		}
		return null;
	}

}//class


class Employee{
	public String name;
	public int in;
	public int out;
	
	public Employee(String name, int in, int out) {
		super();
		this.name = name;
		this.in = in;
		this.out = out;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", in=");
		builder.append(in);
		builder.append(", out=");
		builder.append(out);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
