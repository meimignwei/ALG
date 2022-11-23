package src.com.mmw.jianzhi.数学;
/*
* 重点关注
* */
public class Solution44 {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
//        System.out.println(n);
//        System.out.println(digit);
//        System.out.println(start);
        long num = start + (n - 1) / digit;
//        System.out.println(num);
        String temp = String.valueOf(num);
//        System.out.println(temp);
//        System.out.println(temp.charAt((n - 1) % digit));
        return Integer.parseInt(String.valueOf(temp.charAt((n - 1) % digit)));
    }

    public static void main(String[] args) {
        Solution44 s = new Solution44();
        System.out.println(s.findNthDigit(1000000000));
    }

}
