package com.java.introduction;

public class JavaIntro1 {
	static {
		System.out.println("Welcome to the World of Java...");
		System.out.println("This is a static block-1 executing...");
	}
	{
		System.out.println("\nInitializer block always executes when");
		System.out.println("an object is defined under the class...");
	}
	
	public JavaIntro1() {    // non-parameterized constructor 
		System.out.println("Default constructor is executing...");
	}
	
	public static void main(String[] args) {
		JavaIntro1 ob1 = new JavaIntro1();
		JavaIntro1 ob2 = new JavaIntro1();
		ob1.my_function();
		ob2.my_function();
	}
	
	public void my_function() {
		System.out.println("\nExecuting User Defined Function...");
	}
	
	static {
		System.out.println("This is a static block-2 executing...");
	}
	static {
		System.out.println("This is a static block-3 executing...");
	}
	{
		System.out.println("Initializer block-2 is executing...");
	}

}
