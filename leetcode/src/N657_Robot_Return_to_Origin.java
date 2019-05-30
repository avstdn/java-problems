public class N657_Robot_Return_to_Origin {
    public boolean judgeCircle(String moves) {
        int[] coords = {0, 0};

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    coords[0]++;
                    break;
                case 'D':
                    coords[0]--;
                    break;
                case 'R':
                    coords[1]++;
                    break;
                case 'L':
                    coords[1]--;
                    break;
            }
        }
        return coords[0] == 0 && coords[1] == 0;
    }
}
// https://leetcode.com/problems/robot-return-to-origin/