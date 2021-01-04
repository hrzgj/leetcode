package a739;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/6/11 8:30
 */
public class Solution {
    public int[] dailyTemperatures2(int[] T) {
        Stack<Integer> find=new Stack<>();
        int[] result=new int[T.length];
        find.push(0);
        for(int i=1;i<T.length;i++){
            if(find.isEmpty()){
                find.push(i);
            }else if(T[find.peek()]>=T[i]){
                find.push(i);
            }else if(!find.isEmpty()&&T[find.peek()]<T[i]){
                while (!find.isEmpty()&&T[find.peek()]<T[i]){
                    int a=find.pop();
                    result[a]=i-a;
                }
                find.push(i);
            }
        }
        return result;
    }

    public int[] dailyTemperatures(int[] T) {
        int[] res=new int[T.length];
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<T.length;i++){
            while (!linkedList.isEmpty()&&T[i]>T[linkedList.peek()]) {
                Integer j = linkedList.pop();
                res[j] = i - j;
            }
            linkedList.push(i);
        }
        return res;
    }
}
