import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution1Test {
    @Test
    public void testPartition() {
        Solution1 solution = new Solution1();
        List<List<String>> result = solution.partition("aab");
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a", "a", "b"));
        expected.add(Arrays.asList("aa", "b"));
        assertEquals(expected, result);
    }
}
