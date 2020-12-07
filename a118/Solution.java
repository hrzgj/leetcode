package a118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/6 9:21
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>(numRows);
        List<Integer> first=new ArrayList<>();
        first.add(1);
        res.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> temp=res.get(i-1);
            List<Integer> newList=new LinkedList<>();
            for(int j=0;j<temp.size()+2;j++){
                int left=j>0?temp.get(j-1):0;
                int right=j<temp.size()?temp.get(j):0;
                newList.add(left+right);
            }
            res.add(newList);
        }
        return res;
    }
}
