package com.test.school.student;

import java.util.List;

import com.test.school.common.SchoolMember;
import com.test.school.domain.Attendence;
import com.test.school.domain.Score;

/**
 * 학생 정보를 제공하는 클래스
 * 
 */
public class Student extends SchoolMember {
	
	private int no;						//번호
	private int grade;					//학년
	private int classNumber;			//반
	private int number;
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private List<Score> slist;			//성적
	private List<Attendence> alist; 	//출결
	
	//생성자 > 기본생성자 + 오버로딩
	public Student() {
		this(0,0,0,0,null,null,null);
	}

	public Student(int no, int grade, int classNumber,int number, String name, List<Score> slist, List<Attendence> alist) {
		super(name);
		this.no = no;
		this.grade = grade;
		this.classNumber = classNumber;
		this.classNumber = number;
		this.slist = slist;
		this.alist = alist;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}
	
	
	

	public List<Score> getSlist() {
		return slist;
	}

	public void setSlist(List<Score> slist) {
		this.slist = slist;
	}

	public List<Attendence> getAlist() {
		return alist;
	}

	public void setAlist(List<Attendence> alist) {
		this.alist = alist;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [no=");
		builder.append(no);
		builder.append(", grade=");
		builder.append(grade);
		builder.append(", classNumber=");
		builder.append(classNumber);
		builder.append(", number=");
		builder.append(number);
		builder.append(", name=");
		builder.append(this.getName());
		builder.append(", slist=");
		builder.append(slist);
		builder.append(", alist=");
		builder.append(alist);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public List<Score> getScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendence> getAttendence() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
