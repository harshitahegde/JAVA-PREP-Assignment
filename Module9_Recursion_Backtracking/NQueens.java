package Module9_Recursion_Backtracking;

// LeetCode 51 – N-Queens
import java.util.*;

class NQueens {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) Arrays.fill(row, '.');

        place(result, board, 0);
        return result;
    }

    void place(List<List<String>> result, char[][] board, int row) {

        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) temp.add(new String(r));
            result.add(temp);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (safe(board, row, col)) {
                board[row][col] = 'Q';
                place(result, board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    boolean safe(char[][] board, int row, int col) {

        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }
}
