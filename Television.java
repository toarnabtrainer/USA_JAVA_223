package com.housing;

import java.util.Date;

public class Television {
	String make;
	int size;
	Date dop;
	boolean isColor;
	public Television(String mk, int sz, Date dp, boolean ic) {
		this.make = mk;
		this.size = sz;
		this.dop = dp;
		this.isColor = ic;
	}
	public void displayTelevision() {
		System.out.println("\n\tSo make = " + make);
		System.out.println("\tSize = " + size);
		System.out.println("\tDate of purchase = " + dop.getDate()+"/"+dop.getMonth()+"/"+dop.getYear());
		if (isColor) {
			System.out.println("\tAnd it is a COLOR Television...");
		} else {
			System.out.println("\tAnd it is a B/W Television...");
		}
	}
	public static void main(String[] args) {
		Date dt1 = new Date(1999, 10, 20);
		Television tv1 = new Television("Sonodyne", 21, dt1, true);
		
		Date dt2 = new Date(2020, 11, 25);
		Television tv2 = new Television("Sony", 22, dt2, false);

		tv1.displayTelevision();
		tv2.displayTelevision();
	}
}
