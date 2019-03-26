package com.practice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "Hello World";

		Map<Character, Integer> duplicateCharactersMap = new HashMap<>();

		for (Character ch : str.toCharArray()) {
			if (duplicateCharactersMap.containsKey(ch)) {
				duplicateCharactersMap.put(ch, duplicateCharactersMap.get(ch) + 1);
			} else {
				duplicateCharactersMap.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = duplicateCharactersMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "-->" + entry.getValue());
			}
		}

	}

}
