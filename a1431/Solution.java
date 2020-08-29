package a1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/6/1 21:16
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int biggest=candies[0];
        for(int i=1;i<candies.length;i++){
            if(biggest<candies[i]){
                biggest=candies[i];
            }
        }
        List<Boolean> list=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=biggest){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }

}
