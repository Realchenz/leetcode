import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void testAllPathsSourceTarget() {
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> ans = new Solution().allPathsSourceTarget(graph);
        assert ans.size() == 2;
    }
}
