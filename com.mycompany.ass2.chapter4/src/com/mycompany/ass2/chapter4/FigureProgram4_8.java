package com.mycompany.ass2.chapter4;
import java.util.Scanner;
public class FigureProgram4_8 {
	
	public static void main(String[] args)
	{
	// create Scanner to obtain input from command window
	Scanner input = new Scanner(System.in);
	
	int total = 0; // initialize sum of grades entered by the user
	
	while ( )
	{
	System.out.print("Enter grade: "); // prompt
	int grade = input.nextInt(); // input next grade
	total = total + grade; // add grade to total
	}
	// termination phase
	int average = total / 10; // integer division yields integer result
	// display total and average of grades
	System.out.printf("%nTotal of all 10 grades is %d%n", total);
}

}