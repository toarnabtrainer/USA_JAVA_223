package com.abstractclass;

public interface myInterfaceOne {
	int var11 = 100;
	int var12 = 200;
	
	void myFunction11();
	void myFunction12();
	
	default String myFunction13() {
		return "myInterfaceOne: myFunction13() default method executing with var11 = " + var11 + "...";
		
	}
	
	static String myFunction14() {
		return "myInterfaceOne: myFunction14() static method executing with var12 = " + var12 + "...";
	}
}
