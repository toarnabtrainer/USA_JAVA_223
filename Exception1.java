package demo.exception;

public class Exception1 {
	void function1(int x) {
		try {
			System.out.println("The current value of x = " + x + "...");
			if (x < 10) {
				System.out.println("The value of x is lesser than 10...");
				throw new ArithmeticException();
			} 		
		} finally {
			System.out.println("I am in the finally block for the 1st time...");
		}
	}
	
	void function2() {
		try {
			System.out.println("I am in fucntion2() block...");
			return;
		} finally {
			System.out.println("I am in function2() finally block...");
		}
	}
	
	void function3() {
		try {
			System.out.println("I am in fucntion3() block...");
			System.exit(0);
		} finally {
			System.out.println("I am in function3() finally block...");
		}
	}
	
	void function4(int x) {
		try {
			System.out.println("The current value of x = " + x + "...");
			if (x < 10) {
				System.out.println("The value of x is lesser than 10...");
				throw new ArithmeticException("1st message");
			} 		
		} finally {
			System.out.println("I am in the finally block for the 1st time...");
			try {
				if (x < 5) {
					System.out.println("The value of x is lesser than 5...");
					throw new NumberFormatException("2nd message");
				}
			} finally {
				System.out.println("I am in the finally block for the 2nd time...");
			}

		}
	}
	
	public static void main(String args[]) {
		Exception1 ob1 = new Exception1();
		try {
			ob1.function1(100);
			System.out.println("");
			ob1.function1(5);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException has been caught here-1...");
		}
		
		ob1.function2();
		
		// ob1.function3();
		
		try {
			ob1.function4(100);
			System.out.println("");
			ob1.function4(8);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException has been caught here-4..." + ae);
		} catch (NumberFormatException ne) {
			System.out.println("NumberFormatException has been caught here-4..." + ne);
		}
		
		System.out.println("\nEnd of the program...");
	}
}
