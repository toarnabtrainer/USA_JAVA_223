package com.housing;

import java.util.Date;

public class House {
	int doorNo;
	double plinthArea, groundArea;
	Room bed,dining,hall,kitchen,drawing;
	Television tv;
	Date doc;
	public House(int dn, Room br, Room dr, Room hr, Room kr, Room dw, Television te, Date c) {
		this.doorNo = dn;
		this.bed = br;
		this.drawing = dw;
		this.hall = hr;
		this.kitchen = kr;
		this.dining = dr;
		double area = br.get_floorArea()+dr.get_floorArea()+hr.get_floorArea()+kr.get_floorArea()+dw.get_floorArea();
		this.plinthArea = area * 1.50;
		this.groundArea = area * 1.75;
		this.tv = te;
		doc = c;
	}
	public void displayHouse() {
		System.out.println("\n\tDoor number = " + doorNo);
		System.out.println("\tPlinth area = " + plinthArea + " and ground area = " + this.groundArea);
		System.out.println("\tBed room details...");
		bed.displayRoom();
		System.out.println("\tDining room details...");
		dining.displayRoom();
		System.out.println("\tHall room details...");
		hall.displayRoom();
		System.out.println("\tKitchen room details...");
		kitchen.displayRoom();
		System.out.println("\tDrawing room details...");
		drawing.displayRoom();
		System.out.println("\tTelevision details...");
		tv.displayTelevision();
		System.out.println("\tHouse construction date is "+doc.getDate()+"/"+doc.getMonth()+"/"+doc.getYear());
	}
	public static void main(String[] args) {
		Room r1 = new Room("Bed Room", 10.0, 16.0, 10.0, 2, 2, 3, 3);
		House h1 = new House(1001, r1, new Room("Dining Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
				new Room("Hall TV Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
				new Room("Kitchen Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
				new Room("Drawing Room", 10.0, 16.0, 10.0, 2, 2, 3, 3),
				new Television("Sony", 22, new Date(2020, 11, 25), false),
				new Date(1999, 10, 20));
		h1.displayHouse();
	}
}
