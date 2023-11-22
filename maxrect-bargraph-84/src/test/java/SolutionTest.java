import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLargestRectangleArea() {
        Solution s = new Solution();
        int[] heights = {2, 1, 5, 6, 2, 3};
        int expected = 10;
        int actual = s.largestRectangleArea(heights);
        assert (expected == actual);
    }

    @Test
    public void testLargestRectangleArea1() {
        Solution1 s = new Solution1();
        int[] heights = {4,2,0,3,2,4,3,4};
        int expected = 10;
        int actual = s.largestRectangleArea(heights);
        assert (expected == actual);
    }
}
