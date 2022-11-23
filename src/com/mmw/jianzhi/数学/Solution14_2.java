package src.com.mmw.jianzhi.数学;
/*
*
*  根据二分法计算原理，至少要保证变量 x 和 rem 可以正确存储 2的64次方>10000000072>2^32 因此我们选取 long 类型。
*/
public class Solution14_2 {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        long ret = 1;
        int stage = n / 3;
        for (int i = 1; i < stage; i++) {
            ret = (ret * 3) % 1000000007;
        }
        System.out.println((int)(ret * 4 % 1000000007));
        if (n%3==0) return (int) (ret * 3 % 1000000007);
        else if (n%3 == 1)
            return (int)(ret * 4 % 1000000007);
        else {
            return (int)(ret * 6 % 1000000007);
        }
    }

    public static void main(String[] args) {
        Solution14_2 s = new Solution14_2();
        System.out.println(s.cuttingRope(127));
    }

}
