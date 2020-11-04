package a57;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/11/4 9:31
 */
public class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            if(intervals.length<=0){
                return new int[][]{{newInterval[0],newInterval[1]}};

            }
            LinkedList<int[]> list=new LinkedList<>();
            boolean f=false;
            for(int i=0;i<intervals.length;){
                int[] interval=intervals[i];
                int left=interval[0],right=interval[1];
                if(right<newInterval[0]){
                    if(!f){
                        list.add(newInterval);
                        f=true;
                    }
                    list.add(interval);
                }else if(left>newInterval[1]){
                    list.add(interval);
                }else {
                    f=true;
                    int[] temp=new int[2];
                    temp[0]=Math.min(newInterval[0],left);
                    while (i<intervals.length&&newInterval[1]>=intervals[i][0]){
                        i++;
                    }
                    temp[1]=Math.max(intervals[i-1][1],newInterval[1]);
                    list.add(temp);
                    continue;
                }
                i++;
            }
            if(!f){
                if(newInterval[1]<intervals[0][0]){
                    list.addFirst(newInterval);
                }else {
                    list.add(newInterval);
                }
            }
            int[][] ans = new int[list.size()][2];
            for (int i = 0; i < list.size(); ++i) {
                ans[i] = list.get(i);
            }

            return ans;
        }
}
