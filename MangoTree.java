package com.garden.mango;

public class MangoTree extends Tree {
	int yield;
	public MangoTree(String code, double ht, double wd, float amt_spt, int yld) {
		super(code, ht, wd, amt_spt);  // calling the base class constructor
		this.yield = yld;
	}
	public int get_yield() {
		return this.yield;
	}
	public void mango_tree_display() {
		super.tree_display();
		System.out.println("\tTotal Yield amount: " + this.yield);
	}
	void annual_update(double htt, double wdd, float amtt, int yldd) {
		super.annual_update(htt, wdd, amtt);
		this.yield += yldd;
	}
	public static void main(String[] args) {
		MangoTree m1 = new MangoTree("Man001", 20.0, 8.0, 1200.00f, 1000);
		m1.mango_tree_display();
		MangoTree m2 = new MangoTree("Man002", 22.0, 10.0, 1500.00f, 2500);
		m2.mango_tree_display();
		
		m1.annual_update(10.0,  8.0, 1000.00f);
		m1.mango_tree_display();
		
		m2.annual_update(12.0, 10.0, 1500.00f);
		m2.mango_tree_display();
	}
}
