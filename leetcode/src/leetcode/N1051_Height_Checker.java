package leetcode;

import java.util.Arrays;

public class N1051_Height_Checker {
    public int heightChecker(int[] heights) {
        int diff = 0;
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) diff++;
        }

        return diff;
    }
}
// https://leetcode.com/problems/height-checker/