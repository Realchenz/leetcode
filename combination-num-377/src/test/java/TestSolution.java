import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void testCombinationSum4() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int target = 4;
        int result = solution.combinationSum4(nums, target);
        System.out.println(result);
        assert result == 7;
    }

    @Test
    public void testCombinationSum4_2() {
        Solution1 solution1 = new Solution1();
        int[] nums = {3,5,7,8,9,10,11};
        int target = 500;
        int result = solution1.change(target, nums);
        System.out.println(result);
    }
}
