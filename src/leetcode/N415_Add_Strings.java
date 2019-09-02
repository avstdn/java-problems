package leetcode;

/**
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1
 * and num2.
 *
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

public class N415_Add_Strings {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        String first = num1;
        String second = num2;
        StringBuilder sb = new StringBuilder();

        if (num1.length() < num2.length()) {
            first = num2;
            second = num1;
        }

        for (int i = first.length() - 1, j = second.length() - 1; i >= 0; i--, j--) {
            int firstDigit = first.charAt(i) - '0';
            int secondDigit = 0;

            if (j >= 0) secondDigit = second.charAt(j) - '0';

            int sum = firstDigit + secondDigit + carry;
            carry = sum > 9 ? 1 : 0;
            sb.append(sum % 10);
        }

        if (carry > 0) sb.append(carry);

        return sb.reverse().toString();
    }

    public String addStringsDiscuss(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int first = i < 0 ? 0 : num1.charAt(i) - '0';
            int second = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((first + second + carry) % 10);
            carry = (first + second + carry) / 10;
        }

        return sb.reverse().toString();
    }
}
// https://leetcode.com/problems/add-strings/