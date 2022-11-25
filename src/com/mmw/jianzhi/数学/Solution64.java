package src.com.mmw.jianzhi.数学;

public class Solution64 {
    public int sumNums(int n) {
        if(n == 1) return 1;
        return sumNums(n-1) + n;
    }
}
