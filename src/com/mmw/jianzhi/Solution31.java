package src.com.mmw.jianzhi;

import java.util.*;
public class Solution31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index += 1;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();
        System.out.println(s.validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));
    }
}
