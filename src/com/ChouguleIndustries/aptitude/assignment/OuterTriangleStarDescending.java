package com.ChouguleIndustries.aptitude.assignment;

public class OuterTriangleStarDescending {
	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int j = rows; j >= i; j--) {
				if (i == 1 || j == i || j == rows)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for (int k = 1; k < i; k++) {
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}
