class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length+1];
        dp[0] = 0; //到达0层台阶的代价
        dp[1] = 0;
        for(int i = 2; i <= length; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[length];
    }
}