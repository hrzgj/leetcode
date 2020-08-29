package a287;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/5/26 21:05
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int[] temp=new int[nums.length];
        for (int num : nums) {
            temp[num-1] ++;
        }
        int i;
        for( i=0;i<temp.length;i++){
            if(temp[i]>=2){
                break;
            }
        }
        return i+1;
    }
}

    class Solution2 {
        List<List<Integer>> output = new ArrayList();
        //n为数组大小，k为遍历数组的第几个
        int n, k;


        public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
            // if the combination is done
            if (curr.size() == k) {
                output.add(new ArrayList(curr));
            }

            for (int i = first; i < n; ++i) {
                // add i into the current combination
                curr.add(nums[i]);
                // use next integers to complete the combination
                backtrack(i + 1, curr, nums);
                // backtrack
                curr.remove(curr.size() - 1);
            }
        }

        public List<List<Integer>> subsets(int[] nums) {
            n = nums.length;
            for (k = 0; k < n + 1; ++k) {
                backtrack(0, new ArrayList<Integer>(), nums);
            }
            return output;
        }
    }
