package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        //构建小顶堆
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]- o2[1];
            }
        });

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            }else {
                hashMap.put(nums[i], 1);
            }
        }

        for (Integer key : hashMap.keySet()){
            if (queue.size() == k){
                if (queue.peek()[1] < hashMap.get(key)){
                    queue.poll();
                    queue.add(new int[]{key,hashMap.get(key)});
                }
            }else{
                queue.add(new int[]{key,hashMap.get(key)});
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < res.length;++i){
            res[i] = queue.poll()[0];
        }
        return res;
    }

}
