package com.mmw.jianzhiofffer;

public class Solution11 {
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int result = 0;
        while (numbers[left] >= numbers[right]){
            if(right - left <= 1) {
                result = right;
                break;
            }
            int mid = (left + right) / 2;
            if(numbers[left] == numbers[right] && numbers[right] == numbers[mid])
            {
                return search(numbers,left,right);
            }
            if (numbers[left] <= numbers[mid]){
                left = mid;
            }
            if (numbers[right] >= numbers[mid]){
                right = mid;
            }
        }
        return numbers[result];
    }
    public static int search(int[] numbers,int left,int right){
        int min = numbers[left];
        for (int i = left; i <= right; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{1,3,5}));
    }
}
