package a456;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/3/24 9:24
 */
public class Solution {

    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Deque<Integer> candidateK = new LinkedList<Integer>();
        candidateK.push(nums[n - 1]);
        int maxK = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] < maxK) {
                return true;
            }
            while (!candidateK.isEmpty() && nums[i] > candidateK.peek()) {
                maxK = candidateK.pop();
            }
            if (nums[i] > maxK) {
                candidateK.push(nums[i]);
            }
        }

        return false;
    }

    boolean flag=false;
    List<Integer> list=new LinkedList<>();
    public boolean find132pattern2(int[] nums) {
        back(nums,0);
        return flag;
    }

    private void back(int[] nums,int index){
        if(flag){
            return;
        }
        if(list.size()==3){
            flag=true;
            return;
        }
        for(int i=index;i<nums.length;i++){
            if (list.size() != 0) {
                if(list.size()==1){
                    if(nums[i]<list.get(0)){
                        continue;
                    }
                }else if(list.size()==2){
                    if(nums[i]<list.get(0) || nums[i] >list.get(0)){
                        continue;
                    }
                }
            }
            list.add(nums[i]);
            back(nums, i + 1);
            if (flag) {
                return;
            }
            list.remove(list.size() - 1);
        }
    }
}
