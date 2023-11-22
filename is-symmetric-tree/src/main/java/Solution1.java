/**
 * 递归实现
 */
public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        // 递归的终止条件是两个节点都为空
        // 或者两个节点中有一个为空
        // 或者两个节点的值不相等
        if (left == null && right == null) {
            return true;
        }
        if (left == null ^ right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        // 再递归的比较 左节点的左孩子 和 右节点的右孩子
        // 以及比较  左节点的右孩子 和 右节点的左孩子
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
