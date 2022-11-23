package src.com.mmw.jianzhi.数学;

public class Solution15 {
    public int hammingWeight(int n) {
        int count = 0;
        //这里为啥不能大于0？
        while (n != 0) {
            n = n & (n - 1);
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.hammingWeight(294967293));
    }

}
