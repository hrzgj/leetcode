package a90;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/10 10:58
 */
public class Solution {
    List<List<Integer>> res=new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res.add(new LinkedList<>());
        Arrays.sort(nums);
        back(new LinkedList<>(),0,nums);
        return res;
    }

    private void back(List<Integer> list,int index,int[] nums){
        if(index==nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            res.add(new LinkedList<>(list));
            back(list,i+1,nums);
            list.remove(list.size()-1);
        }
    }
}
