package com.ChouguleIndustries.aptitude;

public class Array1 {

	public static void main(String[] args) {
		int n = 3;
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= n; i++) {
				if (i == 3) {
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
