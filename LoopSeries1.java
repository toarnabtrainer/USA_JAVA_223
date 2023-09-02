package com.practice;

public class LoopSeries1 {
	int num1, num2;
	// non-parameterized constructor
	public LoopSeries1() {
		System.out.println("Non-parameterized constructor is executing...");
		num1 = 0;
		num2 = 0;
	}
	// parameterized constructor
	public LoopSeries1(int n1, int n2) {
		System.out.println("Parameterized constructor is executing...");
		num1 = n1;
		num2 = n2;
	}
	public int add(int n1) {
		num1 = n1 + 100;
		return num1;
	}
	public int add(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		return num1 + num2;
	}
	
	// total = 1! + 2! + 3! + 4! + ... n terms
	// n! = 1 * 2 * 3 * 4 * ... * n
	// 5! = 1 * 2 * 3 * 4 * 5
	int series1(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			int fact = 1;
			for (int k = 1; k <= i; k++) {
				fact = fact * k;
			}
			total = total + fact;
			System.out.println("i = " + i + ", fact = " + fact + ", total = " + total);
		}
		return total;
	}
	// total = 1! + 2! + 3! + 4! + ... n terms
	// n! = 1 * 2 * 3 * 4 * ... * n
	// 5! = (1 * 2 * 3 * 4) * 5 = 4! * 5
	// n! = n * (n - 1)!
	int series2(int n) {
		int total = 0;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			total = total + fact;
			System.out.println("i = " + i + ", fact = " + fact + ", total = " + total);
		}
		return total;
	}
	/*        i    term1, term2
	 *     ----------------------
	 * 	      1    2, 3
	 *        2    4, 5  =>  (2 * i), (2 * i + 1)
	 *        3    6, 7
	 *        4    8, 9
	 *     ---------------------- 
	 */
	
	// total = 1! + 3! + 5! + 7! + ... n terms
	// n! = 1 * 2 * 3 * 4 * ... * n
	// 5! = (1 * 2 * 3 * 4) * 5 = 4! * 5
	// n! = n * (n - 1)!
	int series3(int n) {
		int total = 0;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			total = total + fact;
			System.out.println("i = " + i + ", fact = " + fact + ", total = " + total);
			fact = fact * (2 * i) * (2 * i + 1);
		}
		return total;
	}
	/*        i    term1, term2
	 *     ----------------------
	 * 	      1    3, 4
	 *        2    5, 6  => (2 * i + 1), (2 * i + 2)  
	 *        3    7, 8
	 *        4    9, 10
	 *     ---------------------- 
	 */
	
	// total = 2! + 4! + 6! + 8! + ... n terms
	// n! = 1 * 2 * 3 * 4 * ... * n
	// 5! = (1 * 2 * 3 * 4) * 5 = 4! * 5
	// n! = n * (n - 1)!
	int series4(int n) {
		int total = 0;
		int fact = 2;
		for (int i = 1; i <= n; i++) {
			total = total + fact;
			System.out.println("i = " + i + ", fact = " + fact + ", total = " + total);
			fact = fact * (2 * i + 1) * (2 * i + 2);
		}
		return total;
	}
	//     i =   1    2    3    4    5    6    7
	// total = - 1! + 2! - 3! + 4! - 5! + 6! - 7! +  ... n terms
	// n! = 1 * 2 * 3 * 4 * ... * n
	// 5! = (1 * 2 * 3 * 4) * 5 = 4! * 5
	// n! = n * (n - 1)!
	int series5(int n) {
		int total = 0;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
//			if (i % 2 == 1)
//				total = total - fact;
//			else
//				total = total + fact;
			total = total + (int)(Math.pow(-1, i)) * fact;    // (-1)^Odd = -1, (-1)^Even = +1
			System.out.println("i = " + i + ", fact = " + fact + ", total = " + total);
		}
		return total;
	}
	
	public static void main(String[] args) {
		LoopSeries1 ob1 = new LoopSeries1();
		LoopSeries1 ob2 = new LoopSeries1(111, 222);
		
		System.out.println(ob1.add(500));
		System.out.println(ob1.add(500, 700));
		
		System.out.println("So sum of the series1 is " + ob1.series1(5) + "\n");
		System.out.println("So sum of the series2 is " + ob1.series2(5) + "\n");
		System.out.println("So sum of the series3 is " + ob1.series3(4) + "\n"); // 1! + 3! + 5! + 7!
		System.out.println("So sum of the series4 is " + ob1.series4(4) + "\n"); // 2! + 4! + 6! + 8!
		System.out.println("So sum of the series5 is " + ob1.series5(5)); // - 1! + 2! - 3! + 4! - 5!
	}
}
