package src.com.mmw.leetcode_2022_11.数学;

import java.util.Arrays;

public class Solution739 {

    /*
    * 超出时间限制
    * */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    //关键
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution739 s = new Solution739();
        System.out.println(Arrays.toString(s.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

}
