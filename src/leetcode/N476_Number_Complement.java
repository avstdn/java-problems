package leetcode;

public class N476_Number_Complement {
    public int findComplement(int num) {
        int b = 1;
        int n = num;

        while (n > 0) {
            b <<= 1;
            n >>= 1;
        }

        return num ^ (b - 1);
    }
}
// https://leetcode.com/problems/number-complement/submissions/