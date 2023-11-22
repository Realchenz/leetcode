import org.junit.jupiter.api.Test;


public class TestSolution {
    @Test
    public void testMinDistance() {
        Solution solution = new Solution();
        String word1 = "sea", word2 = "eat";
        int result = solution.minDistance(word1, word2);
        System.out.println(result);
    }
}
