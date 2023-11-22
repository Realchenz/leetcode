import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>逆序<p/>
 */
class Solution1 {
    //单调栈+循环数组  扩大遍历的边界条件
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[nums.length];
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int index = i % nums.length;//ans[index]
            while (!deque.isEmpty() && deque.peek() <= nums[index]) {
                deque.pop();
            }
            ans[index] = deque.isEmpty() ? -1 : deque.peek();
            deque.push(nums[index]);
        }
        return ans;
    }
}