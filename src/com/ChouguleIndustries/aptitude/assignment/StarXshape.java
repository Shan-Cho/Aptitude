package com.ChouguleIndustries.aptitude.assignment;

public class StarXshape {
	public static void main(String[] args) {
		int rows = 5;
		int k = 1;

		for (int i = 1; i <= (rows * 2 - 1); i++) {
			for (int j = 1; j <= rows; j++) {
				if (j == i || j == rows - i + 1) {
					System.out.print(k);
				}
				System.out.print(" ");
				k++;
			}
			System.out.println();

		}
	}
}
