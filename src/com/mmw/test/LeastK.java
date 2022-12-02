package src.com.mmw.test;

import java.util.*;
public class LeastK {
    public static int[] getLeastKNumbers(int[] input, int k) {
        PriorityQueue<Integer> queue  = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        if(input.length == 0) return new int[0];
        for(int i= 0; i< input.length;i++){
            if(queue.size() == k){
                System.out.println(queue.peek());
                if(queue.peek() > input[i]){
                    queue.poll();
                    queue.add(input[i]);
                }
            }else{
                queue.add(input[i]);
            }
        }
        int[] res = new int[k];
        int index = 0;
        for(Integer ele:queue){
            res[index ++] = ele;
        }
        return res;
    }

    public static void main(String[] args) {
        LeastK s = new LeastK();
        System.out.println(Arrays.toString(s.getLeastKNumbers(new int[]{10, 4, 5, 1, 6, 2, 7, 3, 8}, 4)));
    }
}
