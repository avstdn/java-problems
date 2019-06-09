package codewars;

public class Snail {
    public static int[] snail(int[][] array) {
        int[] result = {};

        if (array.length < 2 && array[0].length > 0) {
            result = new int[array[0].length];

            for (int i = 0; i < array[0].length; i++) {
                result[i] = array[0][i];
            }
            return result;
        } else if (array.length > 1) {

            int firstRow = 0;
            int lastRow = array[0].length - 1;
            int firstColumn = 0;
            int lastColumn = array[1].length - 1;

            result = new int[array[0].length * array[1].length];
            int count = 0;

            while (firstRow <= lastColumn && firstColumn <= lastColumn) {
                for (int i = firstColumn; i <= lastColumn; i++) {
                    result[count++] = array[firstRow][i];
                }
                firstRow++;

                for (int i = firstRow; i <= lastRow; i++) {
                    result[count++] = array[i][lastColumn];
                }
                lastColumn--;

                for (int i = lastColumn; i >= firstColumn; i--) {
                    result[count++] = array[lastRow][i];
                }
                lastRow--;

                for (int i = lastRow; i >= firstRow; i--) {
                    result[count++] = array[i][firstColumn];
                }
                firstColumn++;
            }
            return result;
        }
        return result;
    }
}
// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1