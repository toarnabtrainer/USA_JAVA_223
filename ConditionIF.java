package com.practice;

import java.util.Scanner;

public class ConditionIF {
	Scanner scan;
	public ConditionIF() {
		System.out.println("Welcome to the World of programming...");
		scan = new Scanner(System.in);
	}
	public static void main(String[] args) {
		ConditionIF obj = new ConditionIF();
		int number1, number2, menu_choice = 0;
		System.out.print("Please enter the first number: ");
		number1 = obj.scan.nextInt();
		System.out.print("Please enter the second number: ");
		number2 = obj.scan.nextInt();
		while (menu_choice != 6) {
			menu_choice = obj.menu();
			if (menu_choice == 1) {
				System.out.println("ADDITION Operation has been selected...");
				obj.addition(number1, number2);
			} else if (menu_choice == 2) {
				System.out.println("SUBTRACTION Operation has been selected...");
				obj.subtraction(number1, number2);
			} else if (menu_choice == 3) {
				System.out.println("MULTIPLICATION Operation has been selected...");
				obj.multiplication(number1, number2);
			} else if (menu_choice == 4) {
				System.out.println("DIVISION Operation has been selected...");
				obj.division(number1, number2);
			} else if (menu_choice == 5) {
				System.out.println("MODULUS Operation has been selected...");
				obj.modulus(number1, number2);
			} else if (menu_choice == 6) {
				System.out.println("QUIT Operation has been selected...");
				obj.quit();
			}
		}
	}
	private int menu() {
		int choice = 0;
		while (choice < 1 || choice > 6) {
			System.out.println("M A I N  M E N U...");
			System.out.println("-------------------");
			System.out.println("1 >  A D D I T I O N  O P E R A T I O N ...");
			System.out.println("2 >  S U B T R A C T I O N  O P E R A T I O N ...");
			System.out.println("3 >  M U L T I P L I C A T I O N  O P E R A T I O N ...");
			System.out.println("4 >  D I V I S I O N  O P E R A T I O N ...");
			System.out.println("5 >  M O D U L U S  O P E R A T I O N ...");
			System.out.println("6 >  Q U I T  O P E R A T I O N ...");
			System.out.print("Please enter your choice number: ");
			choice = scan.nextInt();
		}
		return choice;
	}
	public void addition(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("So " + num1 + " + " + num2 + " = " + result + "...");
	}
	public void subtraction(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("So " + num1 + " - " + num2 + " = " + result + "...");
	}
	public void multiplication(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("So " + num1 + " * " + num2 + " = " + result + "...");
	}
	public void division(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Division by ZERO is Illegal !!!");
			System.out.println("Division operation can not be carried out...");
		} else {
			int result = num1 / num2;
			System.out.println("So " + num1 + " / " + num2 + " = " + result + "...");
		}
	}
	public void modulus(int num1, int num2) {
		int result = num1 % num2;
		System.out.println("So " + num1 + " % " + num2 + " = " + result + "...");
	}
	public void quit() {
		System.out.println("End of the program...");
		System.out.println("Good-Bye, and have a nice day...");
	}
	
}
