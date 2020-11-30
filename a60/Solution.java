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
    String result=null;
    boolean[] visit;
    int[] fund;
    int k;
    int n;
    public String getPermutation(int n, int k) {
        fund=new int[n+1];
        this.k=k;
        this.n=n;
        visit=new boolean[n+1];
        fund[0]=1;
        for(int i=1;i<=n;i++){
            fund[i]=i*fund[i-1];
        }
        back(0,new StringBuilder());
        return result;
    }


    private void dfs(int first,StringBuilder stringBuilder){
        if(result!=null){
            return;
        }
        if(first==n){
            result=stringBuilder.toString();
            return;
        }
        int cut=fund[n-1-first];
        for(int i=1;i<=n;i++){
            if(visit[i]){
                continue;
            }
            if(cut<k){
                k-=cut;
                continue;
            }
            stringBuilder.append(i);
            visit[i]=true;
            dfs(first+1,stringBuilder);
        }
    }




    private void back(int first,StringBuilder stringBuilder){
        if(result!=null){
            return;
        }
        if(first==n){
            k--;
            if(k==0) {
                result = stringBuilder.toString();
            }
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
