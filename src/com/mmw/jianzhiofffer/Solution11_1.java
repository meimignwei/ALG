package com.mmw.jianzhiofffer;

public class Solution11_1 {
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (numbers[right] < numbers[mid]){
                left = mid+1;
            }
            else if (numbers[right] > numbers[mid]){
                /*此处不能mid -1
                * */
                right = mid;
            }
            else {
                int min = numbers[left];
                for (int i = left; i <= right; i++) {
                    if (numbers[i] < min){
                        min = numbers[i];
                    }
                }
                return min;
            }
        }
        return numbers[left];
    }

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{2,2,2,0,1}));

    }
}
