package src.com.mmw.leetcode_2022_11.回溯;

public class Solution494 {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(0,0, nums, target);
        return count;
    }

    private void dfs(int start, int sum, int[] nums, int target) {
        if (start == nums.length && target == sum) {
            count += 1;
            return;
        }
        if (start >= nums.length) return;
        dfs(start +1,sum + nums[start],nums,target);
        dfs(start + 1,sum - nums[start],nums,target);
    }

    public static void main(String[] args) {
        Solution494 s = new Solution494();
        System.out.println(s.findTargetSumWays(new int[]{1,1,1,1,1},3));
    }

}
