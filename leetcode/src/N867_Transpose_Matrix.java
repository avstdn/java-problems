public class N867_Transpose_Matrix {
    public int[][] transpose(int[][] A) {
        int columnLength = A.length;
        int rowLength = A[0].length;
        int[][] transpose = new int[rowLength][columnLength];

        for (int i = 0; i < columnLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                transpose[j][i] = A[i][j];
            }
        }

        return transpose;
    }
}
// https://leetcode.com/problems/transpose-matrix/submissions/