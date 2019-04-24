package com.practice.programs;

import java.util.Arrays;

public class CheckIfDigitsAreInAscOrder {

	public static void main(String[] args) {
		int number = 132345;

		String str = String.valueOf(number);
		
		char[] charArray = str.toCharArray();
		char[] tempArray = str.toCharArray();

		Arrays.sort(charArray);

		System.out.println(Arrays.toString(charArray).equals(Arrays.toString(tempArray)));

		boolean isAscendingOrder = true;

		int[] intArray = new int[6];
		int n = intArray.length;
		while (number > 0) {
			int reminder = number % 10;
			intArray[n - 1] = reminder;
			n--;
			number /= 10;
		}

		for (int k = 0; k < intArray.length; k++) {
			for (int j = k + 1; j < intArray.length; j++) {
				if (intArray[k] > intArray[j]) {
					isAscendingOrder = false;
					break;
				}
			}
		}

		if (isAscendingOrder) {
			System.out.println("In ascending order..");
		} else {
			System.out.println("Not in ascending order..");
		}

	}

}
