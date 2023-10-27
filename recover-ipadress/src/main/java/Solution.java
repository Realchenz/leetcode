import java.util.ArrayList;
import java.util.List;

public class Solution {
    StringBuffer stringBuffer = new StringBuffer();
    List<String> ans = new ArrayList<>();
    int count = 0;

    /**
     * @param s 输入字符串
     * @return 返回所有可能的IP地址
     */
    public List<String> restoreIpAddresses(String s) {
        int length = s.length();
        char[] charSet = s.toCharArray();
        backtracking(charSet, length, 0);
        return ans;
    }
    /**
     * @param charSet 输入字符串的字符数组
     * @param length  输入字符串的长度
     * @param index   当前遍历到的字符的下标
     */
    void backtracking(char[] charSet, int length, int index){
        if(index == length && count == 4){
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
            count--;
            ans.add(stringBuffer.toString());
            return;
        }else if(count == 4){
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
            count--;
            return;
        }
        for(int i = index; i < length; i++){
            if(isValid(charSet, i, index)){
                for(int j = index; j <= i; j++){
                    stringBuffer.append(charSet[j]);
                }
                stringBuffer.append('.');
                count++;
            }else continue;
            backtracking(charSet, length, i+1);
            for(int j = i; j >= index; j--){
                if(stringBuffer.charAt(stringBuffer.length()-1) == '.'){
                    stringBuffer.deleteCharAt(stringBuffer.length()-1);
                    count--;
                }
                stringBuffer.deleteCharAt(stringBuffer.length()-1);
            }
        }
    }
    /**
     * @param charSet 输入字符串的字符数组
     * @param right   当前遍历到的字符的下标
     * @param left    当前遍历到的字符的下标
     * @return        返回是否是有效的IP地址
     */
    boolean isValid(char[] charSet, int right, int left){
        if (right - left >= 3) return false;
        String num = new String(charSet, left, right - left + 1);
        if(num.length() > 1 && num.startsWith("0")) return false;
        int n = Integer.parseInt(num);
        return n <= 255;
    }
}
