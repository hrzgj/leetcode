package a217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: chenyu
 * @date: 2020/12/13 10:12
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
}
