package com.practice.programs;

import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(11, 22, 43, 56, 66);
		for (Integer i : ll) {
			System.out.println(i);
		}
		System.out.println("using consumer implementation");
		ll.forEach(System.out::println);

	}

}

/*
 * class consumerImp implements Consumer<Integer> {
 * 
 * @Override public void accept(Integer var1) { System.out.println(var1);
 * 
 * }
 * 
 * }
 */
