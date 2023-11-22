import java.util.ArrayList;
import java.util.List;

class Solution {
    private boolean[][] line = new boolean[9][9]; // line[i][j] means whether j is in line i
    private boolean[][] column = new boolean[9][9]; // column[i][j] means whether j is in column i
    private boolean[][][] block = new boolean[3][3][9]; // block[i][j][k] means whether k is in block (i, j)
    private boolean valid = false; // whether the current board is valid
    private List<int[]> spaces = new ArrayList<>(); // spaces[i] means the position of the i-th empty cell

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                } else {
                    int digit = board[i][j] - '0' - 1;  // 1-9 -> 0-8
                    // line[i][digit] = true means digit is in line i
                    // column[j][digit] = true means digit is in column j
                    // block[i / 3][j / 3][digit] = true means digit is in block (i, j)
                    line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                }
            }
        }

        dfs(board, 0);
    }

    public void dfs(char[][] board, int pos) {
        // pos is the index of the current empty cell
        if (pos == spaces.size()) {
            valid = true;
            return;
        }

        int[] space = spaces.get(pos);
        int i = space[0], j = space[1];
        for (int digit = 0; digit < 9 && !valid; ++digit) {
            if (!line[i][digit] && !column[j][digit] && !block[i / 3][j / 3][digit]) {
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                board[i][j] = (char) (digit + '0' + 1);
                dfs(board, pos + 1);
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = false;
            }
        }
    }
}

