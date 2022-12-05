package src.com.mmw.leetcode_2022_11.数学;

/*
重点关注
* */
import java.util.*;
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution283 s = new Solution283();
        s.moveZeroes(new int[]{0,1,0,3,12});
    }
}
