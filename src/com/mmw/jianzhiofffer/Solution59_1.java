package com.mmw.jianzhiofffer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution59_1 {
    public static  int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0,j = i-k+1; i < nums.length; i++,j++) {
            if (j > 0 && deque.peekFirst() == nums[j-1]){
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] > deque.peekLast()){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            if (j >= 0){
                res[j] = deque.peekFirst();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(temp, 3)));

    }
}
