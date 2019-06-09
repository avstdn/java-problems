package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N728_Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (isDivide(left)) list.add(left);
            left++;
        }
        return list;
    }

    public boolean isDivide(int num) {
        int remainder = num;
        while (remainder > 0) {
            if (remainder % 10 == 0 || num % (remainder % 10) != 0) return false;
            remainder /= 10;
        }
        return true;
    }
}

// https://leetcode.com/problems/self-dividing-numbers/
