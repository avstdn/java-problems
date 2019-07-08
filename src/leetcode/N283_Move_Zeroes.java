package leetcode;

/**
 * Given an array nums, write a function to move all 0's to the end of
 * it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class N283_Move_Zeroes {
    // public void moveZeroes(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != 0) {
    //             int leftMoveIndex = i;
    //             while (leftMoveIndex > 0 && nums[leftMoveIndex-1] == 0) {
    //                     int temp = nums[leftMoveIndex];
    //                     nums[leftMoveIndex] = nums[leftMoveIndex-1];
    //                     nums[leftMoveIndex-1] = temp;
    //                 leftMoveIndex--;
    //             }
    //         }
    //     }
    // }

    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
        }
    }
}
// https://leetcode.com/problems/move-zeroes/submissions/