package a47;

import com.sun.org.apache.bcel.internal.generic.LLOAD;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/18 10:58
 */
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    boolean[] use;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        use=new boolean[nums.length];
        back(nums,new ArrayList<>());
        return lists;
    }
    private void back(int[] nums,List<Integer> list){
        if(list.size()==nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(use[i]||(i>0&&nums[i-1]==nums[i]&&!use[i-1])){
                continue;
            }
            list.add(nums[i]);
            use[i]=true;
            back(nums,list);
            use[i]=false;
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.permuteUnique(new int[]{1,1,2});
    }
}
