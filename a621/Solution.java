package a621;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/10/18 9:36
 */
public class Solution {
    public int leastInterval2(char[] tasks, int n) {
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
    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        int max=0;
        for (char c : tasks) {
            cnt[c - 'A']++;
            max = Math.max(max, cnt[c - 'A']);
        }
        int ret = (max - 1) * (n + 1);
        for (int i = 0; i < 26&& cnt[i]>0; i++) {
            if (cnt[i] == max) {
                ret++;
            }
        }
        return Math.max(ret, tasks.length);
    }
}
