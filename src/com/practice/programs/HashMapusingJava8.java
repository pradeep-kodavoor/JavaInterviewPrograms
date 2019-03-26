package com.practice.programs;

import java.util.HashMap;

public class HashMapusingJava8 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("ram", 111);
		hm.put("shyam", 555);
		hm.put("farook", 777);
		hm.put("aslan", 333);
		System.out.println(hm);

		//Set<Map.Entry<String, Integer>> entryset = hm.entrySet();
		//entryset.forEach(entry -> System.out.println("key is "+ entry.getKey()+"  value is"+entry.getValue()));

		/*
		 * HashMap<Customer, Integer> hm = new HashMap<>(); hm.put(new
		 * Customer(1, "alan"), 111); hm.put(new Customer(2, "sahil"), 555);
		 * hm.put(new Customer(3, "mahila"), 777); hm.put(new Customer(4,
		 * "rupam"), 333); System.out.println(hm);
		 */
		
		hm.forEach((key, value) -> {

			System.out.println(key);
			System.out.println(value);
		});
	}

}
