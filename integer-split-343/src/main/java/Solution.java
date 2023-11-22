class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 1; j < i; j++){
                max = Math.max(Math.max(max, j * dp[i-j]), j * (i-j));
            }
            dp[i] = max;
        }
        return dp[n];
    }
}