package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Top2MaxNumsInArray {

	public static void main(String[] args) {
		Integer[] nums = { 5, 2, 4, 3, 6, 8, 7, 9 };

		List<Integer> numList = new ArrayList<>();
		for (int num : nums) {
			numList.add(num);
		}
		Collections.sort(numList);

		System.out.println("Max: " + numList.get(numList.size() - 1) + ", 2nd Max: " + numList.get(numList.size() - 2));
		int maxOne = 0;
		int maxTwo = 0;
		for (int num : nums) {
			if (num > maxOne) {
				maxTwo = maxOne;
				maxOne = num;
			} else if (num > maxTwo) {
				maxTwo = num;
			}
		}

		System.out.println("1st Max : " + maxOne + " 2nd Max : " + maxTwo);

	}

}
