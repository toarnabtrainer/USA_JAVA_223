package com.housing;

public class Park {
	int length, breadth, area;
	public Park(int ll, int bb) {
		this.length = ll;
		this.breadth = bb;
		this.area = ll * bb;
	}
	public void displayPark() {
		System.out.println("\n\tPark has a length = " + this.length);
		System.out.println("\tPark has a breadth = " + this.breadth);
		System.out.println("\tPark has an area = " + this.area);
	}

	public static void main(String[] args) {
		Park pk1 = new Park(100, 200);
		pk1.displayPark();

		Park pk2 = new Park(150, 250);
		pk2.displayPark();
	}
}
