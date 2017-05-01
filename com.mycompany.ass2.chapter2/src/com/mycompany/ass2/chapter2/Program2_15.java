package com.mycompany.ass2.chapter2;

import java.util.Scanner;
import java.io.*;
public class Program2_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int division;
		
		System.out.print("Enter first integer: ");
		number1=input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2=input.nextInt();
		
		sum=number1+number2;
		product = number1*number2;
		difference=number1-number2;
		division=number1/number2; 
		
		System.out.printf("sum is %d\n",sum);
		System.out.printf("product is %d\n",product);
		System.out.printf("difference is %d\n",difference);
		System.out.printf("Quotient is %d\n",division);
		
		
		
	}
}
