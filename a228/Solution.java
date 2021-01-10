package a228;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/1/10 9:38
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new LinkedList<>();
        int n=nums.length,index=1;
        if(n==0){
            return list;
        }
        int temp=nums[0],begin=0;
        while (index<n){
            if(nums[index]==temp+1){
                temp=nums[index];
                index++;
            }else {
                String s=null;
                if(begin==index-1){
                    s=String.valueOf(nums[begin]);
                }else {
                    s = nums[begin] + "->" + nums[index - 1];
                }
                list.add(s);
                temp=nums[index];
                begin=index;
                index++;
            }
        }
        if(begin<n-1) {
            String s=nums[begin]+"->"+nums[n-1];
            list.add(s);
        }else {
            list.add(String.valueOf(nums[begin]));
        }
        return list;
    }
}
