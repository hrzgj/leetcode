package a60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/5 10:23
 */
public class Solution {
    List<String> list=new LinkedList<>();
    boolean[] visit;
    int k;
    int n;
    public String getPermutation(int n, int k) {
        this.k=k;
        this.n=n;
        visit=new boolean[n];
        back(0,new StringBuilder());
        return list.get(k-1);
    }

    private void back(int first,StringBuilder stringBuilder){
        if(list.size()>=k){
            return;
        }
        if(first==n){
            list.add(stringBuilder.toString());
            return;
        }
        for(int i=1;i<=n;i++){
            if(visit[i]){
                continue;
            }
            visit[i]=true;
            stringBuilder.append(i);
            back(first+1,stringBuilder);
            visit[i]=false;
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
