public class N999_Available_Captures_for_Rook {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        int count = 0;

        outer: for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break outer;
                }
            }
        }

        for (int i = ++x; i < board.length; i++) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') break;
        }
        for (int i = --x; i >= 0; i--) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') break;
        }
        for (int j = ++y; j < board.length; j++) {
            if (board[x][j] == 'p') {
                count++;
                break;
            } else if (board[x][j] == 'B') break;
        }
        for (int j = --y; j >= 0; j--) {
            if (board[x][j] == 'p') {
                count++;
                break;
            } else if (board[x][j] == 'B') break;
        }

        return count;
    }
}
// https://leetcode.com/problems/available-captures-for-rook/submissions/