package com.example.leetcode.string;

import java.util.stream.IntStream;

public class LongestCommonPrefix {

    // assuming strings array length is 3
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"}; // fl
//        String[] strings = {"dog","racecar","car"}; // ""
//        String[] strings = {"automobile", "automatic", "autograph"}; // auto
//        String[] strings = {"biology", "biography", "biometric"}; // bio
//        String[] strings = {"transport", "translate", "transform"}; // trans


//        System.out.println(longestCommonPrefix(strings));

        System.out.println(longestCommonPrefix1(strings));


        // using java 8 streams API
//        System.out.println(longestCommonPrefix2(strings));
    }

    private static String longestCommonPrefix1(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        int minLength = strings[0].length();
        for (String s : strings) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }

        StringBuilder longestCommonPrefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            // first string's character at index i
            char currentChar = strings[0].charAt(i);

            // comparing first string's character at index i
            // with the rest of the string's character at index, `i`

            // /if first string's `i`th character(string[0].charAt(i)) MATCHES with the rest of the string's `i`th character(string[j].charAt(i))
            // then consider that character as common prefix and insert that character into String (longestCommonPrefix.append(currentChar))

            // if first string `i`th character (string[0].charAt(i)) DOEST NOT MATCH with the rest of the string's `i`th character (string[j].charAt(i))
            // exit the loop and return the common prefix (return longestCommonPrefix.toString())

            // the purpose of the second for loop is to iterate over the rest of the string (not first string)
            // that's why j=1
            for (int j = 1; j < strings.length; j++) {
                if (strings[j].charAt(i) != currentChar) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(currentChar);
        }
        return longestCommonPrefix.toString();
    }

    // "flower", "flow", "flight"
    // for learning purpose
    private static void printCharacter() {
        String[] strings = new String[]{"flower", "flow", "flight"};

        for (int i = 0; i < strings[0].length(); i++) {
            System.out.println(strings[0].charAt(i)); // prints all characters of the first string
        }
        System.out.println("--------------------");

        // f
        //flow
        //flight

        // l
        // flow
        // flight
        for (int i = 0; i < strings[0].length(); i++) {
            System.out.println(strings[0].charAt(i)); // prints character of the first string // e.g. `f`
            for (int j = 1; j < strings.length; j++) {
                for (int k = 0; k < strings[j].length(); k++) {
                    System.out.print(strings[j].charAt(k)); // printing 2nd string `f` `l` `o` `w` // printing 3rd string `f` `l` `i` `g` `h` `t`
                } // end of printing 2nd string // end of printing 3rd string
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------------");

        // f -> 1st string's first character
        // f -> 2nd string's first character
        // f -> 3rd string's first character

        // l -> 1st string's second character
        // l -> 2nd string's second character
        // l -> 3rd string's second character

        // o -> 1st string's third character
        // o -> 2nd string's third character
        // o -> 3rd string's third character


        StringBuilder longestCommonPrefix = new StringBuilder();

        System.out.println("longestCommonPrefixNotSoEfficient: " + Util.getLongestCommonPrefixNotSoEfficient(strings, longestCommonPrefix));
        System.out.println("--------------------");
    }


    // assuming strings array length has to be 3,
    // this method will not work if the string array length is not 3
    private static String longestCommonPrefix(String[] strings) {
        int minLength = strings[0].length();

        // find a minimum length of string to avoid index out of bound exception
        for (String s : strings) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
//        return getLongestCommonPrefixWithStringArrayOfSize3(strings, minLength);
        return getLongestCommonPrefixWithStringArrayOfAnySize(strings, minLength);
    }

    // the idea is to keep comparing the characters of the strings at the same index starting from index 0,
    // so basically keep comparing the characters until the match is found

    // first string's first character with second string's first character
    // and then comparing the second string's first character with third string's first character
    // and so on and so forth
    private static String getLongestCommonPrefixWithStringArrayOfSize3(String[] strings, int minLength) {
        // convert the string array to a character array
        char[] firstStr = strings[0].toCharArray();
        char[] secondStr = strings[1].toCharArray();
        char[] thirdStr = strings[2].toCharArray();

        StringBuilder longestCommonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            // check if the characters at the same index are equal
            if (firstStr[i] == secondStr[i] && secondStr[i] == thirdStr[i]) {
                longestCommonPrefix.append(firstStr[i]);
            }
        }
        return longestCommonPrefix.toString();
    }

    private static String getLongestCommonPrefixWithStringArrayOfAnySize(String[] strings, int minLength) {
        return null;
    }

    // using java 8 streams API
    public static String longestCommonPrefix2(String[] strings) {

        return IntStream.range(0, strings[0].length())
                .mapToObj(i -> strings[0].charAt(i))
                .takeWhile(
                        ch -> strings[1].indexOf(ch) == strings[0].indexOf(ch) && strings[2].indexOf(ch) == strings[0].indexOf(
                                ch))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}

class Util {

    public static String getLongestCommonPrefixEfficient(String[] strings, StringBuilder longestCommonPrefix) {
        for (int i = 0; i < strings[0].length(); i++) {

            // The purpose of the second for loop is to iterate over every string from the second string onward.
            for (int j = 1; j < strings.length; j++) {
                char charAtIthPosition = strings[j].charAt(i); // accessing character located at index i for second string onward
                if (charAtIthPosition != strings[0].charAt(i)) {
                    longestCommonPrefix.deleteCharAt(longestCommonPrefix.length() - 1);
                    return longestCommonPrefix.toString();
                } else {
                    return longestCommonPrefix.toString();
                }
            }

        }
        return longestCommonPrefix.toString();
    }

    public static String getLongestCommonPrefixNotSoEfficient(String[] strings, StringBuilder longestCommonPrefix) {
        for (int i = 0; i < strings[0].length(); i++) {
            System.out.println(strings[0].charAt(i)); // prints character of the first string // e.g. `f`
            System.out.println("longestCommonPrefix: " + longestCommonPrefix);
            longestCommonPrefix.append(strings[0].charAt(i));

            // The purpose of the second for loop is to iterate over every string from the second string onward.
            for (int j = 1; j < strings.length; j++) {
                char charAtIthPosition = strings[j].charAt(i); // accessing character located at index i for second string onward
                if (charAtIthPosition != strings[0].charAt(i)) {
                    longestCommonPrefix.deleteCharAt(longestCommonPrefix.length() - 1);
                    return longestCommonPrefix.toString();
                } else {
                    return longestCommonPrefix.toString();
                }
            }

        }
        return longestCommonPrefix.toString();
    }
}

//    private static String getLongestCommonPrefixWithStringArrayOfAnySize(String[] strings, int minLength){
//        StringBuilder longestCommonPrefix = new StringBuilder();
//
//        for (int i = 0; i < minLength; i++) {
//            char currentChar = strings[0].charAt(i);
//            for (int j = 1; j < strings.length; j++) {
//                if (strings[j].charAt(i) != currentChar) {
//                    return longestCommonPrefix.toString();
//                }
//            }
//            longestCommonPrefix.append(currentChar);
//        }
//        return longestCommonPrefix.toString();
//    }