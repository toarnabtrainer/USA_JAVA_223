package demo.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {
	int num1, num2, result;
//	InputStreamReader isr = new InputStreamReader(System.in);
//	BufferedReader br = new BufferedReader(isr);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public void initialize1() throws NumberFormatException, IOException {
		System.out.print("Please enter the first number: ");
		num1 = Integer.parseInt(br.readLine());
	}
	
	public void initialize2() throws IOException {
		System.out.print("Please enter the second number: ");
		try {
			num2 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException ne) {
			System.out.println("initialize2: NumberFormatException has been caught...");
			num2 = 10;
		}
		
//		catch (NumberFormatException | IOException e) {
//			System.out.println("Exception has been caught...");
//			e.printStackTrace();
//		}
	}
	
	public void calculation() {
		System.out.println("\nPerforming the division operation...");
		result = num1 / num2;
		System.out.println("So " + num1 + " / " + num2 + " = " + result + "...");
	}
	
	public static void main(String[] args) {
		Exception2 ob1 = new Exception2();
		try {
			ob1.initialize1();
			ob1.initialize2();
			ob1.calculation();
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: Please provide Integer Numbers as input...");
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException: Division by ZERO is Illegal... !!!");
		} catch (IOException e) {
			System.out.println("IOException: IO exception has occurred...");
		}
		
		System.out.println("\nEnd of the program...");
	}
	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		Exception2 ob1 = new Exception2();
//		ob1.initialize1();
//		ob1.initialize2();
//		ob1.calculation();
//	}
}
