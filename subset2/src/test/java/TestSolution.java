import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = solution.subsetsWithDup(nums);
        Assert.assertEquals(6, ans.size());
    }
}
