package com.test.school.view;

import java.util.List;

import com.test.school.domain.Attendence;
import com.test.school.domain.Score;
import com.test.school.repository.SchoolDAO;
import com.test.school.student.Student;

public class StudentView {

	public static void printScore(List<Score> slist) {
		for(Score s : slist) {
			System.out.println(s);
		}
		
	}

	public static void printScoreList(int grade, int classNumber) {
		for(Student s : SchoolDAO.studentList) {
			if(s.getGrade() == grade && s.getClassNumber() == classNumber) {
				System.out.println(s);
			}
		}
		
		
	}

	public static void printAttendence(List<Attendence> alist) {
		for(Attendence a : alist) {
			System.out.println(a);
		}
		
	}

}
