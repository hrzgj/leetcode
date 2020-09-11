package a216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/11 10:46
 */
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    List<Integer> list=new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        back(k,n,0);
        return lists;
    }

    private  void  back(int k,int n,int index){
        if(k<0||n<0){
            return;
        }
        if(n==0&&k==0){
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=9;i++){
            list.add(i);
            back(k-1,n-i,i+1);
            list.remove(list.size()-1);
        }
    }
}
