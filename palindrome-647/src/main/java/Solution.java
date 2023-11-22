/**
 * 回溯
 * 最长回文子序列
 */
class Solution {
    StringBuilder stringBuilder = new StringBuilder();
    int sum = 0;
    public int countSubstrings(String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();
        backtracking(charArray, 0, len);
        return sum;
    }

    private void backtracking(char[] charArray, int index, int len) {
        if(isPalindrome(stringBuilder)){
            sum++;
            return;
        }else if(index == len) return;
        for(int i = index; i < len; i++){
            stringBuilder.append(charArray[i]);
            backtracking(charArray, i+1, len);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    private boolean isPalindrome(StringBuilder stringBuilder) {
        String reverse = stringBuilder.reverse().toString();
        return reverse.contentEquals(stringBuilder);
    }
}
