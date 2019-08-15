package leetcode;

public class N1009_Complement_of_Base_10_Integer {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;

        int mercenneNumber = 1;
        int n = N;

        while (n > 0) {
            n /= 2;
            mercenneNumber <<= 1;
        }

        return N ^ mercenneNumber - 1;
    }

    public int bitwiseComplementLee(int N) {
        int X = 1;

        while (N > X) X = X * 2 + 1;

        return X - N;
    }
}