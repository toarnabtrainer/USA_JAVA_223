package com.arrays;

import java.util.Scanner;

public class Array1 {
	int a1[][] = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
	int a2[] = new int[5];
	int a3[] = {111, 222, 333, 444, 555, 666};
	int a4[][] = new int[5][3];
	Scanner sc = new Scanner(System.in);
	
	public void initialize2() {
		System.out.println("\nPlease enter your integer values: \n");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your item at location " + i + ": ");
			a2[i] = sc.nextInt();
		}
	}
	
	public void initialize4() {
		System.out.println("\nPlease enter your integer values: \n");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("Enter your item at row = " + row + " col = " + col + ": ");
				a4[row][col] = sc.nextInt();
			}
		}
	}
	public void display4() {
		System.out.println("\nDisplaying the content of the array1...");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(a4[row][col] + "  ");
			}
			System.out.println("");
		}
	}
	public void display2() {
		System.out.println("\nDisplaying the content of the array2...\n");
		for (int i = 0; i < 5; i++) {
				System.out.print(a2[i] + "  ");
			}
			System.out.println("");
	}
	
	public void display3() {
		System.out.println("\nDisplaying the content of the array3...\n");
		for (int i = 0; i < 6; i++) {
				System.out.print(a3[i] + "  ");
			}
			System.out.println("");
	}
	
	public void display1() {
		System.out.println("\nDisplaying the content of the array1...");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(a1[row][col] + "  ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Array1 ob1 = new Array1();
		ob1.display1();
		ob1.initialize2();
		ob1.display2();
		ob1.display3();
		ob1.initialize4();
		ob1.display4();
	}
}
