package a989;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/1/22 9:29
 */
public class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> list=new LinkedList<>();
        int n=A.length;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            int x=A[i];
            int y=K%10;
            list.push((x+y+ans)%10);
            ans=(x+y+ans)/10;
            K/=10;
        }
        while (K!=0||ans!=0){
            list.push((K%10+ans)%10);
            ans=(K%10+ans)/10;
            K/=10;
        }
        return list;
    }
}
