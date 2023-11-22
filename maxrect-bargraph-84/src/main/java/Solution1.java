import java.util.ArrayDeque;
import java.util.Deque;

/**training*/
public class Solution1 {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int[] left = new int[length];
        int[] right = new int[length];

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < length; i++){
            while(!deque.isEmpty() && heights[deque.peek()] >= heights[i]){
                deque.poll();
            }
            left[i] = deque.isEmpty()? -1 : deque.peek();
            deque.push(i);
        }
        deque.clear();
        for(int i = length-1; i >= 0; i--){
            while(!deque.isEmpty() && heights[deque.peek()] >= heights[i]){
                deque.poll();
            }
            right[i] = deque.isEmpty()? length : deque.peek();
            deque.push(i);
        }
        int ans = 0;
        for(int i = 0; i < length; i++){
            ans = Math.max(ans, (right[i]-left[i]-1)*heights[i]);
        }
        return ans;
    }
}
