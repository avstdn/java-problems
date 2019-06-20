package leetcode;

public class N509_Fibonacci_Number {
    public int fibRecursive(int N) {
        if (N < 2) return N;
        return fibRecursive(N - 1) + fibRecursive(N - 2);
    }

    public int fibIterative(int N) {
        if (N < 2) return N;

        int fib = 0;
        int last = 1;

        for (int i = 0; i < N; i++) {
            /*
             * With temp variable
             */
            // int temp = fib;
            // fib += last;
            // last = temp;

            fib += last;
            last = fib - last;
        }
        return fib;
    }

    public int fibClassic(int N) {
        int a = 1;
        int b = 1;

        for (int i = 2; i < N; i++) {
            a += b;
            b = a - b;
        }

        return N > 0 ? a : 0;
    }
}
// https://leetcode.com/problems/fibonacci-number/submissions/