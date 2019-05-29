public class Palindrome_Number_9 {
    public boolean isPalindrome(int x) {
//         if (x < 0) return false;

//         LinkedList<Integer> nums = new LinkedList<>();

//         while (x > 0) {
//             nums.add(x % 10);
//             x /= 10;
//         }

//         int len = nums.size() - 1;
//         for (int i = 0; i < nums.size() / 2; i++) {
//             if (nums.get(i) != nums.get(len - i)) return false;
//         }

//         return true;

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}
// https://leetcode.com/problems/palindrome-number/