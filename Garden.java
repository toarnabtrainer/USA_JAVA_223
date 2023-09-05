package com.garden.mango;

public class Garden {
	MangoTree mango1, mango2, mango3;
	Tree tr1, tr2;
	public Garden(MangoTree m1, MangoTree m2, MangoTree m3, Tree t1, Tree t2) {
		this.mango1 = m1;
		this.mango2 = m2;
		this.mango3 = m3;
		this.tr1 = t1;
		this.tr2 = t2;
	}
	public float total_yield() {
		return mango1.get_yield() + mango2.get_yield() + mango3.get_yield();
	}
	public float total_amount_spent() {
		return mango1.get_amount_spent() + mango2.get_amount_spent() + mango3.get_amount_spent()
		     + tr1.get_amount_spent() + tr2.get_amount_spent();
	}
	public void garden_display() {
		mango1.mango_tree_display();
		mango2.mango_tree_display();
		mango3.mango_tree_display();
		tr1.tree_display();
		tr2.tree_display();
		
		System.out.println("\n\tSo the total amount spent: " + total_amount_spent());
		System.out.println("\n\tSo the total yield: " + total_yield());
	}
	public static void main(String[] args) {
		MangoTree mango1 = new MangoTree("Himsagar", 20.0, 8.0, 1500.00f, 5000);
		Tree tree1 = new Tree("Banyan", 10.2, 6.5, 1200.00f);
		Garden g1 = new Garden(mango1, 
				               new MangoTree("Chausa", 18.5, 10.0, 1800.00f, 6500),
				               new MangoTree("Langra", 20.2, 12.2, 2000.00f, 5500),
				               tree1,
				               new Tree("Palm", 11.5, 6.5, 1400.00f));
		g1.garden_display();
	}
}
