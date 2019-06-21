package leetcode;

public class N762_Prime_Number_of_Set_Bits_in_Binary_Representation {
    public int countPrimeSetBits(int L, int R) {
        int result = 0;

        while (L <= R) {
            int bitsCount = 0;
            int nextNum = L++;
            while (nextNum > 0) {
                // if ((nextNum & 1) == 1) bitsCount++;
                if (nextNum % 2 != 0) bitsCount++;
                nextNum >>= 1;
            }
            if (isPrime(bitsCount)) result++;
        }

        return result;
    }

    private boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/