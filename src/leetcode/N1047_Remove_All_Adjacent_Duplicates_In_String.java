package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class N1047_Remove_All_Adjacent_Duplicates_In_String {
//     public String removeDuplicates(String S) {
//         boolean dup = true;

//         while (dup) {
//             dup = false;
//             for (int i = 0; i < S.length() - 1; i++) {
//                 if (S.charAt(i) == S.charAt(i+1)) {
//                     dup = true;
//                     String c = S.charAt(i) + "";
//                     S = S.replace(c + c, "");
//                 }
//             }
//         }

//         return S;
//     }

    public String removeDuplicates(String S) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character s : stack) sb.append(s);

        return sb.reverse().toString();
    }
}
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/