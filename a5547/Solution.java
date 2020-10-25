package a5547;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/25 10:47
 */
public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> booleans=new ArrayList<>(l.length);
        for(int i=0;i<l.length;i++){
            if(Math.abs(l[i]-r[i])==1){
                booleans.add(i,true);
                continue;
            }
            booleans.add(i,chack(nums,l[i],r[i]));
        }
        return  booleans;
    }

    private boolean chack(int[] nums,int i,int j){
        int[] ints = Arrays.copyOfRange(nums, i, j + 1);
        Arrays.sort(ints);
        int s=ints[1]-ints[0];
        for(int k=1;k<ints.length-1;k++){
            if(ints[k+1]-ints[k]!=s){
                return false;
            }
        }
        return true;

    }
}
