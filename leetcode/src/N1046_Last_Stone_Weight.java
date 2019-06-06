import java.util.Arrays;

public class N1046_Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) return 0;
        else if (stones.length == 1) return stones[0];

        int N = stones.length - 1;
        Arrays.sort(stones);

        int first = Math.min(stones[N], stones[N-1]);
        int second = Math.max(stones[N], stones[N-1]);

        if (first == second) N--;
        else stones[N-1] = second - first;

        int[] subArray = Arrays.copyOfRange(stones, 0, N);

        return lastStoneWeight(subArray);
    }
}

// https://leetcode.com/problems/last-stone-weight/submissions/