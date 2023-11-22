import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    Deque<Integer> deque = new LinkedList<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int max = Integer.MIN_VALUE;
        for (int k : nums2) {
            max = Math.max(max, k);
        }
        int[] next = new int[max + 1];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int j : nums2) {
            while (!deque.isEmpty()) {
                if (deque.peekLast() < j) {
                    next[deque.pollLast()] = j;
                } else {
                    break;
                }
            }
            deque.offer(j);
        }
        int[] res = new int[len1];
        for (int i = 0; i < len1; i++) {
            res[i] = next[nums1[i]] == Integer.MAX_VALUE ? -1 : next[nums1[i]];
        }
        return res;
    }
}
