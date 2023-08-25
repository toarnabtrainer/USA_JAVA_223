package com.practice;

import java.util.Scanner;

public class ConditionSwitch {
	Scanner scan;
	int num1, num2;
	public ConditionSwitch() {
		System.out.println("Welcome to the World of Programming...");
		scan = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		num1 = scan.nextInt();
		System.out.print("Please enter the second number: ");
		num2 = scan.nextInt();
	}
	public void addition() {
		int result = num1 + num2;
		System.out.println("So " + num1 + " + " + num2 + " = " + result + "...");
	}
	public void subtraction() {
		int result = num1 - num2;
		System.out.println("So " + num1 + " - " + num2 + " = " + result + "...");
	}
	public void multiplication() {
		int result = num1 * num2;
		System.out.println("So " + num1 + " * " + num2 + " = " + result + "...");
	}
	public void division() {
		if (num2 == 0) {
			System.out.println("Division by ZERO is Illegal...!!!");
			System.out.println("Division operation can not be carried out...");
		} else {
			int result = num1 / num2;
			System.out.println("So " + num1 + " / " + num2 + " = " + result + "...");
		}
	}
	public void modulus() {
		int result = num1 % num2;
		System.out.println("So " + num1 + " % " + num2 + " = " + result + "...");
	}
	public void quit() {
		System.out.println("End of the program...");
		System.out.println("Good-bye and have a nice day...");
	}
	public int menu() {
		int choice = 0;
		while (choice < 1 || choice > 6) {
			System.out.println("M A I N  M E N U ...");
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
	public static void main(String[] args) {
		ConditionSwitch obj = new ConditionSwitch();
		int menu_choice = 0;
		while (menu_choice != 6) {
			menu_choice = obj.menu();
			switch (menu_choice) {
			case 1:
				System.out.println("ADDITION Operation has been selected...");
				obj.addition();
				break;
			case 2:
				System.out.println("SUBTRACTION Operation has been selected...");
				obj.subtraction();
				break;
			case 3:
				System.out.println("MULTIPLICATION Operation has been selected...");
				obj.multiplication();
				break;
			case 4:
				System.out.println("DIVISION Operation has been selected...");
				obj.division();
				break;
			case 5:
				System.out.println("MODULUS Operation has been selected...");
				obj.modulus();
				break;
			case 6:
				System.out.println("QUIT Operation has been selected...");
				obj.quit();
				break;
			}
		}
	}
}
