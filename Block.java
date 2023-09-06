package com.housing;

import java.util.Date;

public class Block {
	int length, breadth, area;
	House h1, h2, h3, h4;
	Park pk;
	public Block(int ll, int bb, House hh1, House hh2, House hh3, House hh4, Park pk1) {
		this.length = ll;
		this.breadth = bb;
		this.h1 = hh1;
		this.h2 = hh2;
		this.h3 = hh3;
		this.h4 = hh4;
		this.pk = pk1;
	}
	public void displayBlock() {
		System.out.println("\n\tThe block is having length = " + length + ", breadth = " + breadth + " and area = " + area);
		System.out.println("\n\tThe House-1 details are...");
		System.out.println("\t------------------------------------------");
		h1.displayHouse();
		System.out.println("\n\tThe House-2 details are...");
		System.out.println("\t------------------------------------------");
		h2.displayHouse();
		System.out.println("\n\tThe House-3 details are...");
		System.out.println("\t------------------------------------------");
		h3.displayHouse();
		System.out.println("\n\tThe House-4 details are...");
		System.out.println("\t------------------------------------------");
		h4.displayHouse();
		System.out.println("\n\tThe Park-1 details are...");
		System.out.println("\t------------------------------------------");
		pk.displayPark();
	}
	public static void main(String[] args) {
		Block bk1 = new Block(400, 100, 
				new House(1001, new Room("Bed Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Dining Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Hall TV Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Kitchen Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Drawing Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Television("Sony", 22, new Date(2020, 11, 25), false),
						new Date(1999, 10, 20)),
				new House(1002, new Room("Bed Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Dining Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Hall TV Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Kitchen Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Drawing Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Television("Sony", 22, new Date(2020, 11, 25), false),
						new Date(1999, 10, 20)),
				new House(1003, new Room("Bed Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Dining Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Hall TV Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Kitchen Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Drawing Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Television("Sony", 22, new Date(2020, 11, 25), false),
						new Date(1999, 10, 20)),
				new House(1004, new Room("Bed Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Dining Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Hall TV Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Kitchen Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Room("Drawing Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
						new Television("Sony", 22, new Date(2020, 11, 25), false),
						new Date(1999, 10, 20)),
				new Park(100, 200));
		
		bk1.displayBlock();
	}
}
