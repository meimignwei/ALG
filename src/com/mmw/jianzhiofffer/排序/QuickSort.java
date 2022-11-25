package src.com.mmw.jianzhiofffer.排序;

import java.util.Arrays;

public class QuickSort {
    public  static int[]  quickSort(int[] nums, int l, int r) {
        if( l >= r) return nums;
        int mid = patition(nums, l, r);
        quickSort(nums, l, mid-1);
        quickSort(nums, mid + 1, r);
        return nums;
    }

    private static int patition(int[] nums, int l, int r) {
        if (l >= r) return l;
        while (l < r) {
           while (l < r && nums[r] >= nums[l]) r -= 1;
           while (l < r && nums[l]  <= nums[r]) l += 1;
           swap(nums,l,r);
        }
        return l;
    }

    private static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{0, 1, 4, 2, 3, 6, 5};
        System.out.println(Arrays.toString(quickSort(temp, 0, temp.length - 1)));
    }


}
