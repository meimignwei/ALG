package src.com.mmw.jianzhi.数学;

public class Solution67 {
    public int strToInt(String str) {
        String s = str.trim();
        if (s.length() == 0) {
            return 0;
        }
        int flag = 1;
        int index = 0;
        int res = 0;
        if (s.charAt(0) == '-') {
            flag = -1;
            index = 1;
        } else if (s.charAt(0) == '+') {
            flag = 1;
            index = 1;
        }
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) - '0' < 0 || s.charAt(i) - '9' > 0) {
                break;
            } else {
                res = res * 10 + ((int) s.charAt(i) - 48);
            }
            //如果没有这里，那么当字符串的值超过long的时候也会出错
            if (res > Integer.MAX_VALUE) {
                break;
            }
        }
        if (res * flag > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res * flag < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else return res * flag;

    }

    public static void main(String[] args) {
        Solution67 s = new Solution67();
        System.out.println(s.strToInt("   -42"));
        System.out.println((int) ('4'));
    }

}
