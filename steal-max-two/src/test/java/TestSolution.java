import org.junit.Test;

public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums = {1,2,1,1};
        int max = solution.rob(nums);
        System.out.println(max);
        assert max == 3;
    }
}
