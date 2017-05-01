package com.mycompany.ass2.chapter4;
import java.io.*;
import java.util.Scanner;

public class Program4_24 {
public static void main(String args[]){
	int passes = 0, failures =0, student = 1, result;
	String input, output;
	Scanner keyboard = new Scanner(System.in);
	
	while(student<=10){
		System.out.print("Enter result (1=pass, 2=fail): ");
		result = keyboard.nextInt ();
		if (result ==1)
		{
			passes++;
			student++;
		}
		else if (result ==2) {
			failures++;
			student++;
		}
		else
			System.out.println("Invalid Input");
	}
	System.out.print("Passed: " + passes + "\nFailed: " + failures);;
	if (passes > 8)
		System.out.print("\nRaise Tuition ");;
		System.exit(0);
	
}
}
