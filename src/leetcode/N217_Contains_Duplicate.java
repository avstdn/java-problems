package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice
 * in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class N217_Contains_Duplicate {
//     public boolean containsDuplicate(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int num : nums) {
//             if (map.getOrDefault(num, 0) > 0) return true;
//             else map.put(num, 1);
//         }

//         return false;
//     }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) return true;
        }

        return false;
    }
}
// https://leetcode.com/problems/contains-duplicate/submissions/