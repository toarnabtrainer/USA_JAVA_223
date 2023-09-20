package demo.swing;

import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		int num1, num2, total;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first integer number..."));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second integer number..."));
		JOptionPane.showMessageDialog(null, "Performing the addition operaion...");
		total = num1 + num2;
		JOptionPane.showMessageDialog(null, "So the result is " + total + "...");
	}

}
