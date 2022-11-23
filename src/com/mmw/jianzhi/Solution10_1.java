package src.com.mmw.jianzhi;


/*
* ac
* */
public class Solution10_1 {
    public int fib(int n) {
        int[] res = new int[n+1];
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n ; i++) {
            res[i] = (res[i - 1] + res[i - 2])%1000000007;
        }
        return (res[n] % 1000000007);
    }

    public static void main(String[] args) {
        Solution10_1 a = new Solution10_1();
        System.out.println(a.fib(48));
    }
}
