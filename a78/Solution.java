package a78;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/5/25 20:28
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        output.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> lists=new ArrayList<>();
            for(List<Integer> list:output){
                List<Integer> temp=new ArrayList<>(list);
                temp.add(num);
                lists.add(temp);
            }
            output.addAll(lists);
        }
        return output;
    }

}
