import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public MyQueue() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }

    public void push(int x) {
        stack2.offerLast(x);
    }

    public int pop() {
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.offerLast(stack2.removeLast());
            }
        }
        return stack1.removeLast();
    }

    public int peek() {
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.offerLast(stack2.removeLast());
            }
        }
        return stack1.peekLast();
    }

    public boolean empty() {
        boolean isStack1Empty = stack1.isEmpty();
        boolean isStack2Empty = stack2.isEmpty();
        return isStack1Empty&&isStack2Empty;
    }
}
