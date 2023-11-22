import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> member = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    boolean isAchieved = false;
    boolean pacific = false;
    boolean atlanta = false;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        int[][] isVisited = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                dfs(heights, i, j, row, col, isVisited);
                if(isAchieved){
                    member.add(i); member.add(j); ans.add(new ArrayList<>(member));
                }
                member.clear();
                isAchieved = false;
                pacific = false;
                atlanta = false;
                isVisited = new int[row][col];
            }
        }
        return ans;
    }

    private void dfs(int[][] heights, int i, int j, int row, int col, int[][] isVisited) {
        if(i == 0 || j == 0) {
            pacific = true;
        }
        if(i == row-1 || j == col-1){
            atlanta = true;
        }
        if(pacific && atlanta){
            isAchieved = true;
            return;
        }
        if(i < 0 || i >= row || j < 0 || j >= col){
            return;
        }
        isVisited[i][j] = 1;
        if(i > 0 && heights[i-1][j] <= heights[i][j] && isVisited[i-1][j] == 0) dfs(heights, i-1, j, row, col, isVisited);
        if(i < row-1 && heights[i+1][j] <= heights[i][j] && isVisited[i+1][j] == 0) dfs(heights, i+1, j, row, col, isVisited);
        if(j > 0 && heights[i][j-1] <= heights[i][j] && isVisited[i][j-1] == 0) dfs(heights, i, j-1, row, col, isVisited);
        if(j < col-1 && heights[i][j+1] <= heights[i][j] && isVisited[i][j+1] == 0) dfs(heights, i, j+1, row, col, isVisited);
    }
}
