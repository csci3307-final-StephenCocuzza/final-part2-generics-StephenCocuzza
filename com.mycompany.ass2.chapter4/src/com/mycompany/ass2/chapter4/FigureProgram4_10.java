package com.mycompany.ass2.chapter4;

import java.util.Scanner; // program uses class Scanner
public class FigureProgram4_10 {
	
	public static void main(String[] args)
	{
	// create Scanner to obtain input from command window
	Scanner input = new Scanner(System.in);
	// initialization phase
	int total = 0; // initialize sum of grades
	int gradeCounter = 0;
	
	System.out.print("Enter grade or -1 to quit: ");
	int grade = input.nextInt(); 
	while (grade != -1)
	{
	total = total + grade; // add grade to total
	gradeCounter = gradeCounter + 1; // increment counter
	System.out.print("Enter grade or -1 to quit: ");
	grade = input.nextInt();
	}
	
	if (gradeCounter != 0)
	{
	
	double average = (double) total / gradeCounter;
	System.out.printf("%nTotal of the %d grades entered is %d%n",
	gradeCounter, total);
	System.out.printf("Class average is %.2f%n", average);
	}
	else 
	System.out.println("No grades were entered");
	}
}
