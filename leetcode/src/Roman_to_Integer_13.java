public class Roman_to_Integer_13 {
    public int romanToInt(String s) {
        char[] nums = s.toCharArray();
        int length = nums.length - 1;
        char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int sum = 0;

        for (int i = length; i >= 0; i--) {
            if (i < length) {
                if (nums[i] == roman[0] && nums[i+1] == roman[1]) {
                    sum -= 1;
                } else if (nums[i] == roman[0] && nums[i+1] == roman[2]) {
                    sum -= 1;
                } else if (nums[i] == roman[2] && nums[i+1] == roman[3]) {
                    sum -= 10;
                } else if (nums[i] == roman[2] && nums[i+1] == roman[4]) {
                    sum -= 10;
                } else if (nums[i] == roman[4] && nums[i+1] == roman[5]) {
                    sum -= 100;
                } else if (nums[i] == roman[4] && nums[i+1] == roman[6]) {
                    sum -= 100;
                } else {
                    sum += checkSum(nums[i]);
                }
            } else {
                sum += checkSum(nums[i]);
            }
        }
        return sum;
    }

    public static int checkSum(char num) {
        int sum = 0;
        switch (num) {
            case 'I':
                sum += 1;
                break;
            case 'V':
                sum += 5;
                break;
            case 'X':
                sum += 10;
                break;
            case 'L':
                sum += 50;
                break;
            case 'C':
                sum += 100;
                break;
            case 'D':
                sum += 500;
                break;
            case 'M':
                sum += 1000;
                break;
        }
        return sum;
    }
}
// https://leetcode.com/problems/roman-to-integer/