public class Find_the_stray_number {
    static int stray(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] == numbers[i+1]) {
                if (numbers[i+1] == numbers[i+2]) continue;
                else result = numbers[i+2];
            } else {
                if (numbers[i] == numbers[i+2]) result = numbers[i+1];
                else result = numbers[i];
            }
        }
        return result;
    }
}
// https://www.codewars.com/kata/57f609022f4d534f05000024