package com.practice.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfStringHasDigits {

	public static void main(String[] args) {
		String str = "test12";
		char[] charArray = str.toCharArray();
		boolean hasDigit = false;
		for (char ch : charArray) {
			if (Character.isDigit(ch)) {
				hasDigit = true;
			}
		}
		System.out.println("hasDigit: " + hasDigit);

		Pattern p = Pattern.compile("([0-9])");
		Matcher m = p.matcher(str);

		if (m.find()) {
			System.out.println("hasDigit: " + m.find());
		}

	}

}
