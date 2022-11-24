package src.com.mmw.jianzhi;

public class Solution57 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[2];
        }
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right -= 1;
            } else if (nums[left] + nums[right] < target) {
                left += 1;
            } else {
                break;
            }
        }
        res[0] = left;
        res[1] = right;
        return res;
    }
}
