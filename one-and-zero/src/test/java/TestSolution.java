import org.junit.Test;

public class TestSolution {
    @Test
    public void testFindMaxForm(){
        Solution solution = new Solution();
        String[] strs = {"10", "0", "1"};
        int m = 1, n = 1;
        int result = solution.findMaxForm(strs, m, n);
        assert result == 2;
    }

}
