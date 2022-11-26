package src.com.mmw.leetcode_2022_11.数学;
import java.util.*;

/*
* 重点注意
* */
public class Solution31 {
    public void nextPermutation(int[] nums) {
        boolean flag = false;
        int index = nums.length-1;
        for (int i = nums.length-1; i >=1 ; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                flag = true;
                break;
            }
        }
        int temp = nums.length - 1;
        while (nums[index] > nums[temp]) {
            temp--;
        }
        swap(nums,index,temp);
        if (!flag) {
            sort(0, nums);
        } else {
            sort(index+1,nums);
        }
    }

    private void sort(int i, int[] nums) {
        Arrays.sort(nums,i,nums.length);
        System.out.println(Arrays.toString(nums));

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*
    * 优化
    * */

    public void nextPermutationOptimize(int[] nums) {
        int index = -1;
        int temp = nums.length - 1;
        //注意这里由于有i-1,因此i必须大于0
        for (int i = nums.length-1; i > 0 ; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) {
            sort(0, nums);
        } else {
            //注意这里相等的情况 比如测试用例[1,5,1]
            while (nums[index] > nums[temp]) {
                temp--;
            }
            swap(nums,index,temp);
            sort(index+1,nums);
        }
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();
        s.nextPermutation(new int[]{4,2,0,2,3,2,0});
        s.nextPermutationOptimize(new int[]{4,2,0,2,3,2,0});
    }

}
