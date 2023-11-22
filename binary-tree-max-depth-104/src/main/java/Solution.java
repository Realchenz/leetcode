class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root != null){
            depth = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        return depth;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}