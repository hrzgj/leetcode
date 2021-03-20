package a384;

import java.util.Random;

/**
 * @author: chenyu
 * @date: 2021/3/20 10:02
 */
public class Solution {
    int[] newNum;
    int[] oldNum;
    Random random=new Random();
    public Solution(int[] nums) {
        oldNum=nums;
        newNum=new int[nums.length];
        System.arraycopy(oldNum,0,newNum,0,nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return oldNum;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<oldNum.length;i++){
            int index=random.nextInt(oldNum.length);
            int temp=newNum[i];
            newNum[i]=newNum[index];
            newNum[index]=temp;
        }
        return newNum;
    }
}
