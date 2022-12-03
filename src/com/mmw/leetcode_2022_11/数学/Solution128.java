package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            int tmp = nums[i];
            while (set.contains(tmp)) {
                temp++;
                set.remove(tmp);
                tmp -= 1;
            }
            //由于tmp一直在变化，因此需要重新赋值。
            tmp = nums[i] + 1;
            while (set.contains(tmp)) {
                temp++;
                set.remove(tmp);
                tmp+=1;
            }
            count = Math.max(count, temp);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution128 s = new Solution128();
        System.out.println(s.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

}
