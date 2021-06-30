package com.ChouguleIndustries.aptitude;

public class Array3 {
	public static void main(String[] args) {
		int n = 5;
		for (int j = 3; j <= n; j++) {
			for (int i = 3; i <= n; i++) {
				
				if (i <= 5) {
					System.out.print(j + "" + i + " ");
				} else if (j == 3) {
					System.out.print(j + "" + i + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}
}
