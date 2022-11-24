package src.com.mmw.jianzhi.数学;

import java.util.Arrays;

public class Solution60 {
    public double[] dicesProbability(int n) {
        double[] inital = new double[6];
        Arrays.fill(inital,1/6.0);
        double[] temp1 = inital;
        for (int i = 2; i <= n ; i++) {
            //排错这个i,而不是这个n
            double[] temp = new double[5*i +1];
            System.out.println("i" + i);
            System.out.println(temp.length);
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < temp1.length; k++) {
                    temp[j + k] += inital[j] * temp1[k];
//                    System.out.println(temp1.length);
//                    System.out.println("j" + j);
//                    System.out.println("k" + k);
                }
            }
            temp1 = temp;
            System.out.println(temp1.length);
        }
        return temp1;
    }

    public static void main(String[] args) {
        Solution60 s = new Solution60();
        System.out.println(Arrays.toString(s.dicesProbability(3)));
    }
}
