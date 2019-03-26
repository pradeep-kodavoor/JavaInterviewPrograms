package com.practice.programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWordsInFile {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\TextFile.txt");

		List<String> linesInFile = Files.readAllLines(path);

		List<String> wordsInFile = new ArrayList<>();

		for (String line : linesInFile) {
			for (String word : line.split(" ")) {
				wordsInFile.add(word);
			}
		}

		Map<String, Integer> duplicateWordsMap = new HashMap<>();
		for (String str : wordsInFile) {
			if (duplicateWordsMap.containsKey(str)) {
				duplicateWordsMap.put(str, duplicateWordsMap.get(str) + 1);
			} else {
				duplicateWordsMap.put(str, 1);
			}
		}

		for (Entry<String, Integer> entry : duplicateWordsMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " --> " + entry.getValue());
			}
		}

	}

}
