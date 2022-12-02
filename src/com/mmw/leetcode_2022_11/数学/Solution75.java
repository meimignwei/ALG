package src.com.mmw.leetcode_2022_11.数学;

import java.util.Arrays;

public class Solution75 {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
             while (i < r && nums[i] == 2) {
                swap(nums,i,r);
                r--;
            }
            if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int i, int l) {
        int temp = nums[i];
        nums[i] = nums[l];
        nums[l] = temp;
    }

    public static void main(String[] args) {
        Solution75 s = new Solution75();
        s.sortColors(new int[]{2,1,2});
    }

}
