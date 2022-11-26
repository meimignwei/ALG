package src.com.mmw.leetcode_2022_11.双指针;

public class Solution11 {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length-1;
        int res = 0;
        while (left < right) {
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            if (left < right && height[left] < height[right]) {
                left += 1;
            } else if (left < right && height[right] <= height[left]) {
                right -= 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
