package src.com.mmw.jianzhi;
;

import java.util.*;
public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if (queue.size() < k) {
                queue.offer(arr[i]);
            } else {
                //这里使用peek表示queue必须不能为空
                if (!queue.isEmpty() && queue.peek() > arr[i]) {
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
        }
        int[] res = new int[queue.size()];
        int index = 0;
        for (Integer ele : queue) {
            res[index++] = ele;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution40 s = new Solution40();
        System.out.println(Arrays.toString(s.getLeastNumbers(new int[]{2,1,1,0},1)));
    }

}
