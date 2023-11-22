public class Solution {
    public int minCameraCover(TreeNode root) {
        int[] res = dfs(root); // res[0] 为 root 节点的子树中，需要安装相机的最小数量
        return res[1]; // res[1] 为覆盖整棵树需要的相机数量
    }

    private int[] dfs(TreeNode root) {
        if (root == null) { // 空节点，不需要安装相机
            return new int[]{Integer.MAX_VALUE / 2, 0, 0}; // 为了防止溢出，这里选择一个较大的数除以 2
        }
        int[] left = dfs(root.left); // 左子树的信息
        int[] right = dfs(root.right); // 右子树的信息
        int[] res = new int[3];
        res[0] = left[2] + right[2] + 1; // res[0] 为 root 节点的子树中，需要安装相机的最小数量
        res[1] = Math.min(res[0], Math.min(left[0] + right[1], left[1] + right[0])); // res[1] 为覆盖整棵树需要的相机数量
        res[2] = Math.min(res[0], left[1] + right[1]); // res[2] 为覆盖两棵子树需要的相机数量
        return res;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
