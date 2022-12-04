package src.com.mmw.leetcode_2022_11.栈;

import java.util.*;
public class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);
        if (stack2.size() != 0) {
            if (stack2.peek() > val) {
                stack2.push(val);
            } else {
                stack2.push(stack2.peek());
            }
        } else {
            stack2.push(val);
        }
    }

    public void pop() {
        if (!stack1.isEmpty()) {
            stack1.pop();
        }
        if (!stack2.isEmpty()) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }

}
