package src.com.mmw.jianzhi;

public class Solution43_1 {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String temp = String.valueOf(i);
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '1') {
                    count += 1;
                }
            }
        }
        return count;
    }
}
