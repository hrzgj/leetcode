package a51;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/9/3 9:27
 */
public class Solution {
    Set<Integer> columns=new HashSet<>();
    Set<Integer> leftLine=new HashSet<>();
    Set<Integer> rightLine=new HashSet<>();
    List<List<String>> lists=new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        Map<Integer,Integer> queens=new HashMap<>();
        back(0,n,queens);
        return lists;
    }

    private void back(int row,int n,Map<Integer,Integer>  queens){
        if(row==n){
            List<String> list=new LinkedList<>();
            for(int i=0;i<n;i++){
                char[] chars=new char[n];
                Arrays.fill(chars,'.');
                chars[queens.get(i)]='Q';
                list.add(new String(chars));
            }
            lists.add(list);
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
            queens.put(row,i);
            columns.add(i);
            leftLine.add(left);
            rightLine.add(right);
            back(row+1,n,queens);
            queens.remove(row);
            columns.remove(i);
            leftLine.remove(left);
            rightLine.remove(right);
        }
    }
}
