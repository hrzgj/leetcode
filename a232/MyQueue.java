package a232;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/5 16:01
 */
public class MyQueue {
    LinkedList<Integer> linkedList;
    LinkedList<Integer> res;
    /** Initialize your data structure here. */
    public MyQueue() {
        res=new LinkedList<>();
        linkedList=new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        linkedList.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(res.isEmpty()){
            while (!linkedList.isEmpty()){
                res.push(linkedList.pop());
            }
        }
        return res.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(res.isEmpty()){
            while (!linkedList.isEmpty()){
                res.push(linkedList.pop());
            }
        }
        return res.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return linkedList.isEmpty()&&res.isEmpty();
    }
}
