package src.com.mmw.jianzhi;

import sun.misc.Queue;

import java.util.*;
class MaxQueue {
    Deque<Integer> queue1;
    Deque<Integer> queue2;
    public MaxQueue() {
        this.queue1 = new LinkedList<Integer>();
        this.queue2 = new LinkedList<Integer>();
    }

    public int max_value() {
        int res = -1;
        if (queue2.size() > 0) {
            res = queue2.peekFirst();
        }
        return res;
    }

    public void push_back(int value) {
        queue1.offer(value);
        while (queue2.size() > 0 && queue2.peekLast() < value) {
            queue2.removeLast();
        }
        queue2.offer(value);
    }

    public int pop_front() {
        if (queue1.size() > 0) {
            if (queue2.size() > 0 && Objects.equals(queue2.peekFirst(), queue1.peekFirst())) {
                queue2.removeFirst();
            }
            return queue1.removeFirst();
        } else {
            return -1;
        }

    }

}
