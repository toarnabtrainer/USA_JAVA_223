package com.java.introduction;

public class JavaIntro3 {
	// Java supports: Instance, Static (Class Variables) and local variables
	// Java access specifiers: public, private, protected and default
	String name;   // instance variable
	int age;       // instance variable
	static int code = 1101;    // static variable
	public void myFunct() {
		int i = 100;   // local variable confined within this scope
		System.out.println("i = " + i);
	}
	static public void main(String[] my_args) {
		JavaIntro3 obj1 = new JavaIntro3();
		JavaIntro3 obj2 = new JavaIntro3();
		obj1.name = "Ravinder";
		obj1.age = 32;
		System.out.println("Name = " + obj1.name + " and age = " + obj1.age);
		System.out.println("Code = " + obj1.code);
		code = 2202;
		System.out.println("Code = " + code);
		System.out.println("Code = " + obj2.code);
		obj1.myFunct();
	}
}
 