public class Solution {
    int max = 0;
    int count = 0;

    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        backtracking(strs, length, m, n, 0);
        return max;
    }

    private void backtracking(String[] strs, int length, int m, int n, int index) {
        if (m >= 0 && n >= 0) {
            max = Integer.max(max, count);
        } else return;
        for (int i = index; i < length; i++) {
            int strLen = strs[i].length();
            for (int j = 0; j < strLen; j++) {
                if (strs[i].charAt(j) == '0') {
                    m--;
                } else if (strs[i].charAt(j) == '1') n--;
            }
            count++;
            backtracking(strs, length, m, n, i + 1);
            for (int j = 0; j < strLen; j++) {
                if (strs[i].charAt(j) == '0') {
                    m++;
                } else if (strs[i].charAt(j) == '1') n++;
            }
            count--;
        }
    }
}
