package com.mmw.jianzhiofffer;
/*
需要另外一个最小栈存储最小值，如果最小值相等，也需要放入最小栈中
最小栈的长度要源数组长度保持一致
* */

import java.util.LinkedList;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    LinkedList<Integer> linkedList;
    LinkedList<Integer> B;
    public MinStack() {
        linkedList = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void push(int x) {
        linkedList.push(x);
        if (B.isEmpty() || B.peek() >= x){
            B.push(x);
        }else{
            B.push(B.peek());
        }
    }

    public void pop() {
        linkedList.pop();
        B.pop();


    }

    public int top() {
        return linkedList.peek();

    }

    public int min() {
        return B.peek();
    }
}
