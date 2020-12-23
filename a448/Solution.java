package a448;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/23 9:54
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]*=-1;
            }

        }
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
