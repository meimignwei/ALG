package src.com.mmw.jianzhi.数学;
/*
此处需求注意两点：
1.负数的处理
2.超过int范围的边界处理
* */
public class Solution16 {
    public double myPow(double x, int n) {
        long temp = n;
        if (temp < 0) {
            temp = -temp;
            x = 1 / x;
        }
        double res = 1.0;
        while (temp > 0) {
            if (temp % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            temp = temp >> 1;
        }
        return res;
//        if (n < 0) {
//            return 1 / res;
//        } else {
//            return res;
//        }
    }

    public static void main(String[] args) {
        System.out.println(4&1);
        Solution16 s = new Solution16();
        System.out.println(s.myPow(2.00000,-2147483648));
    }

}
