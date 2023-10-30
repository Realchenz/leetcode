import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName Solution
 * @Description To find all possible IP addresses from a given string.
 * @Author Zhenxu
 * @Date 2023/10/27
 **/
public class Solution {
    StringBuffer stringBuffer = new StringBuffer(); // 保存当前可能的IP地址
    List<String> ans = new ArrayList<>();  // 保存所有可能的IP地址
    int count = 0; // 记录当前已经有多少个子IP地址

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
        // 递归终止条件
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
            // 如果当前字符是有效的IP地址，则将其加入到stringBuffer中
            if(isValid(charSet, i, index)){
                for(int j = index; j <= i; j++){
                    stringBuffer.append(charSet[j]);
                }
                stringBuffer.append('.');
                count++;
            }else continue;
            backtracking(charSet, length, i+1);
            // 回溯
            for(int j = i; j >= index; j--){
                if(stringBuffer.charAt(stringBuffer.length()-1) == '.'){
                    stringBuffer.deleteCharAt(stringBuffer.length()-1);
                    count--;
                }
                stringBuffer.deleteCharAt(stringBuffer.length()-1); // 将当前字符从stringBuffer中删除
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
