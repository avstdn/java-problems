import java.util.LinkedList;

public class Sort_Array_By_Parity_905 {
    public int[] sortArrayByParity(int[] A) {
        LinkedList list = new LinkedList();

        for (int num : A) {
            if (num % 2 == 0) list.addFirst(num);
            else list.addLast(num);
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = (int)list.poll();
        }

        return A;
    }
}
// https://leetcode.com/problems/sort-array-by-parity/