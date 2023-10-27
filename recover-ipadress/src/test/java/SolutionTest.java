import org.junit.Test;

import java.util.List;


public class SolutionTest {
    @Test
    public void test1() {
        List<String> ans = new Solution().restoreIpAddresses("101023");
        assert ans.size() == 5;
    }

}
