public class Highest_Scoring_Word {
    public static String high(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;
        int sum = 0;
        String high = "";
        String[] words = s.split(" ");

        for (String word : words) {
            for (char c : word.toCharArray()) {
                sum += alphabet.indexOf(c) + 1;
            }
            if (sum > max) {
                max = sum;
                high = word;
            }
            sum = 0;
        }
        return high;
    }
}
// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
