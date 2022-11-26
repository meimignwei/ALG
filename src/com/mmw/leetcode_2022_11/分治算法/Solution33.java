package src.com.mmw.leetcode_2022_11.分治算法;

public class Solution33 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < nums[r]) {
                if (target > nums[r] || target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (nums[mid] > nums[r]) {
                //注意点这等于号：测试用例：[3,5,1]
                if (nums[l] <= target && nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        if (nums[l] == target) {
            return l;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution33 s = new Solution33();
        System.out.println(s.search(new int[]{3,5,1},3));
    }
}
