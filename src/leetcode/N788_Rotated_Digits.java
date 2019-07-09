package leetcode;

/**
 * X is a good number if after rotating each digit individually by
 * 180 degrees, we get a valid number that is different from X.
 * Each digit must be rotated - we cannot choose to leave it alone.
 * A number is valid if each digit remains a digit after rotation.
 * 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other;
 * 6 and 9 rotate to each other, and the rest of the numbers do not
 * rotate to any other number and become invalid.
 *
 * Now given a positive number N, how many numbers X from 1 to N are good?
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 *
 * Note:
 * N  will be in range [1, 10000].
 */
public class N788_Rotated_Digits {
    public int rotatedDigits(int N) {
        int goodNumbersCount = 0;

        for (int i = 1; i <= N; i++) {
            int n = i;
            boolean badNumber = false;
            boolean goodNumber = false;

            while (n > 0) {
                int lastDigit = n % 10;
                if (isGoodDigit(lastDigit)) {
                    goodNumber = true;
                } else if (isBadDigit(lastDigit)) {
                    badNumber = true;
                    break;
                }
                n /= 10;
            }

            if (!badNumber && goodNumber) {
                goodNumbersCount++;
            }
        }

        return goodNumbersCount;
    }

    private boolean isGoodDigit(int n) {
        return n == 2 || n == 5 || n == 6 || n== 9;
    }

    private boolean isBadDigit(int n) {
        return n == 3 || n == 4 || n == 7;
    }
}
// https://leetcode.com/problems/rotated-digits/submissions/