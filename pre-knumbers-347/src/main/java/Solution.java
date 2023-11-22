import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Map.Entry<Integer, Integer>> entrySets = new ArrayList<>(map.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList());
        Collections.reverse(entrySets);
        for(int i = 0; i < k; i++){
            ans[i] = entrySets.get(i).getKey();
        }
        return ans;
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            frequency.add(entry.getValue());
//        }
//        frequency.sort((a, b) -> b-a);
//        Collections.sort(frequency);
//        List<Integer> resultFreq = frequency.stream().limit(k).toList();
//

    }
}
