import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] res = solution.nextGreaterElement(num1, num2);
        Assert.assertArrayEquals(new int[]{-1, 3, -1}, res);
    }

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] res = solution.nextGreaterElement(num1, num2);
        Assert.assertArrayEquals(new int[]{-1, 3, -1}, res);
    }
}
