package leetcode;

public class N806_Number_of_Lines_To_Write_String {
//     public int[] numberOfLines(int[] widths, String S) {
//         String alph = "abcdefghijklmnopqrstuvwxyz";
//         int remainder = 0;
//         int rows = 0;

//         for (int i = 0; i < S.length(); i++) {
//             remainder += widths[alph.indexOf(S.charAt(i))];
//             if (remainder > 100) {
//                 rows++;
//                 remainder = widths[alph.indexOf(S.charAt(i))];
//             } else if (remainder == 100) {
//                 rows++;
//                 remainder = 0;
//             }
//         }
//         return new int[] {remainder > 0 ? ++rows : rows, remainder};
//     }

    public int[] numberOfLines(int[] widths, String S) {
        int remainder = 0;
        int rows = 1;

        for (int i = 0; i < S.length(); i++) {
            remainder += widths[S.charAt(i) - 'a'];
            if (remainder > 100) {
                rows++;
                remainder = widths[S.charAt(i) - 'a'];
            }
        }

        return new int[] {rows, remainder};
    }
}
// https://leetcode.com/problems/number-of-lines-to-write-string/