public class Solution {
    int max = 0;
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        else if(nums.length == 1) return nums[0];
        else if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < length; i++) {
            int tmp = 0;
            for(int j = 2; j <= i; j++){
                tmp = Math.max(tmp, nums[i] + dp[i - j]);
            }
            dp[i] = tmp;
            max = Math.max(max, tmp);
        }
        return max;
    }
}



