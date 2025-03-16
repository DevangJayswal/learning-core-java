package com.example.leetcode.string;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

//        String str = "abcabcbb";
//        String str = "bbbbb";
        String str = "pwwkewab";

        System.out.println(longestSubstring(str));


    }

    private static String longestSubstring(String str) {
        StringBuilder longestStringBuilder = new StringBuilder();
        List<String> longestStrings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // is current character part of longestString
            // if no then add it to longestString

            String longestString = longestStringBuilder.toString();
            String currentCharStr = String.valueOf(currentChar);
            if (!longestString.contains(currentCharStr)) {
                longestStringBuilder.append(currentChar);
            } else {
                // add the first longest string to longestStrings
                longestStrings.add(longestString);

                // clear the StringBuilder
                longestStringBuilder.setLength(0);

                // add the current character after clearing the StringBuilder (beginning of new word)
                longestStringBuilder.append(currentChar);
            }
        }
        longestStrings.add(longestStringBuilder.toString());
        return longestStrings.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }
}
