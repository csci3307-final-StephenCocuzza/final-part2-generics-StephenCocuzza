/**
 * 
 */
package com.mycompany.ass2.chapter4;

import com.mycompany.ass2.chapter4.FigureProgram4_15.Student;

/**
 * @author scocuzza
 *
 */
public class FigureProgram4_4and4_5 {

		public class Student
		{
		private String name;
		private double average;
		
		// constructor initializes instance variables
		public Student(String name, double average)
		{
		this.name = name;
		
		}
		
		public void setName(String name)
		{
		this.name = name;
		}
			// retrieves the Student's name
		public String getName()
		{
		return name;
		}
			// sets the Student's average
		public void setAverage(double studentAverage)
		{
		// validate that average is > 0.0 and <= 100.0; otherwise,
		// keep instance variable average's current value
		}
			// retrieves the Student's average
		public double getAverage()
		{
		return average;
		}
		
		
		public String getLetterGrade()
		{
		String letterGrade = ""; // initialized to empty String

		if (average > 0.0)
		 if (average <= 100.0)
		 this.average = average; // assign to instance variable
		if (average > 0.0)
		 if (average <= 100.0)
		 this.average = average; // assign to instance variable

		public double getAverage()
		{
		return average;
		}
		
		public String getLetterGrade()
		{
		String letterGrade = ""; // initialized to empty String
		if (average >= 90.0)
			 letterGrade = "A";
			else if (average >= 80.0)
			 letterGrade = "B";
			else if (average >= 70.0)
			 letterGrade = "C";
			else if (average >= 60.0)
			 letterGrade = "D";
			else
			 letterGrade = "F"; 
			return letterGrade;
		}
	}
	public static void main(String[] args)
		{
		Student account1 = new Student("Jane Green", 93.5);
		Student account2 = new Student("John Blue", 72.75);
		System.out.printf("%s's letter grade is: %s%n",
			account1.getName(), );
		System.out.printf("%s's letter grade is: %s%n",
			account2.getName(), );
		}
	}