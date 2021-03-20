package a150;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/20 8:24
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque=new LinkedList<>();
        for(String s:tokens){
            if("+".equals(s)){
                deque.push(deque.pop()+deque.pop());
            }else if("-".equals(s)){
                int num=deque.pop();
                deque.push(deque.pop()-num);
            }
            else if("*".equals(s)){
                int num=deque.pop();
                deque.push(deque.pop()*num);
            }
            else if("/".equals(s)){
                int num=deque.pop();
                deque.push(deque.pop()/num);
            }else {
                deque.push(Integer.valueOf(s));
            }
        }
        return deque.peek();
    }
}
