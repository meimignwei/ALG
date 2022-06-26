package com.mmw.jianzhiofffer;

import java.util.LinkedList;


public class CQueue {
    LinkedList<Integer> A, B;

    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.push(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()) return B.removeFirst();
        while (!A.isEmpty()){
            B.push(A.poll());
        }
        if(B.isEmpty()) return -1;
        return B.removeFirst();
    }
}
