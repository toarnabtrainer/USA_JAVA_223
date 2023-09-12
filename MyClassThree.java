package com.abstractclass;

public class MyClassThree extends MyClassTwo {

	@Override
	public void myFunction22() {
		System.out.println("myInterfaceTwo: myFunction22() executing...");
	}

	@Override
	public void myFunction12() {
		System.out.println("myInterfaceOne: myFunction12() executing...");
	}
	
	public static void main(String[] args) {
		MyClassThree ob1 = new MyClassThree();
		ob1.myFunction11();
		ob1.myFunction12();
		ob1.myFunction21();
		ob1.myFunction22();
		System.out.println(ob1.myFunction13());
		System.out.println(myInterfaceOne.myFunction14());
	}
}
