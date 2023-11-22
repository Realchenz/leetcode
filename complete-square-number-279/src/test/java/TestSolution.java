import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        int n = 12;
        int result = solution.numSquares(n);
        System.out.println(result);
    }
}
