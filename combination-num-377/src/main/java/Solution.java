import java.util.Arrays;

class Solution {
    int ans = 0;

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        backtracking(nums, target, length);
        return ans;
    }

    void backtracking(int[] nums, int target, int length) {
        if (target == 0) {
            ans += 1;
            return;
        } else if (target < 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            if (target < nums[i]) {
                break;
            }
            backtracking(nums, target - nums[i], length);
        }
    }
}
