public class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j, row, col);
                }
        return count;
    }

    private void dfs(char[][] grid, int startRow, int startCol, int row, int col) {
        if (startRow < 0 || startRow >= row || startCol < 0 || startCol >= col || grid[startRow][startCol] == '0')
            return;
        grid[startRow][startCol] = '0';
        dfs(grid, startRow - 1, startCol, row, col);
        dfs(grid, startRow + 1, startCol, row, col);
        dfs(grid, startRow, startCol - 1, row, col);
        dfs(grid, startRow, startCol + 1, row, col);
    }
}
