import java.util.*;

public class Next_smaller_number_with_the_same_digits {

    public static long nextSmaller(long n) {
        long result = 0;
        long num = n;
        int swapPosition = -1;

        int[] digits = new int[Long.toString(n).length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int)(num % 10);
            num /= 10;
        }
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i+1] > digits[i]) {
                swapPosition = i+1;
                break;
            }
        }

        if (swapPosition < 0) return -1;

        int maxNumber = Integer.MIN_VALUE;
        int[] digitsSlice = Arrays.copyOfRange(digits, 0, swapPosition);

        for (int element : digitsSlice) {
            if (element >= maxNumber && element < digits[swapPosition]) {
                maxNumber = element;
            }
        }

        if (digits[swapPosition] < maxNumber) return -1;

        swap(digits, swapPosition, getArrayIndex(digits, maxNumber));
        Arrays.sort(digits, 0, swapPosition);

        if (digits[digits.length - 1] == 0) return -1;

        for (int i = 0; i < digits.length; i++) {
            result += digits[i] * (long)Math.pow(10, i);
        }

        return result;
    }

    public static void swap(int[] array, int swap, int max) {
        int temp = array[swap];
        array[swap] = array[max];
        array[max] = temp;
    }

    public static int getArrayIndex(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) return i;
        }
        return -1;
    }
}
// https://www.codewars.com/kata/5659c6d896bc135c4c00021e

