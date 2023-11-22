import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 回溯，超出时间限制
 */
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> member = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        backtracking(nums, target, 0, length);
        return ans;
    }

    private void backtracking(int[] nums, int target, int index, int length) {
        if(target == 0 && member.size()==4){
            if(!ans.contains(member)){
                ans.add(new ArrayList<>(member));
            }else return;
        }else if(member.size() == 4){
            return;
        }
        for(int i = index; i < length; i++){
            member.add(nums[i]);
            target -= nums[i];
            backtracking(nums, target, i+1, length);
            member.remove(member.size()-1);
            target += nums[i];
        }
    }
}
