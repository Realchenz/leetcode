import java.util.ArrayList;
import java.util.List;

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        List<Integer> original = new ArrayList<>();
        inorderTraversal(original, root);
        for(int i = 0; i < original.size(); i++){
            if(original.get(i) > val) {
                original.add(i, val);
                break;
            }
        }
        return sortedListToBST(original);
    }

    private TreeNode sortedListToBST(List<Integer> original) {
        return helper(original, 0, original.size() - 1);
    }

    private TreeNode helper(List<Integer> original, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(original.get(mid));
        root.left = helper(original, start, mid - 1);
        root.right = helper(original, mid+1, end);
        return root;
    }

    private void inorderTraversal(List<Integer> original, TreeNode root) {
        if(root == null) return;
        inorderTraversal(original, root.left);
        original.add(root.val);
        inorderTraversal(original, root.right);
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
