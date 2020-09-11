package a40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/10 8:13
 */
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    List<Integer> list=new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(candidates,target,0);
        return lists;
    }

    private void back(int[] candidates, int target,int j){
        if(target<0){
            return;
        }
        if(target==0){
            lists.add(new ArrayList<>(list));
            return;
        }

        for(int i=j;i<candidates.length;i++){
            if(i>j&&candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            back(candidates,target-candidates[i],i+1);
            list.remove(list.size()-1);
        }
    }
}
