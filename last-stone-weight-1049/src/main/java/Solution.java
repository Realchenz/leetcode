class Solution {
    public int lastStoneWeightII(int[] stones) {
        int len = stones.length;
        int sum = 0;
        for(int stone : stones){
            sum = sum + stone;
        }
        int target = sum / 2;
        int ans = 0;
        boolean[][] dp = new boolean[len+1][target];
        dp[0][0] = true;
        for(int i = 1; i < len+1; i++){
            for(int j = 0; j <= target; j++){
                if(j > stones[i]){
                    dp[i][j] = dp[i-1][j]; //不选当前石头
                }else{
                    dp[i][j] = dp[i-1][j-stones[i]] || dp[i-1][j]; //选或不选当前石头
                }
            }
        }
        for(int i = target; i >= 0; i--){
            if(dp[len][i]) ans = sum -2*i;
        }
        return ans;
    }
}