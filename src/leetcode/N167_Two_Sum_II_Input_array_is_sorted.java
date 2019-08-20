package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2.
 *
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may
 * not use the same element twice.
 *
 * Example:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 *
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class N167_Two_Sum_II_Input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indexes = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                indexes[0] = map.get(numbers[i]);
                indexes[1] = i + 1;
                break;
            } else map.put(target - numbers[i], i + 1);
        }

        return indexes;
    }

    public int[] twoSumEfficient(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            if (numbers[start] + numbers[end] == target) break;
            if (numbers[start] + numbers[end] < target) start++;
            else end--;
        }
        return new int[] {start + 1, end + 1};
    }
}

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/