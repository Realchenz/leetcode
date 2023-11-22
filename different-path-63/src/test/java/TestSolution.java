import org.junit.Test;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[][] obstacleGrid = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int result = solution.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(result);
    }
}
