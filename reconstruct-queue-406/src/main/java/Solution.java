import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] person1, int[] person2) {
                if(person1[0] != person2[0]){
                    return person2[0] - person1[0];
                }else {
                    return person1[1] - person2[1];
                }
            }
        });
        List<int[]> queue = new ArrayList<>();
        for (int[] person : people) {
            queue.add(person[0], person);
        }
        return queue.toArray(new int[0][0]);
    }
}
