package a22;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/17 20:52
 */
class Solution {
    List<String> list=new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        back(new StringBuilder(),0,0,n);
        return list;
    }

    private void back(StringBuilder stringBuilder,int left,int right,int n){
        if(right==n){
            list.add(stringBuilder.toString());
            return;
        }
        if(left<n){
            stringBuilder.append("(");
            back(stringBuilder,left+1,right,n);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if(right<n&&right<=left&&left!=0){
            stringBuilder.append(")");
            back(stringBuilder,left,right-1,n);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
