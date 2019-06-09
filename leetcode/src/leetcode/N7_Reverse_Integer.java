package leetcode;

public class N7_Reverse_Integer {
    public int reverse(int x) {
        int mult = 1;
        String result = "";

        if (x < 0) {
            while (x < 0) {
                result += -x % 10 + "";
                x /= 10;
            }
            result = "-" + result;
        } else {
            while (x > 0) {
                result += x % 10 + "";
                x /= 10;
            }
        }
        if (result.isEmpty()) return 0;
        else {
            try {
                return Integer.parseInt(result);
            } catch(NumberFormatException e) {
                return 0;
            }
        }
    }
}
// https://leetcode.com/problems/reverse-integer/