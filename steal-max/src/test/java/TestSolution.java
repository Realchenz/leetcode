import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
@Slf4j
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums = {6,6,4,8,4,3,3,10};
        int max = solution.rob(nums);
        System.out.println(max);
        log.info("max:{}", max);
        assert max == 27;
    }
}
