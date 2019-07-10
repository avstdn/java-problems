package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority
 * element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element
 * always exist in the array.
 *
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class N169_Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer num : map.keySet()) {
            if (map.get(num) > nums.length / 2) return num;
        }

        return -1;
    }
}
// https://leetcode.com/problems/majority-element/