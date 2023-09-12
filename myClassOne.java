package com.abstractclass;

public class myClassOne implements myInterfaceTwo {

	@Override
	public void myFunction11() {
		System.out.println("myInterfaceOne: myFunction11() executing...");
	}

	@Override
	public void myFunction12() {
		System.out.println("myInterfaceOne: myfunction12() executing...");		
	}

	@Override
	public void myFunction21() {
		System.out.println("myInterfaceTwo: myFunction21() executing...");
	}

	@Override
	public void myFunction22() {
		System.out.println("myInterfaceTwo: myFunction22() executing...");
	}
	
	public static void main(String[] args) {
		myClassOne ob1 = new myClassOne();
		ob1.myFunction11();
		ob1.myFunction12();
		ob1.myFunction21();
		ob1.myFunction22();
		System.out.println(ob1.myFunction13());
		System.out.println(myInterfaceOne.myFunction14());
	}
}
