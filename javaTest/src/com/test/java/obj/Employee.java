package com.test.java.obj;

public class Employee {

	//사원클라스
	
	//내정보
	private String name; //직원명
	private String department;//부서명
	
	//내 직속 상사
	private Employee boss;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}
	
	
	
	public String info() {
		
		//자바의 객체는 출력을 하면 "자료형@해시코드"가 출력된다
		//this.getBoss() ->Employee@3af49f1c // 3af49f1c : 주소값
		return String.format("%s(%s) >> %s"
									,this.name
									,this.department
									,this.boss != null? this.boss.info():"상사없음");
	}

	
	
}//class
