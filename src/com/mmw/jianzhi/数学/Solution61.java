package src.com.mmw.jianzhi.数学;

import java.util.Arrays;
import java.util.*;

public class Solution61 {
    public boolean isStraight(int[] nums) {
        int count = 0;
        int temp = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if (nums[0] == 0) {
            count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count += 1;
                } else if (nums[i] == nums[i - 1]) {
                    return false;
                } else if (nums[i-1] != 0){
                    temp += nums[i] - nums[i - 1] - 1;
                }
            }
            return count - temp >= 0;
        } else {
            for (int i = 1; i <nums.length ; i++) {
                if (nums[i] - nums[i - 1] > 1 || nums[i] == nums[i-1]) {
                    return false;
                }
            }
            return true;
        }
    }
    /*
    * 优化
    * */
    public boolean isStraightOptimize(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                min = Math.min(nums[i], min);
                max = Math.max(nums[i], max);
                if (set.contains(nums[i])) {
                    return false;
                }
                set.add(nums[i]);
            }
        }
        return max - min < 5;

    }


    public static void main(String[] args) {
        Solution61 s = new Solution61();
        System.out.println(s.isStraightOptimize(new int[]{0,0,8,5,4}));
    }

}
