package a621;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/10/18 9:36
 */
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] nums=new int[26];
        for(char c:tasks){
            nums[c-'A']++;
        }
        int result=0;
        Arrays.sort(nums);
        while (nums[25]>0){
            for(int i=0;i<n;i++){
                if(nums[25]==0){
                    break;
                }
                if(i<=25&&nums[25-i]>0){
                    nums[25-i]--;
                }
                result++;
            }
            Arrays.sort(nums);
        }
        return result;
    }
}
