public class Solution {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        else if (length == 1) return nums[0];
        else if (length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }

    private int robRange(int[] nums, int start, int end) {
        int length = end - start + 1;
        if (length == 0) return 0;
        else if (length == 1) return nums[start];
        else if (length == 2) return Math.max(nums[start], nums[start + 1]);
        int[] dp = new int[length];
        dp[0] = nums[start];
        dp[1] = Math.max(dp[0], nums[start + 1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[start+i] + dp[i - 2]);
        }
        return dp[length - 1];
    }
}

