public class N961_N_Repeated_Element_in_Size_2N_Array {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length / 2 + 2; i++) {
            for (int j = 0; j < A.length / 2 + 2; j++) {
                if (i != j && A[i] == A[j]) return A[i];
            }
        }
        return -1;
    }
}