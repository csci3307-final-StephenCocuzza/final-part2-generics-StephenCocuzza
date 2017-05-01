/**
 * 
 */
package com.mycompany.ass2.chapter2;
import java.io.*;
import java.util.Scanner;
/**
 * @author scocuzza
 *
 */
public class Program2_6 {
	 public static void main(String[] args)
	 {
	
	 Scanner input = new Scanner(System.in);
	
	 int x; // first number input by user
	 int y; // second number input by user
	 int z; // third number input by user
	 int result; // product of numbers
	
	 System.out.print("Enter first integer: "); 
	 x = input.nextInt(); 
	
	 System.out.print("Enter second integer: "); 
	 y = input.nextInt(); 
	
	 System.out.print("Enter third integer: "); 
	 z = input.nextInt(); 
	
	 result = x * y * z; 
	
	 System.out.printf("Product is %d%n", result);
	 } 
}
