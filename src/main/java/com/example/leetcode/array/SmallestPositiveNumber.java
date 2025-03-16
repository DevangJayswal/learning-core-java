package com.example.leetcode.array;

import java.util.HashSet;
import java.util.Set;


public class SmallestPositiveNumber {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 6, 4, 1, 2}; // 5
//        int[] A = new int[]{-1, -3}; // 1
//        int[] A = new int[]{1, 2, 3}; // 4

        System.out.println(getSmallestPositiveNumber(A));
    }

    private static int getSmallestPositiveNumber(int[] numArray){
        Set<Integer> numbers = new HashSet<>();

        for (int n : numArray) {
            if (n > 0) {
                numbers.add(n);
            }
        }
        int smallestNumber = 1;

        // if smallestNumber is present (contains) in numbers, then keep incrementing smallestNumber
        // if smallestNumber is not present (contains) of numbers, then return smallestNumber

        while(numbers.contains(smallestNumber)){
            smallestNumber++;
        }
        return smallestNumber;
    }

    private static int getSmallestPositiveNumberNotSoOptimal(int[] numArray){
        Set<Integer> numbers = new HashSet<>();

        for (int n : numArray) {
            if (n > 0) {
                numbers.add(n);
            }
        }
        int smallestNumber = 1;

        // i = 1 -> starting with the smallest number
        // check if `i` is present in numbers
        for (int i = 1; numbers.contains(i); i++) {
            smallestNumber = i + 1;
        }
        return smallestNumber;
    }

}

// Your code is syntactically correct and works properly on the example test.
//Note that the example tests are not part of your score. On submission at least 8 test cases not shown here will assess your solution.
