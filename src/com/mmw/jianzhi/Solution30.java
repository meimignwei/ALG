package src.com.mmw.jianzhi;
import java.util.*;
class MinStack {
    /**
     * initialize your data structure here.
     */
    private  LinkedList<Integer> stack = null;
    private LinkedList<Integer> stackMin = null;
    public MinStack() {
        stack = new LinkedList<Integer>();
        stackMin = new LinkedList<Integer>();
    }

    public void push(int x) {
        stackMin.push(x);
        if (!stack.isEmpty() || stack.peek() <= x) {
            stack.push(stack.peek());
        } else {
            stack.push(x);
        }

    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stackMin.peek();

    }

    public int min() {
        return stack.peek();
    }
}
