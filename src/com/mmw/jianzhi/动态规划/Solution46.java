package src.com.mmw.jianzhi.动态规划;

public class Solution46 {
    public int translateNum(int num) {
        String res = String.valueOf(num);
        if (num < 10) return 1;
        int[] dp = new int[res.length()];
        dp[0] = 1;
        if (Integer.parseInt(res.substring(0, 2)) <= 25) {
            dp[1] = 2;
        } else {
            dp[1] = 1;
        }
        for (int i = 2; i < res.length(); i++) {
            if (Integer.parseInt(res.substring(i - 1, i + 1)) <= 25
                    && Integer.parseInt(res.substring(i - 1, i + 1)) >= 10) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[res.length() - 1];
    }

    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a.substring(0,1));
        Solution46 s = new Solution46();
        System.out.println(s.translateNum(12258));
    }

}
