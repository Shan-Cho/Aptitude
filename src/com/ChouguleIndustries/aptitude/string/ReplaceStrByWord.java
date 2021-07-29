package com.ChouguleIndustries.aptitude.string;

public class ReplaceStrByWord {

	public static void main(String[] args) {
		String s = "My name is Ricky";
		System.out.println("before replacing: " + s);

		String replaceString = s.replaceAll("Ricky", "Rakshitha");
		System.out.println("After replacing: " + replaceString);
	}

}
