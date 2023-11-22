import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<Integer> box = new ArrayList<>();
    boolean ans = false;
    public boolean canPartition(int[] nums) {
        List<Integer> container = new ArrayList<>();
        box = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        int length = nums.length;
        backtracking(length, 0, container);
        return ans;
    }

    private void backtracking(int length, int index, List<Integer> container) {
        if(container.stream().reduce(0, Integer::sum).equals(box.stream().reduce(0, Integer::sum))) {
            ans = true;
            return;
        }
        for(int i = index; i < length; i++) {
            if(ans) break;
            container.add(box.get(i));
            box.remove(i);
            backtracking(length-1, i, container);
            box.add(i, container.get(container.size() - 1));
            container.remove(container.size() - 1);
        }
    }
}
