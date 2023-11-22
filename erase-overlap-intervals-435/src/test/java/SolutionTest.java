import org.junit.Test;

public class SolutionTest {
    @Test
    public void testEraseOverlapIntervals() {
        int[][] intervals = new int[][]{{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        Solution solution = new Solution();
        int ans = solution.eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }
}
