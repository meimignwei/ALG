package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution152 {
    public int maxProduct(int[] nums) {
        //考虑到有负数
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //临时变量在这里起到的作用是：由于max经过赋值之后会变化，导致min在计算的时候会变化
            int max1 = max;
            ///////关键一步
            max = Math.max(nums[i], Math.max(min * nums[i], max1 * nums[i]));
            min = Math.min(nums[i], Math.min(nums[i] * min, max1 * nums[i]));
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution152 s = new Solution152();
        System.out.println(s.maxProduct(new int[]{-1,-2,-9,-6}));
    }

}
