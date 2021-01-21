package offer31;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/1/21 10:51
 */
public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque=new LinkedList<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            deque.push(pushed[i]);
            if(deque.peek()==popped[j++]){
                deque.pop();
            }
        }
        while (!deque.isEmpty()&&j<popped.length){
            if(deque.peek()!=popped[j++]){
                return false;
            }
            deque.pop();
        }
        return true;
    }
}
