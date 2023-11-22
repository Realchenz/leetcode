import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    List<List<Integer>> set = new ArrayList<>();
    List<Integer> container = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();
        int ans = 0, index1 = 0, index2 = 0;
        for (List<Integer> integers : set) {
            if (integers.contains(p.val)) {
                path1 = new ArrayList<>(integers);
                index1 = path1.indexOf(p.val);
                break;
            }
        }
        for (List<Integer> integers : set) {
            if (integers.contains(q.val)) {
                path2 = new ArrayList<>(integers);
                index2 = path2.indexOf(q.val);
                break;
            }
        }
        for(int i = 0; i < index1; i++){
            for(int j = 0; j < index2; j++){
                if(Objects.equals(path1.get(i), path2.get(j))){
                    ans = path2.get(j);
                }
            }
        }
        return new TreeNode(ans);
    }

    private void dfs(TreeNode root) {
        if(root.left == null && root.right == null){
            container.add(root.val);
            set.add(new ArrayList<>(container));
            container.remove(container.size()-1);
            return;
        }
        container.add(root.val);
        if (root.left != null) {
            dfs(root.left);
        }
        if(root.right != null){
            dfs(root.right);
        }
        container.remove(container.size()-1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
