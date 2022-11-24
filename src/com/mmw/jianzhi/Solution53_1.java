package src.com.mmw.jianzhi;

import javax.xml.bind.annotation.XmlID;

public class Solution53_1 {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count += 1;
            }
        }
        return count;
    }
    //二分查找
    public int search1(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int index = binarySearch(nums, target);
        int l = index;
        int r = index;
        //当出现索引的增加或者减少时，需要判断边界条件
        while (l >= 0 && nums[l] == target) {
            l--;
        }
        //当出现索引的增加或者减少时，需要判断边界条件
        while (r < nums.length && nums[r] == target) {
            r++;
        }
        if (r - l - 1 == -1) {
            return 0;
        } else {
            return r - l - 1;
        }
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution53_1 s = new Solution53_1();
        System.out.println(s.binarySearch(new int[]{5,7,7,8,8,10},6));
        System.out.println(s.search1(new int[]{5,7,7,8,8,10},8));
    }
}
