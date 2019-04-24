package com.practice.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxCombinationOfNumber {

	public static void main(String[] args) {
		// 9 , 54 , 76 , 8 , 26
		// 98765426

		String[] strArray = { "9", "54", "52", "6", "76", "8", "26", "72" };

		List<String> list = Arrays.stream(strArray).collect(Collectors.toList());

		list.sort((X, Y) -> {

			String XY = X + Y;
			String YX = Y + X;

			return XY.compareTo(YX) > 0 ? -1 : 1;
		});

		list.stream().forEach(System.out::print);

		int[] intArray = { 9, 54, 52, 6, 76, 8, 26, 72 };

		List<Integer> numList = Arrays.stream(intArray).boxed().collect(Collectors.toList());

		numList.sort((num1, num2) -> {

			String n1 = Integer.toString(num1) +Integer.toString(num2); 
			String n2 = Integer.toString(num2) +Integer.toString(num1);
			
			Integer a = Integer.valueOf(n1);
			Integer b = Integer.valueOf(n2);
			
			return Integer.compare(b, a);
		});
		System.out.println();
		numList.stream().forEach(System.out::print);

	}

}
