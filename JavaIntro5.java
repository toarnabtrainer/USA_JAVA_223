package com.java.introduction;

public class JavaIntro5 {
	
	static void valTest1(int v[]) {
		System.out.println("Number of arguments: " + v.length + " contents: ");
		for (int x: v) {     // for-each loop
			System.out.print(x + ", ");
		}
		System.out.println();
	}
	
	static void valTest2(int ...v) {       // ... indicates ellipsis operator
		System.out.println("Number of args: " + v.length + " contents: ");
		for (int x: v) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n1[] = {10};
		int n2[] = {10, 20, 30, 40};
		int n3[] = {};
		valTest1(n1);    // passing 1 argument
		valTest1(n2);    // passing 4 arguments
		valTest1(n3);    // passing 0 argument
		System.out.println();
		valTest2(n1);    // passing 1 argument 
		valTest2(n2);    // passing 4 arguments
		valTest2(n3);    // passing 0 argument
		
		System.out.println("\n\nEnd of the program...");
	}

}
