package com.mycompany.part3.section3;
import com.mycompany.part3.section3.Student;

public class StudentImpl extends PersonBaseImpl implements Student {
	String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle) {
		super(_takenCourseTitle);
	}
	public String studiesFor() {
		return takenCourseTitle; 
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "student";
	}
}
