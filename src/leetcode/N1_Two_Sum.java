package leetcode;

import java.util.HashMap;

public class N1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(target-nums[i], i);
            else {
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/two-sum/
