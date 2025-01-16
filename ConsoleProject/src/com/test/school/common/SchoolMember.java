package com.test.school.common;

import java.util.List;

import com.test.school.domain.Attendence;
import com.test.school.domain.Score;

public abstract class SchoolMember {
 
	private String name;
	
	public SchoolMember(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract List<Score> getScore();
	public abstract List<Attendence> getAttendence();
}
