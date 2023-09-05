package com.garden.mango;

public class Tree {
	String code;
	double height, width;
	float amount_spent;
	// parameterized constructor
	public Tree(String cd, double ht, double wd, float amt_spt) {
		this.code = cd;
		this.height = ht;
		this.width = wd;
		this.amount_spent = amt_spt;
	}
	public float get_amount_spent() {
		return amount_spent;
	}
	void annual_update(double htt, double wdd, float amtt) {
		System.out.println("\n\tPerforming the Annual Update operation...");
		this.height += htt;
		this.width += wdd;
		this.amount_spent += amtt;
	}
	void tree_display() {
		System.out.println("\n\n\tThe Tree Code: " + this.code);
		System.out.println("\tThe Tree Height: " + this.height + " and Tree Width: " + this.width);
		System.out.println("\tTotal Amount Spent: " + this.amount_spent);
	}
	public static void main(String[] args) {
		Tree t1 = new Tree("TR001", 10, 6, 1200.00f);
		t1.tree_display();
		
		Tree t2 = new Tree("TR002", 12, 6.5, 2000.00f);
		t2.tree_display();
		
		t1.annual_update(1.5, 1.0, 500.00f);
		t1.tree_display();
		
		t2.annual_update(1.5, 2.0, 550.00f);
		t2.tree_display();
	}
}
