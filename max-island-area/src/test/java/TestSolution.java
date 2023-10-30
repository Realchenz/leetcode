import org.junit.Test;

public class TestSolution {
    @Test
    public void testMaxAreaOfIsland(){
        int[][] grid = {{1,1,0,0,0},
                        {1,1,0,0,0},
                        {0,0,0,1,1},
                        {0,0,0,1,1}};
        Solution solution = new Solution();
        int maxArea = solution.maxAreaOfIsland(grid);
        System.out.println(maxArea);
    }
}
