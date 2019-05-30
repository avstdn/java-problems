public class N832_Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < Math.ceil(A[i].length / 2.0); j++) {
                int temp = A[i][A[i].length - 1 - j] > 0 ? 0 : 1;
                A[i][A[i].length - 1 - j] = A[i][j] > 0 ? 0 : 1;
                A[i][j] = temp;
            }
        }
        return A;
    }
}
// https://leetcode.com/problems/flipping-an-image/