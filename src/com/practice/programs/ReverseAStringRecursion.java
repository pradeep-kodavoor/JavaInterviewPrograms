package com.practice.programs;

public class ReverseAStringRecursion {

	public static void main(String[] args) {
		String str = "Good Morning";

		System.out.print("Reverse using for loop: ");

		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i > -1; i--) {
			System.out.print(charArray[i]);
		}

		System.out.println();

		System.out.println("Reverse using recursion: " + stringReverse(str));

	}

	public static String stringReverse(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			return str.charAt(str.length() - 1) + stringReverse(str.substring(0, str.length() - 1));
		}
	}

}
