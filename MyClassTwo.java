package com.abstractclass;

public abstract class MyClassTwo implements myInterfaceTwo {
	@Override
	public void myFunction11() {
		System.out.println("myInterfaceOne: myFunction11() executing...");
	}

	@Override
	public void myFunction21() {
		System.out.println("myInterfaceTwo: myFunction21() executing...");
	}
	
	public void myFunction() {
		System.out.println("MyClassTwo: myFunction() executing...");
	}
	
	public static void main(String[] args) {
		MyClassTwo ob1 = new MyClassTwo() {

			@Override
			public void myFunction22() {
				System.out.println("myInterfaceTwo: myFunction22() executing...");
			}

			@Override
			public void myFunction12() {
				System.out.println("myInterfaceOne: myFunction12() executing...");
			}
		};
		ob1.myFunction11();
		ob1.myFunction12();
		ob1.myFunction21();
		ob1.myFunction22();
		ob1.myFunction();
		System.out.println(ob1.myFunction13());
		System.out.println(myInterfaceOne.myFunction14());
	}
}
