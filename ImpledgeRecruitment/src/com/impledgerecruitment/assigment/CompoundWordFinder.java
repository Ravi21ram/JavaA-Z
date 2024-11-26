package com.impledgerecruitment.assigment;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CompoundWordFinder {

    public static void main(String[] args) throws IOException {
        String inputFile = "Input_02.txt"; // Or Input_01.txt
        long startTime = System.currentTimeMillis();

        List<String> words = readWordsFromFile(inputFile);
        Set<String> wordSet = new HashSet<>(words);
        Map<String, Boolean> memo = new HashMap<>();

        String longest = "";
        String secondLongest = "";

        for (String word : words) {
            if (isCompound(word, wordSet, memo)) {
                if (word.length() > longest.length()) {
                    secondLongest = longest;
                    longest = word;
                } else if (word.length() > secondLongest.length()) {
                    secondLongest = word;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Longest Compound Word: " + longest);
        System.out.println("Second Longest Compound Word: " + secondLongest);
        System.out.println("Time taken to process file " + inputFile + ": " + (endTime - startTime) + " milliseconds");
    }

    private static List<String> readWordsFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.lines().collect(Collectors.toList());
        }
    }

    private static boolean isCompound(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }

        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || isCompound(suffix, wordSet, memo))) {
                memo.put(word, true);
                return true;
            }
        }

        memo.put(word, false);
        return false;
    }
}
