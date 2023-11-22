import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>正序<p/>
 * 单调栈+循环数组  扩大遍历的边界条件
 *
 */
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n * 2 - 1; i++) {   // 枚举两倍长度，避免循环数组的操作
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n]; // 栈顶元素出栈，因为已经找到了它的下一个更大元素
            }
            stack.push(i % n); // 保证栈中元素的索引在 [0,n−1] 的范围内
        }
        return ret;
    }
}
