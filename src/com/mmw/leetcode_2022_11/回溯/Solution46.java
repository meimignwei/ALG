package src.com.mmw.leetcode_2022_11.回溯;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.print.Collation;

import java.util.*;
public class Solution46 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }
        dfs(0, temp);
        return res;
    }

    private void dfs(int i,List<Integer> temp) {
        if (i == temp.size()-1) {
            res.add(new ArrayList<Integer>(temp));
        }
        for (int j = i; j < temp.size(); j++) {
            Collections.swap(temp,i,j);
            //这里为何是i+1,而不是j+1
            dfs(i+1,temp);
            Collections.swap(temp,i,j);
        }
    }

    public static void main(String[] args) {
        Solution46 s = new Solution46();
        System.out.println(s.permute(new int[]{1,2,3}));
    }

}
