public class Solution {
    int count = 0;
    boolean flag = false;
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        for(int i = 1; i < row-1; i++){
            for(int j = 1; j < col-1; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j, row, col);
                    ans += count;
                    flag = false;
                    count = 0;
                }
            }
        }
        return ans;

    }

    private void dfs(int[][] grid, int i, int j, int row, int col) {
        if( i < 0 || j < 0 || i > row-1 || j > col-1 ||grid[i][j] == 0) return;
        if((i == row-1 || j == col-1 || i == 0 || j == 0) && grid[i][j] == 1){
            count = 0;
            flag = true;
        }
        if(!flag && grid[i][j] == 1){
            count++;
        }
        grid[i][j] = 0;
        dfs(grid, i-1, j, row, col);
        dfs(grid, i+1, j, row, col);
        dfs(grid, i, j-1, row, col);
        dfs(grid, i, j+1, row, col);
    }
}
