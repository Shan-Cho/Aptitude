package com.ChouguleIndustries.aptitude.assignment;

public class StarDecOrder {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			// Print star in decreasing order
			for (int k = rows; k >= i; k--) {
				System.out.print("*");
			}
			// Print space in increasing order
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}

	}
}
