package a765;

/**
 * @author: chenyu
 * @date: 2021/2/15 19:26
 */
public class Solution {
    public int minSwapsCouples(int[] row) {
        int count=row.length/2-1;
        for(int i=0;i<row.length;i+=2){
            if(row[i]%2==0){
                if(row[i+1]-1==row[i]){
                    count--;
                }
            }else {
                if(row[i+1]+1==row[i]){
                    count--;
                }
            }
        }
        return count;
    }
}
