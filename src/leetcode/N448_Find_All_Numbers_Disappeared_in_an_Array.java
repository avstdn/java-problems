package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear
 * twice and others appear once. Find all the elements of [1, n] inclusive that do not appear
 * in this array. Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 *
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * Output:
 * [5,6]
 */
public class N448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[nums[i] - 1] > 0) {
                nums[nums[i] - 1] = -nums[nums[i] - 1];
            } else if (-nums[i] > 0 && nums[-nums[i] - 1] > 0) {
                nums[-nums[i] - 1] = -nums[-nums[i] - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) list.add(i + 1);
        }

        return list;
    }
}
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/