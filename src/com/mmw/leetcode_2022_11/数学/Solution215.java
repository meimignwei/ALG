package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() == k) {
                if (queue.peek() < nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }
            } else {
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }
}
