package a1052;

/**
 * @author: chenyu
 * @date: 2021/2/23 9:49
 */
public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int total=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                total+=customers[i];
            }
        }
        int right=0,left=0,increase=0,maxIncrease=0;
        while (right<customers.length){
            if(right-left+1>X){
                if(grumpy[left]==1){
                    increase-=customers[left];
                }
                left++;
            }
            if(grumpy[right]==1){
                increase+=grumpy[right];
            }
            maxIncrease=Math.max(increase,maxIncrease);
            right++;
        }
        return total+maxIncrease;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.maxSatisfied(new int[]{1,0,1,2,1,1,7,5},new int[]{0,1,0,1,0,1,0,1},3);
    }
}
