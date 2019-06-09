package leetcode;

public class N922_Sort_Array_By_Parity_II {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int even = 0;
        int odd = 1;

        for (int i : A) {
            if (i % 2 == 0) {
                result[even] = i;
                even += 2;
            } else {
                result[odd] = i;
                odd += 2;
            }
        }
        return result;
    }
}
// https://leetcode.com/problems/sort-array-by-parity-ii/submissions/