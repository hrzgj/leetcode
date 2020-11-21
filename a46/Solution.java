package a46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/5/27 20:44
 */
public class Solution {
    List<List<Integer>> outPut=new ArrayList<>();
    //nums大小
    int n;

    boolean[] user;
    public List<List<Integer>> permute(int[] nums) {
        n=nums.length;
        user=new boolean[n];
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int num:nums){
            result.add(num);
        }
        back(nums,new LinkedList<>());
        return outPut;
    }

    public void back(int[] nums,List<Integer> list){
        if(nums.length==list.size()){
            outPut.add(new LinkedList<>(list));
            return;
        }
        for(int i=0;i<n;i++){
            if(user[i]){
                continue;
            }
            user[i]=true;
            list.add(nums[i]);
            back(nums,list);
            list.remove(list.size()-1);
            user[i]=false;
        }
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
