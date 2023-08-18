package com.java.introduction;

public class JavaIntro2 {

	public static void main(String[] args) {
		// integer
		byte b = 20; System.out.println("b = " + b);   // byte type
		short s = 25; System.out.println("s = " + s);  // short type
		int i = 30; System.out.println("i = " + i);    // int type
		long l = 35; System.out.println("l = " + l);   // long type
		
		// floating-point
		float f = 20.25f; System.out.println("f = " + f);   // float type
		double d = 30.35; System.out.println("d = " + d);   // double type
		
		// characters
		char ch1 = 'S'; System.out.println("ch1 = " + ch1);    // character type
		char ch2 = '&'; System.out.println("ch2 = " + ch2);    // character type
		
		// boolean
		boolean tr = true; System.out.println("tr = " + tr);    // boolean type
		boolean fl = false; System.out.println("fl = " + fl);    // boolean type
		
		// Narrowing: double -> float -> long -> int -> short -> byte
		
		double dd = 100.04;
		long ll = (long)dd;    // explicit type castig is required
		int ii = (int)ll;      // explicit type castig is required
		System.out.println("Double value " + dd);
		System.out.println("Long value " + ll);
		// Widening: byte -> short -> int -> long -> float -> double
		
		// 100 = 64 + 36 = 64 + 32 + 4 = 0000 0000 0000 0000 0000 0000 0110 0100
		//                               ---B-1--- ---B-2--- ---B-3--- ---B-4---
		// 500 = 256 + 244 = 256 + 128 + 116 = 256 + 128 + 64 + 32 + 16 + 4 = 0000 0001 1111 0100
		int ivar = 100;
		long lvar = ivar;      // no explicit type casting required
		float fvar = lvar;     // no explicit type casting required
		System.out.println("ivar value = "+ ivar);
		System.out.println("lvar value = "+ lvar);
		System.out.println("fvar value = "+ fvar);
		
		// Non-Primitive Data Type
		JavaIntro2 obj = new JavaIntro2();
		obj.myFunct();
	}
	
	void myFunct() {
		System.out.println("myFuct() is executing...");
	}

}
