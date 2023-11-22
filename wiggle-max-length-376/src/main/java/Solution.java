/**
 * dp[i][0] 表示以 nums[i] 结尾的最长摆动序列的长度，且 nums[i] < nums[i - 1]
 */
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int[] up = new int[n]; // up[i] 表示以 nums[i] 结尾的最长摆动序列的长度，且 nums[i] > nums[i - 1]
        int[] down = new int[n]; // down[i] 表示以 nums[i] 结尾的最长摆动序列的长度，且 nums[i] < nums[i - 1]
        up[0] = down[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up[i] = Math.max(up[i - 1], down[i - 1] + 1);
                down[i] = down[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                up[i] = up[i - 1];
                down[i] = Math.max(up[i - 1] + 1, down[i - 1]);
            } else {
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[n - 1], down[n - 1]);
    }
}