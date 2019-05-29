import java.util.Arrays;

public class Squares_of_a_Sorted_Array_977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
// https://leetcode.com/problems/squares-of-a-sorted-array/