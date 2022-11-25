package src.com.mmw.jianzhi.数学;

import java.util.*;
public class Solution45 {
    public String minNumber(int[] nums) {
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(temp,(x,y) -> (x+y).compareTo(y+x));
        StringBuilder res = new StringBuilder();
        for(String s : temp)
            res.append(s);
        return res.toString();
    }


    /*
    *
    * 快速排序
    * */

    public String minNumberQuickSort(int[] nums) {
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = String.valueOf(nums[i]);
        }
        quicksort(temp, 0, temp.length-1);
        StringBuilder res = new StringBuilder();
        for(String s : temp)
            res.append(s);
        return res.toString();
    }

    private void quicksort(String[] temp, int start, int end) {
        if (start >= end) return;
        int i = start;
        int j = end;
        String a = temp[start];
        while (i < j) {
            while ((temp[j] + temp[start]).compareTo(temp[start] + temp[j]) >= 0 && i < j) {
                j -= 1;
            }
            while ((temp[i] + temp[start]).compareTo(temp[start] + temp[i]) <= 0 && i < j) {
                i += 1;
            }
            String tmp = temp[i];
            temp[i] = temp[j];
            temp[j] = tmp;
        }
        temp[start] = temp[i];
        temp[i] = a;
        quicksort(temp,start,i-1);
        quicksort(temp,i+1,end);
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        Solution45 s = new Solution45();
        s.quicksort(new String[]{"1","2","3","1"},0,3);
    }
}
