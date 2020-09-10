package a39;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/9 10:20
 */
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(target,new LinkedList<>(),0,0,candidates);
        return lists;
    }

    private void back(int target,List<Integer> list,int sum,int j,int[] candidates){
        if(sum>target){
            return ;
        }
        if(sum==target){
            lists.add(new ArrayList<>(list));
            return ;
        }
        for(int i=j;i<candidates.length;i++){
            if(sum+candidates[i]>target){
                return ;
            }
            sum += candidates[i];
            list.add(candidates[i]);
            back(target,list,sum,i,candidates);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.combinationSum(new int[]{2,3,5},8);
    }
}



