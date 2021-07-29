package com.ChouguleIndustries.aptitude.string;

public class DuplicateCharacterFromWord {

	public static void main(String[] args) {
		String str = "rakshitha";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(j) != str.charAt(i)) {
				System.out.print(str.charAt(i));
			} else {
				System.out.print("");
			}
		}
		j++;
	}
}
