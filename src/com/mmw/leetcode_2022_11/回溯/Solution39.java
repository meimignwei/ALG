package src.com.mmw.leetcode_2022_11.回溯;
import java.util.*;

/*
* 重点关注
* */
public class Solution39 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> tmp = new ArrayList<Integer>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, 0,candidates, target);
        return res;
    }

    private void dfs(int i, int sum,int[] candidates, int target) {
        if (i >= candidates.length || sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList(tmp));
            return;
        }
        //针对有选择的进行回溯的时候，判断条件的选取
        dfs(i+1,sum,candidates,target);
        //注意这里
        if (target - sum >= candidates[i]) {
            tmp.add(candidates[i]);
            dfs(i, sum + candidates[i], candidates, target);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution39 s = new Solution39();
        System.out.println(s.combinationSum(new int[]{2,3,6,7},7));
    }



}
