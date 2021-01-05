package a830;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/1/5 9:11
 */
public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res=new LinkedList<>();
        if(s.length()<3){
            return res;
        }
        for(int i=0;i<s.length()-2;){
            if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)==s.charAt(i+2)){
                List<Integer> list=new LinkedList<>();
                list.add(i);
                char c=s.charAt(i);
                i+=2;
                while (i<s.length()&&s.charAt(i)==c){
                    i++;
                }
                list.add(i-1);
                res.add(list);
            }else{
                i++;
            }
        }
        return res;
    }
}
