package leetcode;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one
 * that is missing from the array.
 *
 * Example 1:
 * Input: [3,0,1]
 * Output: 2
 *
 * Example 2:
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using
 * only constant extra space complexity?
 */

public class N268_Missing_Number {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int subSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += i;
            subSum += nums[i];
        }

        return sum + nums.length - subSum;
    }
}
// https://leetcode.com/problems/missing-number/