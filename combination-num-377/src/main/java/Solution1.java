import java.util.Arrays;

class Solution1 {
    int ans = 0;

    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        int length = coins.length;
        backtracking(coins, amount, length, 0);
        return ans;
    }

    void backtracking(int[] coins, int target, int length, int index) {
        if (target == 0) {
            ans += 1;
            return;
        } else if (target < 0) {
            return;
        }
        for (int i = index; i < length; i++) {
            if(target < coins[i]) break;
            backtracking(coins, target - coins[i], length, i);
        }
    }
}
