package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of numbers arr. A sequence of numbers is called an arithmetic progression if
 * the difference between any two consecutive elements is the same.
 * Return true if the array can be rearranged to form an arithmetic progression, otherwise,
 * return false.
 *
 * Example 1:
 * Input: arr = [3,5,1]
 * Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
 *
 * Example 2:
 * Input: arr = [1,2,4]
 * Output: false
 * Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 *
 * Constraints:
 * 2 <= arr.length <= 1000
 * -10^6 <= arr[i] <= 10^6
 */
public class N1502_Can_Make_Arithmetic_Progression_From_Sequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
         Arrays.sort(arr);
         int diff = arr[1] - arr[0];

         for (int i = 1; i < arr.length - 1; i++) {
             if (arr[i + 1] - arr[i] != diff) {
                 return false;
             }
         }

         return true;
    }

    public boolean canMakeArithmeticProgressionSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int max = Math.max(arr[0], arr[1]);
        int min = Math.min(arr[0], arr[1]);

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }

            set.add(arr[i]);
        }

        int diff = (max - min) / (arr.length - 1);

        for (int i = 1; i < arr.length; i++) {
            if (!set.contains(min + i * diff)) {
                return false;
            }
        }

        return true;
    }
}
// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/