import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String removeDuplicates(String s) {
        char[] charArray = s.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(char c : charArray){
            charList.add(c);
        }
        for(int i = 0; i < charList.size()-1; i++){
            if(i == -1) {
                continue;
            }
            if(charList.get(i) == charList.get(i+1)){
                charList.remove(i);
                charList.remove(i);
                i -= 2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : charList){
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
