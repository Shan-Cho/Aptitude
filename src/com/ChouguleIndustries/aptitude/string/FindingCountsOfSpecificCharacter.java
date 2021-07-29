package com.ChouguleIndustries.aptitude.string;

public class FindingCountsOfSpecificCharacter {

	public static void main(String[] args) {
		String s = "hjshdguoikao";
		int character = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'h')
				character++;
		}
		System.out.println(character);

	}
}
