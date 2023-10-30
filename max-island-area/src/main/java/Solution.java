public class Solution {
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if (grid[i][j] == 1){
                    dfs(grid, i, j, row, col);
                    maxArea = Math.max(maxArea, this.count);
                    this.count = 0;
                }
            }
        }
        return maxArea;

    }

    private void dfs(int[][] grid, int i, int j, int row, int col) {
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == 0){
            return;
        }
        this.count += 1;
        grid[i][j] = 0;
        dfs(grid, i+1, j, row, col);
        dfs(grid, i-1, j, row, col);
        dfs(grid, i, j-1, row, col);
        dfs(grid, i, j+1, row, col);
    }
}
