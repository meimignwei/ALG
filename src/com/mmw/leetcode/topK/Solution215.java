package com.mmw.leetcode.topK;

import java.util.PriorityQueue;

public class Solution215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> deque = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (deque.size() == k) {
                if (deque.peek() < nums[i]) {
                    deque.poll();
                    deque.add(nums[i]);
                }
            } else {
                deque.add(nums[i]);
            }
        }
        return deque.peek();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }


}
