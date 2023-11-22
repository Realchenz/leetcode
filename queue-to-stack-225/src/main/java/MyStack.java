import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class MyStack {
    Deque<Integer> queue1;
    Deque<Integer> queue2;

    public MyStack() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if(queue1.isEmpty()){
            queue1.offerLast(x);
            while(!queue2.isEmpty()){
                queue1.offerLast(queue2.pollFirst());
            }
        } else if (queue2.isEmpty()) {
            queue2.offerLast(x);
            while(!queue1.isEmpty()){
                queue2.offerLast(queue1.pollFirst());
            }
        }
    }

    public int pop() {
        int ans = 0;
        if(queue1.isEmpty()){
            ans = queue2.pollFirst();
        } else if (queue2.isEmpty()) {
            ans = queue1.pollFirst();
        }
        return ans;
    }

    public int top() {
        int ans = 0;
        if(queue1.isEmpty()){
            ans = queue2.peekFirst();
        } else if (queue2.isEmpty()) {
            ans = queue1.peekFirst();
        }
        return ans;
    }

    public boolean empty() {
        boolean isQueue1Empty = queue1.isEmpty();
        boolean isQueue2Empty = queue2.isEmpty();
        return  isQueue1Empty&&isQueue2Empty;
    }
}