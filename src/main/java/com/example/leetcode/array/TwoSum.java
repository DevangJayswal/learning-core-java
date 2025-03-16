package com.example.leetcode.array;

/**
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
 * <p>
 * Input: nums = [3,3], target = 6 Output: [0,1]
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

//        int[] nums = {3, 2, 4};
//        int target = 6;

//        int[] nums = {3, 3};
//        int target = 6;

        // call twoSum and print the result
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}

// if n=3 then pattern
// [0,1] [0,2] [0,3]
// [1,2] [1,3]
// [2,3]