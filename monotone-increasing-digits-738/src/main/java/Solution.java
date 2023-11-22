class Solution {
    public int monotoneIncreasingDigits(int n) {
        String original = Integer.toString(n);
        char[] digits = original.toCharArray();
        int length = digits.length;
        for (int i = 0; i < length - 1; i++) {
            if (digits[i] > digits[i + 1]) {
                digits[i]--;
                digits[i + 1] = '9';
                int j = i+1;
                while(j < length){
                    digits[j] = '9';
                    j++;
                }
                while (i - 1 >= 0 && digits[i - 1] > digits[i]) {
                    digits[i - 1]--;
                    digits[i] = '9';
                    i--;
                }
            }
        }
        return Integer.parseInt(String.valueOf(digits));
    }
}
