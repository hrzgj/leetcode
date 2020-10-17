package a52;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: chenyu
 * @date: 2020/10/17 10:22
 */
public class Solution {
    Set<Integer> columns=new HashSet<>();
    Set<Integer> leftLine=new HashSet<>();
    Set<Integer> rightLine=new HashSet<>();
    int result=0;
    public int totalNQueens(int n) {
        back(0,n);
        return result;
    }

    private void back(int row,int n){
        if(row==n){
            result++;
            return;
        }
        for(int i=0;i<n;i++){
            if(columns.contains(i)){
                continue;
            }
            int left=row+i;
            if(leftLine.contains(left)){
                continue;
            }
            int right=row-i;
            if(rightLine.contains(right)){
                continue;
            }
            leftLine.add(left);
            rightLine.add(right);
            columns.add(i);
            back(row+1,n);
            leftLine.remove(left);
            rightLine.remove(right);
            columns.remove(i);
        }
    }
}
