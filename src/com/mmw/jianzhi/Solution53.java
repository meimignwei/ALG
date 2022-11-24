package src.com.mmw.jianzhi;

public class Solution53 {
    public int missingNumber(int[] nums) {
        //注意测试用例[0]
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        //注意测试用例：[0,1]返回2
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                res = i;
                break;
            }
        }
        return res;
    }
}
