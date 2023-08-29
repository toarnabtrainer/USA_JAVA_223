package com.practice;

public class LoopPractice1 {
	public static void loopMedicine() {
		System.out.println("Visit Doctor...");    // 1 time
		for (int day = 1; day <= 5; day ++) {
			System.out.println("Good Morning...");    // 5 times
			for (int medi = 1; medi <= 3; medi ++) {
				System.out.println("Day No. - " + day + " and Medicine No. - " + medi + "...");    // 15 times
			}
			System.out.println("Good Night...");    // 5 times
			System.out.println("---------------------------------------");    // 5 times
		}
		System.out.println("Thanks to Doctor...");    // 1 time
	}
	public static void loopEnhancedFor() {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88};
		for (int item: arr) {    // for-each loop
			System.out.println("Retrieved item is " + item + "...");
		}
	}
	/*
	 *  n = 6            i    .    * 
	 *                -----------------
	 *  .....*           1    5    1         (i, n)
	 *  ....***          2    4    3    . => (n - i)
	 *  ...*****         3    3    5
	 *  ..*******        4    2    7    * => (2 * i - 1)
	 *  .*********       5    1    9
	 *  ***********      6    0   11
	 *                -----------------
	 *                  Tracing Table
	 */
	public static void loopPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/*
	 *  n = 6            i    .    * 
	 *                -----------------
	 *  ***********      1    0   11         (i, n)
	 *  .*********       2    1    9    . => (i - 1)
	 *  ..*******        3    2    7
	 *  ...*****         4    3    5    * => (2 * (n - i) + 1)
	 *  ....***          5    4    3
	 *  .....*           6    5    1
	 *                -----------------
	 *                  Tracing Table
	 */
	public static void loopPattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= (2 * (n - i) + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/*
	 *  n = 11 (ODD)     i    .    *    m = (n + 1) / 2 = 6
	 *                -----------------
	 *  .....*           1    5    1         (i, n, m)
	 *  ....***          2    4    3    . => (m - i)
	 *  ...*****         3    3    5
	 *  ..*******        4    2    7    * => (2 * i - 1)
	 *  .*********       5    1    9
	 *  ***********   ___6____0___11___
	 *  .*********       7    1    9
	 *  ..*******        8    2    7    . => (i - m)
	 *  ...*****         9    3    5
	 *  ....***         10    4    3    * => (2 * (n - i) + 1)
	 *  .....*          11    5    1
	 *                -----------------
	 *                  Tracing Table
	 */
	public static void loopPattern3(int n) {
		if (n % 2 == 0) {
			System.out.println("Please provide ODD number of layers....");
			return;
		}
		int b, s;
		int m = (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			if (i > m) {
				b = (i - m);
				s = (2 * (n - i) + 1);
			} else {
				b = (m - i);
				s = (2 * i - 1);
			}
			for (int j = 1; j <= b; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= s; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/*
	 *  n = 11 (ODD)     i    .    *    m = (n + 1) / 2 = 6
	 *                -----------------
	 *  ***********      1    0   11         (i, n, m)
	 *  .*********       2    1    9    . => (i - 1)
	 *  ..*******        3    2    7
	 *  ...*****         4    3    5    * => (2 * (m - i) + 1)
	 *  ....***          5    4    3
	 *  .....*        ___6____5____1___
	 *  ....***          7    4    3
	 *  ...*****         8    3    5    . => (n - i)
	 *  ..*******        9    2    7
	 *  .*********      10    1    9    * => (2 * (i - m) + 1)
	 *  ***********     11    0   11
	 *                -----------------
	 *                  Tracing Table
	 */
	public static void loopPattern4(int n) {
		if (n % 2 == 0) {
			System.out.println("Please provide ODD number of layers....");
			return;
		}
		int b, s;
		int m = (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			if (i > m) {
				b = (n - i);
				s = (2 * (i - m) + 1);
			} else {
				b = (i - 1);
				s = (2 * (m - i) + 1);
			}
			for (int j = 1; j <= b; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= s; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// loopMedicine();
		// loopEnhancedFor();
		// loopPattern1(6);
		// loopPattern2(6);
		// loopPattern3(11);
		loopPattern4(11);
	}
	
}
