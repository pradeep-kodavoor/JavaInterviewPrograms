package com.practice.programs;

public class ReverseANumber {

	public static void main(String[] args) {
		Integer num = 2451359;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(reverse);

	}

}
