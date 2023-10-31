import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void testNumEnclaves1() {
        Solution solution = new Solution();
        int[][] grid = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        int result = solution.numEnclaves(grid);
        Assert.assertEquals(0, result);
    }
}
