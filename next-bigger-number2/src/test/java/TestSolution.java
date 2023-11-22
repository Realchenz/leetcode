import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void testNextGreaterElements(){
        Solution solution = new Solution();
        int[] nums = {1,2,1};
        int[] res = solution.nextGreaterElements(nums);
        Assert.assertArrayEquals(new int[]{2,-1,2}, res);
    }

    @Test
    public void testNextGreaterElements1(){
        Solution1 solution = new Solution1();
        int[] nums = {1,2,1};
        int[] res = solution.nextGreaterElements(nums);
        Assert.assertArrayEquals(new int[]{2,-1,2}, res);
    }
}
