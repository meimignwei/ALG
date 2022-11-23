package src.com.mmw.jianzhi.数学;

import java.util.Arrays;

public class Solution21 {
    public int[] exchange(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1) {
                left += 1;
            }
            while (left < right && nums[right] % 2 == 0) {
                right -= 1;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();
        System.out.println(Arrays.toString(s.exchange(new int[]{1, 2, 3, 4})));
    }

}
