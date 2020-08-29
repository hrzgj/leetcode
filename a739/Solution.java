package a739;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: chenyu
 * @date: 2020/6/11 8:30
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
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
}
