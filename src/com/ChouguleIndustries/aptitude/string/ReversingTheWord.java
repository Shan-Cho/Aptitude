package com.ChouguleIndustries.aptitude.string;

public class ReversingTheWord {

	public static void main(String[] args) {
		String s = "Tony";
		char[] ch = s.toCharArray();
		String s1 = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			s1 += ch[i];
		}
		System.out.print(s1);

	}
}
