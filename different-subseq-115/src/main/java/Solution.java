class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) {
            return 0;
        }
        // dp[i][j] 表示 s[i..] 中 t[j..] 的个数
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for (int i = m - 1; i >= 0; i--) { // 从后往前遍历
            char sChar = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char tChar = t.charAt(j);
                if (sChar == tChar) { //如果相等，可以选择匹配也可以选择不匹配
                    //匹配：s[i] 和 t[j] 匹配，所以 dp[i][j] = dp[i + 1][j + 1]
                    //不匹配：s[i] 不和 t[j] 匹配，所以 dp[i][j] = dp[i + 1][j]
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    //不匹配：s[i] 不和 t[j] 匹配，所以 dp[i][j] = dp[i + 1][j]
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
}