package src.com.mmw.jianzhi;
import java.util.*;
public class Solution39 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i< nums.length;i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        Integer res = null;
        for (Integer key : map.keySet()) {
            if (map.get(key) > (nums.length / 2)) {
                res = key;
            }
        }
        return res;
    }
}
