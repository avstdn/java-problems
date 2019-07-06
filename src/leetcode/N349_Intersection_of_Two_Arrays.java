package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class N349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    set.add(num1);
                    break;
                }
            }
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }

        return result;
    }
}
// https://leetcode.com/problems/intersection-of-two-arrays/