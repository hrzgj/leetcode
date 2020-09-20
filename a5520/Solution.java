package a5520;

import java.util.HashSet;

/**
 * @author: chenyu
 * @date: 2020/9/20 13:08
 */
public class Solution {
    int result=Integer.MIN_VALUE;
    HashSet<String> hashSet=new HashSet<>();
    public int maxUniqueSplit(String s) {
        back(s,0,0);
        return result;
    }

    private void back(String s,int index,int result){
        if(index==s.length()){
            this.result=Math.max(result,this.result);
            return;
        }
        for(int i=index;i<s.length();i++){
            if(hashSet.contains(s.substring(index,i+1))){
                continue;
            }
            hashSet.add(s.substring(index,i+1));
            back(s,i+1,result+1);
            hashSet.remove(s.substring(index,i+1));
        }

    }
}
