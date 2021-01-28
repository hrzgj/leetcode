package offer59;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2021/1/28 9:54
 */
public class MaxQueue {
    Deque<Integer> deque;
    Deque<Integer> help;

    public MaxQueue() {
        deque=new LinkedList<>();
        help=new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty()?-1:help.getFirst();
    }

    public void push_back(int value) {
        deque.offerLast(value);
        while (!help.isEmpty()&&help.peekLast()<value){
            help.pollLast();
        }
        help.offerLast(value);
    }

    public int pop_front() {
        if(deque.isEmpty()){
            return -1;
        }
        int val=deque.pollFirst();
        if(help.getFirst()==val){
            help.pollFirst();
        }
        return val;
    }
}
