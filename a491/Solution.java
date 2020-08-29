package a491;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/25 10:55
 */
public class Solution {
    List<List<Integer>> result=new LinkedList<>();
    List<Integer> temp=new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums,0,Integer.MIN_VALUE);
        return result;
    }

    private void dfs(int[] nums,int index,int last){
        if(nums.length==index){
            if(temp.size()>=2){
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        if(nums[index]>=last){
            temp.add(nums[index]);
            dfs(nums,index+1,nums[index]);
            temp.remove(temp.size()-1);
        }
        if(nums[index]!=last){
            dfs(nums,index+1,nums[index]);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num={4,2,7,7};
        solution.findSubsequences(num);
    }
}
