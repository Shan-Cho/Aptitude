package com.ChouguleIndustries.aptitude.string;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s = "This place is so beautiful";

		char c1 = 's';
		char c2 = '*';
		for (int i = 0; i < s.length(); i++) {
			char[] ch = s.toCharArray();
			if (ch[i] == c1) {
				ch[i] = c2;
			}
			System.out.println(ch[i]);
		}

	}
}
