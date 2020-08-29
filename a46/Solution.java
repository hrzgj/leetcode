package a46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/5/27 20:44
 */
public class Solution {
    List<List<Integer>> outPut=new ArrayList<>();
    //nums大小
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n=nums.length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int num:nums){
            result.add(num);
        }
        backtrack(0,result);
        return outPut;
    }
    public void backtrack(int first,List<Integer> result){
        if(first==n){
            outPut.add(new ArrayList<>(result));
        }
        for(int i=first;i<n;i++){
            Collections.swap(result,first,i);
            backtrack(first+1,result);
            Collections.swap(result,first,i);
        }
    }
}
