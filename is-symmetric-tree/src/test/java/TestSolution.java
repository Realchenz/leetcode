import org.junit.Test;

public class TestSolution {
    @Test
    public void testIsSymmetric(){
        Solution solution = new Solution();
        TreeNode root = new TreeNode();
        boolean ans = solution.isSymmetric(root);
        assert !ans;
    }

}
