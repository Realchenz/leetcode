import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums = {1,5,11,5};
        boolean ans = solution.canPartition(nums);
        System.out.println(ans);
    }
}
