package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solurion15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            if (nums[i] > 0) {
                break;
            }
            while (left < right) {
                List<Integer> tmp = new ArrayList<Integer>();
                if (nums[i] + nums[left] + nums[right] == 0) {
                    tmp.add(nums[i]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    res.add(tmp);
                    //去重
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solurion15 s = new Solurion15();
        System.out.println(s.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
