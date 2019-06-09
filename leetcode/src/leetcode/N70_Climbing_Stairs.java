package leetcode;

public class N70_Climbing_Stairs {
    public int climbStairs(int n) {
        if (n < 2) return 1;
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            a += b;
            b = a - b;
        }
        return b;
    }
}
// https://leetcode.com/problems/climbing-stairs/