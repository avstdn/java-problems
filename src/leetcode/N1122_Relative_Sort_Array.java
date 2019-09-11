package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in
 * arr2 are also in arr1. Sort the elements of arr1 such that the relative ordering of items in arr1 are the same
 * as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 * Example 1:
 *   Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 *   Output: [2,2,2,1,4,3,3,9,6,7,19]
 *
 * Constraints:
 *   arr1.length, arr2.length <= 1000
 *   0 <= arr1[i], arr2[i] <= 1000
 *   Each arr2[i] is distinct.
 *   Each arr2[i] is in arr1.
 */

public class N1122_Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0, j = 0; i < arr2.length; i++) {
            int count = map.getOrDefault(arr2[i], 0);

            while(count-- > 0) {
                list.add(arr2[i]);
            }

            map.remove(arr2[i]);
        }

        for (Integer i : map.keySet()) {
            int count = map.get(i);

            while(count-- > 0) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
// https://leetcode.com/problems/relative-sort-array/