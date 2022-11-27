package src.com.mmw.leetcode_2022_11.map;

import java.util.*;
public class Solution49 {
    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> res = new ArrayList<List<String>>();
    public List<List<String>> groupAnagrams(String[] strs) {
        for (int i = 0; i < strs.length; i++) {;
            String temp = sort(strs[i]);
            System.out.println(temp);
            List<String> tmp;
            if (map.containsKey(temp)) {
                tmp = map.get(temp);
            } else {
                tmp = new ArrayList<>();
            }
            tmp.add(strs[i]);
            map.put(temp, tmp);
        }
        for (String ele : map.keySet()) {
            res.add(map.get(ele));
        }
        return res;
    }

    private String sort(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        //这里返回的string类型要注意，如果是toString会生成一个新的对象，map中的key就算值一样，但是key还是不同
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        String[] t = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution49 s = new Solution49();
        System.out.println(s.groupAnagrams(t));
    }

}
