package a131;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/3/7 9:22
 */
public class Solution {
    List<List<String>> res=new LinkedList<>();
    boolean[][] dp;
    public List<List<String>> partition(String s) {
        int n=s.length();
        dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],true);
        }
        back(0,s,new LinkedList<>());
        return res;
    }

    private void back(int index,String s,LinkedList<String> list){
        if(index==s.length()){
            res.add(new LinkedList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(dp[index][i]){
                list.add(s.substring(index,i+1));
                back(index,s,list);
                list.removeLast();
            }
        }

    }
}
