package com.java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaIntro4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		System.out.println("Please enter the First Number: ");
		a = sc.nextInt();
		System.out.println("Please enter the Second Number: ");
		b = sc.nextInt();
		int total = a + b;
		System.out.println("So the sum of " + a + " and " + b + " = " + total + "...");
		
		System.out.println("\n\nPlease enter the First Number: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Please enter the Second Number: ");
		b = Integer.parseInt(br.readLine());
		total = a + b;
		System.out.println("So the sum of " + a + " and " + b + " = " + total + "...");
		
		// taking inputs from the command line input arguments
		System.out.println("\n\nDealing with command line arguments...");
		System.out.println("So total number of command line arguments passed = " + args.length);
		total = 0;
		for (String argvar: args) {   // for-each loop
			System.out.println("Adding the command line argument: " + argvar);
			total += Integer.parseInt(argvar);
			System.out.println("Current value of the total is " + total);
		}
		
		System.out.println("So the grand total = " + total);
		
		System.out.println("\n\nEnd of the program...");
	}
}
