import java.util.*;

public class Solution {
    Set<List<Integer>> ans = new HashSet<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        backtracking(0, nums, length);
        return new ArrayList<>(ans);
    }

    private void backtracking(int index, int[] nums, int length) {
        if(index == length){
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[index]);
        backtracking(index+1, nums, length);
        path.remove(path.size()-1);
        backtracking(index+1, nums, length);

    }
}
