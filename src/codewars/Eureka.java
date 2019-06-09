package codewars;

import java.util.*;

public class Eureka {
    public static List<Long> sumDigPow(long a, long b) {
        LinkedList<Long> list = new LinkedList<>();
        ArrayList<Long> result = new ArrayList<>();
        long num, sum;

        for (long i = a; i <= b; i++) {
            num = i;
            while (num > 0) {
                list.add(num % 10);
                num /= 10;
            }

            sum = 0;
            for (int j = 1; !list.isEmpty(); j++) {
                sum += Math.pow(list.pollLast(), j);
            }

            if (i == sum) result.add(sum);
        }

        return result;
    }
}
// https://www.codewars.com/kata/5626b561280a42ecc50000d1
