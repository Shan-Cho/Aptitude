package com.ChouguleIndustries.aptitude.string;

public class ReplaceStrByWord {

	public static void main(String[] args) {
		String s = "Im strongest Avenger";
		System.out.println("before replacing: " + s);

		String replaceString = s.replaceAll("strongest", "Coolest");
		System.out.println("After replacing: " + replaceString);
	}

}
