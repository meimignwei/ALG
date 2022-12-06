package src.com.mmw.leetcode_2022_11.数学.单调栈;

import java.util.*;
public class Solution_739 {
    Stack<Integer> stack = new Stack<>();
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int tmp = stack.pop();
                ans[tmp] = i - tmp;
            }
            stack.push(i);
        }
        return ans;
    }

}
