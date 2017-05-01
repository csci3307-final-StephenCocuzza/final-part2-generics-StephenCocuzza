package com.mycompany.ass2.chapter5;
import java.io.*;
import java.util.Locale;
import java.text.NumberFormat;

public class Program5_18 {
	
	public static void main(String args[])
	{
		int amount;
		int principal = 1000; 
		double rate = 0.05;
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.print("Year\tAmount on deposit\n");
		for (int year = 1; year <= 10; year++)
		{
			amount = (int)
					(principal * 100 * Math.pow(1.0 + rate,  year)); 
			System.out.print(year + "\t" + moneyFormat.format((amount+ Math.pow(1.0+rate,  year)) / 100) + "\n");
			
		}
		System.exit(0);
		
	}
}
