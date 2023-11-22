import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void testIntegerBreak() {
        Solution solution = new Solution();
        int n = 10;
        int result = solution.integerBreak(n);
        assert result == 36;
    }
}
