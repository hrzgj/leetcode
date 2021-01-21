package offer30;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/1/21 10:44
 */
public class MinStack {

    Deque<Integer> deque;
    Deque<Integer> min;


    /** initialize your data structure here. */
    public MinStack() {
        min=new LinkedList<>();
        deque=new LinkedList<>();
    }

    public void push(int x) {
        deque.push(x);
        if(min.isEmpty()){
            min.push(x);
        }else {
            if(min.peek()<x){
                min.push(min.peek());
            }else {
                min.push(x);
            }
        }
    }

    public void pop() {
        deque.pop();
        min.pop();
    }

    public int top() {
        if(deque.isEmpty()){
            return 0;
        }
        return deque.peek();
    }

    public int min() {
        if(min.isEmpty()){
            return 0;
        }
        return min.peek();
    }
}
