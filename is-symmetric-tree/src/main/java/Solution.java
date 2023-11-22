import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    List<String> list = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        inorder(root, 1);
        boolean ans = isPalindrome(list);
        return ans;
    }

    private boolean isPalindrome(List<String> list) {
        int length = list.size();
        for(int i = 0; i < length/2; i++){
            if(!Objects.equals(list.get(i), list.get(length - 1 - i))){
                return false;
            }
        }
        return true;
    }

    private void inorder(TreeNode root, int level) {
        if(root == null) return;
        inorder(root.left, level + 1);
        list.add(root.val+"-"+level);
        inorder(root.right, level + 1);
    }
}

class TreeNode {
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
