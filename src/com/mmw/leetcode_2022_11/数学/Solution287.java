package src.com.mmw.leetcode_2022_11.数学;


/*
* 重点关注
* */
public class Solution287 {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution287 s = new Solution287();
        System.out.println(s.findDuplicate(new int[]{1,3,4,2,2}));
    }

}
