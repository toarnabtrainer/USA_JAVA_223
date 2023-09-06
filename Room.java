package com.housing;

public class Room {
	String name;
	double length, breadth, height;
	double floorArea, wallArea;
	int fans, lights, windows, doors;
	
	public Room(String nm, double l, double b, double h, int fn, int lg, int wn, int dr) {
		this.name = nm;
		this.length = l;
		this.breadth = b;
		this.height = h;
		this.fans = fn;
		this.lights = lg;
		this.windows = wn;
		this.doors = dr;
		this.floorArea = l * b;
		this.wallArea = 2 * h * (l + b) * 0.80;
	}
	public void displayRoom() {
		System.out.println("\n\t"+name+" room has length = "+length+", breadth = "+breadth+" and height = "+height);
		System.out.println("\tFloor area = "+floorArea+" and wall area = "+wallArea);
		System.out.println("\tNumber of fans = "+fans+", lights = "+lights+", windows = "+windows+" and doors = "+doors);
	}
	public double get_floorArea() {
		return this.floorArea;
	}
	public static void main(String[] args) {
		Room r1 = new Room("Bed", 10.0, 16.0, 10.0, 2, 2, 3, 3);
		r1.displayRoom();
		System.out.println("\tThe room has floor area = " + r1.get_floorArea());

		Room r2 = new Room("Dining", 11.0, 14.0, 10.0, 2, 3, 4, 2);
		r2.displayRoom();
		System.out.println("\tThe room has floor area = " + r2.get_floorArea());
	}
	
}
