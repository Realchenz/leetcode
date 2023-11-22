import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void testNumDistinct() {
        Solution solution = new Solution();
        String s = "babgbag";
        String t = "bag";
        int result = solution.numDistinct(s, t);
        System.out.println(result);
    }
}
